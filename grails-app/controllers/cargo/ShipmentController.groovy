package cargo

import org.springframework.dao.DataIntegrityViolationException

class ShipmentController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
    }

    def create() {
        [shipmentInstance: new Shipment(params)]
    }

    def save() {
        def shipmentInstance = new Shipment(params)
        if (!shipmentInstance.save(flush: true)) {
            render(view: "create", model: [shipmentInstance: shipmentInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'shipment.label', default: 'Shipment'), shipmentInstance.id])
        redirect(action: "show", id: shipmentInstance.id)
    }

    def show() {
        def shipmentInstance = Shipment.get(params.id)
        if (!shipmentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shipment.label', default: 'Shipment'), params.id])
            redirect(action: "list")
            return
        }

        [shipmentInstance: shipmentInstance]
    }

    def edit() {
        def shipmentInstance = Shipment.get(params.id)
        if (!shipmentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shipment.label', default: 'Shipment'), params.id])
            redirect(action: "list")
            return
        }

        [shipmentInstance: shipmentInstance]
    }

    def update() {
        def shipmentInstance = Shipment.get(params.id)
        if (!shipmentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shipment.label', default: 'Shipment'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (shipmentInstance.version > version) {
                shipmentInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'shipment.label', default: 'Shipment')] as Object[],
                        "Another user has updated this Shipment while you were editing")
                render(view: "edit", model: [shipmentInstance: shipmentInstance])
                return
            }
        }

        shipmentInstance.properties = params

        if (!shipmentInstance.save(flush: true)) {
            render(view: "edit", model: [shipmentInstance: shipmentInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'shipment.label', default: 'Shipment'), shipmentInstance.id])
        redirect(action: "show", id: shipmentInstance.id)
    }

    def delete() {
        def shipmentInstance = Shipment.get(params.id)
        if (!shipmentInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shipment.label', default: 'Shipment'), params.id])
            redirect(action: "list")
            return
        }

        try {
            shipmentInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'shipment.label', default: 'Shipment'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'shipment.label', default: 'Shipment'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

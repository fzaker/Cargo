package cargo

import org.springframework.dao.DataIntegrityViolationException

class CarrierController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
    }

    def create() {
        [carrierInstance: new Carrier(params)]
    }

    def save() {
        def carrierInstance = new Carrier(params)
        if (!carrierInstance.save(flush: true)) {
            render(view: "create", model: [carrierInstance: carrierInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'carrier.label', default: 'Carrier'), carrierInstance.id])
        redirect(action: "show", id: carrierInstance.id)
    }

    def show() {
        def carrierInstance = Carrier.get(params.id)
        if (!carrierInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carrier.label', default: 'Carrier'), params.id])
            redirect(action: "list")
            return
        }

        [carrierInstance: carrierInstance]
    }

    def edit() {
        def carrierInstance = Carrier.get(params.id)
        if (!carrierInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carrier.label', default: 'Carrier'), params.id])
            redirect(action: "list")
            return
        }

        [carrierInstance: carrierInstance]
    }

    def update() {
        def carrierInstance = Carrier.get(params.id)
        if (!carrierInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carrier.label', default: 'Carrier'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (carrierInstance.version > version) {
                carrierInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'carrier.label', default: 'Carrier')] as Object[],
                        "Another user has updated this Carrier while you were editing")
                render(view: "edit", model: [carrierInstance: carrierInstance])
                return
            }
        }

        carrierInstance.properties = params

        if (!carrierInstance.save(flush: true)) {
            render(view: "edit", model: [carrierInstance: carrierInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'carrier.label', default: 'Carrier'), carrierInstance.id])
        redirect(action: "show", id: carrierInstance.id)
    }

    def delete() {
        def carrierInstance = Carrier.get(params.id)
        if (!carrierInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carrier.label', default: 'Carrier'), params.id])
            redirect(action: "list")
            return
        }

        try {
            carrierInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'carrier.label', default: 'Carrier'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'carrier.label', default: 'Carrier'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

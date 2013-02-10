package cargo.freight

import org.springframework.dao.DataIntegrityViolationException

class AirFreightController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [airFreightInstanceList: AirFreight.list(params), airFreightInstanceTotal: AirFreight.count()]
    }

    def create() {
        [airFreightInstance: new AirFreight(params)]
    }

    def save() {
        def airFreightInstance = new AirFreight(params)
        if (!airFreightInstance.save(flush: true)) {
            render(view: "create", model: [airFreightInstance: airFreightInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), airFreightInstance.id])
        redirect(action: "show", id: airFreightInstance.id)
    }

    def show() {
        def airFreightInstance = AirFreight.get(params.id)
        if (!airFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), params.id])
            redirect(action: "list")
            return
        }

        [airFreightInstance: airFreightInstance]
    }

    def edit() {
        def airFreightInstance = AirFreight.get(params.id)
        if (!airFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), params.id])
            redirect(action: "list")
            return
        }

        [airFreightInstance: airFreightInstance]
    }

    def update() {
        def airFreightInstance = AirFreight.get(params.id)
        if (!airFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (airFreightInstance.version > version) {
                airFreightInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'airFreight.label', default: 'AirFreight')] as Object[],
                        "Another user has updated this AirFreight while you were editing")
                render(view: "edit", model: [airFreightInstance: airFreightInstance])
                return
            }
        }

        airFreightInstance.properties = params

        if (!airFreightInstance.save(flush: true)) {
            render(view: "edit", model: [airFreightInstance: airFreightInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), airFreightInstance.id])
        redirect(action: "show", id: airFreightInstance.id)
    }

    def delete() {
        def airFreightInstance = AirFreight.get(params.id)
        if (!airFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), params.id])
            redirect(action: "list")
            return
        }

        try {
            airFreightInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'airFreight.label', default: 'AirFreight'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

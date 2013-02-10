package cargo.freight

import org.springframework.dao.DataIntegrityViolationException

class RailFreightController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [railFreightInstanceList: RailFreight.list(params), railFreightInstanceTotal: RailFreight.count()]
    }

    def create() {
        [railFreightInstance: new RailFreight(params)]
    }

    def save() {
        def railFreightInstance = new RailFreight(params)
        if (!railFreightInstance.save(flush: true)) {
            render(view: "create", model: [railFreightInstance: railFreightInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), railFreightInstance.id])
        redirect(action: "show", id: railFreightInstance.id)
    }

    def show() {
        def railFreightInstance = RailFreight.get(params.id)
        if (!railFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), params.id])
            redirect(action: "list")
            return
        }

        [railFreightInstance: railFreightInstance]
    }

    def edit() {
        def railFreightInstance = RailFreight.get(params.id)
        if (!railFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), params.id])
            redirect(action: "list")
            return
        }

        [railFreightInstance: railFreightInstance]
    }

    def update() {
        def railFreightInstance = RailFreight.get(params.id)
        if (!railFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (railFreightInstance.version > version) {
                railFreightInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'railFreight.label', default: 'RailFreight')] as Object[],
                        "Another user has updated this RailFreight while you were editing")
                render(view: "edit", model: [railFreightInstance: railFreightInstance])
                return
            }
        }

        railFreightInstance.properties = params

        if (!railFreightInstance.save(flush: true)) {
            render(view: "edit", model: [railFreightInstance: railFreightInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), railFreightInstance.id])
        redirect(action: "show", id: railFreightInstance.id)
    }

    def delete() {
        def railFreightInstance = RailFreight.get(params.id)
        if (!railFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), params.id])
            redirect(action: "list")
            return
        }

        try {
            railFreightInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'railFreight.label', default: 'RailFreight'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

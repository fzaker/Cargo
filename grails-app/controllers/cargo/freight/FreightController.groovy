package cargo.freight

import org.springframework.dao.DataIntegrityViolationException

class FreightController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [freightInstanceList: Freight.list(params), freightInstanceTotal: Freight.count()]
    }

    def create() {
        [freightInstance: new Freight(params)]
    }

    def save() {
        def freightInstance = new Freight(params)
        if (!freightInstance.save(flush: true)) {
            render(view: "create", model: [freightInstance: freightInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'freight.label', default: 'Freight'), freightInstance.id])
        redirect(action: "show", id: freightInstance.id)
    }

    def show() {
        def freightInstance = Freight.get(params.id)
        if (!freightInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'freight.label', default: 'Freight'), params.id])
            redirect(action: "list")
            return
        }

        [freightInstance: freightInstance]
    }

    def edit() {
        def freightInstance = Freight.get(params.id)
        if (!freightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'freight.label', default: 'Freight'), params.id])
            redirect(action: "list")
            return
        }

        [freightInstance: freightInstance]
    }

    def update() {
        def freightInstance = Freight.get(params.id)
        if (!freightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'freight.label', default: 'Freight'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (freightInstance.version > version) {
                freightInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'freight.label', default: 'Freight')] as Object[],
                          "Another user has updated this Freight while you were editing")
                render(view: "edit", model: [freightInstance: freightInstance])
                return
            }
        }

        freightInstance.properties = params

        if (!freightInstance.save(flush: true)) {
            render(view: "edit", model: [freightInstance: freightInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'freight.label', default: 'Freight'), freightInstance.id])
        redirect(action: "show", id: freightInstance.id)
    }

    def delete() {
        def freightInstance = Freight.get(params.id)
        if (!freightInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'freight.label', default: 'Freight'), params.id])
            redirect(action: "list")
            return
        }

        try {
            freightInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'freight.label', default: 'Freight'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'freight.label', default: 'Freight'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

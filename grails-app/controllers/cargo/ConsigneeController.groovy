package cargo

import org.springframework.dao.DataIntegrityViolationException

class ConsigneeController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
    }

    def create() {
        [consigneeInstance: new Consignee(params)]
    }

    def save() {
        def consigneeInstance = new Consignee(params)
        if (!consigneeInstance.save(flush: true)) {
            render(view: "create", model: [consigneeInstance: consigneeInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'consignee.label', default: 'Consignee'), consigneeInstance.id])
        redirect(action: "show", id: consigneeInstance.id)
    }

    def show() {
        def consigneeInstance = Consignee.get(params.id)
        if (!consigneeInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'consignee.label', default: 'Consignee'), params.id])
            redirect(action: "list")
            return
        }

        [consigneeInstance: consigneeInstance]
    }

    def edit() {
        def consigneeInstance = Consignee.get(params.id)
        if (!consigneeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'consignee.label', default: 'Consignee'), params.id])
            redirect(action: "list")
            return
        }

        [consigneeInstance: consigneeInstance]
    }

    def update() {
        def consigneeInstance = Consignee.get(params.id)
        if (!consigneeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'consignee.label', default: 'Consignee'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (consigneeInstance.version > version) {
                consigneeInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'consignee.label', default: 'Consignee')] as Object[],
                          "Another user has updated this Consignee while you were editing")
                render(view: "edit", model: [consigneeInstance: consigneeInstance])
                return
            }
        }

        consigneeInstance.properties = params

        if (!consigneeInstance.save(flush: true)) {
            render(view: "edit", model: [consigneeInstance: consigneeInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'consignee.label', default: 'Consignee'), consigneeInstance.id])
        redirect(action: "show", id: consigneeInstance.id)
    }

    def delete() {
        def consigneeInstance = Consignee.get(params.id)
        if (!consigneeInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'consignee.label', default: 'Consignee'), params.id])
            redirect(action: "list")
            return
        }

        try {
            consigneeInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'consignee.label', default: 'Consignee'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'consignee.label', default: 'Consignee'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

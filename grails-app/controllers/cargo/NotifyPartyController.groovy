package cargo

import org.springframework.dao.DataIntegrityViolationException

class NotifyPartyController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [notifyPartyInstanceList: NotifyParty.list(params), notifyPartyInstanceTotal: NotifyParty.count()]
    }

    def create() {
        [notifyPartyInstance: new NotifyParty(params)]
    }

    def save() {
        def notifyPartyInstance = new NotifyParty(params)
        if (!notifyPartyInstance.save(flush: true)) {
            render(view: "create", model: [notifyPartyInstance: notifyPartyInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), notifyPartyInstance.id])
        redirect(action: "show", id: notifyPartyInstance.id)
    }

    def show() {
        def notifyPartyInstance = NotifyParty.get(params.id)
        if (!notifyPartyInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), params.id])
            redirect(action: "list")
            return
        }

        [notifyPartyInstance: notifyPartyInstance]
    }

    def edit() {
        def notifyPartyInstance = NotifyParty.get(params.id)
        if (!notifyPartyInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), params.id])
            redirect(action: "list")
            return
        }

        [notifyPartyInstance: notifyPartyInstance]
    }

    def update() {
        def notifyPartyInstance = NotifyParty.get(params.id)
        if (!notifyPartyInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (notifyPartyInstance.version > version) {
                notifyPartyInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'notifyParty.label', default: 'NotifyParty')] as Object[],
                        "Another user has updated this NotifyParty while you were editing")
                render(view: "edit", model: [notifyPartyInstance: notifyPartyInstance])
                return
            }
        }

        notifyPartyInstance.properties = params

        if (!notifyPartyInstance.save(flush: true)) {
            render(view: "edit", model: [notifyPartyInstance: notifyPartyInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), notifyPartyInstance.id])
        redirect(action: "show", id: notifyPartyInstance.id)
    }

    def delete() {
        def notifyPartyInstance = NotifyParty.get(params.id)
        if (!notifyPartyInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), params.id])
            redirect(action: "list")
            return
        }

        try {
            notifyPartyInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'notifyParty.label', default: 'NotifyParty'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

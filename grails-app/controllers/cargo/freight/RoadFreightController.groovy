package cargo.freight

import org.springframework.dao.DataIntegrityViolationException

class RoadFreightController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [roadFreightInstanceList: RoadFreight.list(params), roadFreightInstanceTotal: RoadFreight.count()]
    }

    def create() {
        [roadFreightInstance: new RoadFreight(params)]
    }

    def save() {
        def roadFreightInstance = new RoadFreight(params)
        if (!roadFreightInstance.save(flush: true)) {
            render(view: "create", model: [roadFreightInstance: roadFreightInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), roadFreightInstance.id])
        redirect(action: "show", id: roadFreightInstance.id)
    }

    def show() {
        def roadFreightInstance = RoadFreight.get(params.id)
        if (!roadFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), params.id])
            redirect(action: "list")
            return
        }

        [roadFreightInstance: roadFreightInstance]
    }

    def edit() {
        def roadFreightInstance = RoadFreight.get(params.id)
        if (!roadFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), params.id])
            redirect(action: "list")
            return
        }

        [roadFreightInstance: roadFreightInstance]
    }

    def update() {
        def roadFreightInstance = RoadFreight.get(params.id)
        if (!roadFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (roadFreightInstance.version > version) {
                roadFreightInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'roadFreight.label', default: 'RoadFreight')] as Object[],
                        "Another user has updated this RoadFreight while you were editing")
                render(view: "edit", model: [roadFreightInstance: roadFreightInstance])
                return
            }
        }

        roadFreightInstance.properties = params

        if (!roadFreightInstance.save(flush: true)) {
            render(view: "edit", model: [roadFreightInstance: roadFreightInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), roadFreightInstance.id])
        redirect(action: "show", id: roadFreightInstance.id)
    }

    def delete() {
        def roadFreightInstance = RoadFreight.get(params.id)
        if (!roadFreightInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), params.id])
            redirect(action: "list")
            return
        }

        try {
            roadFreightInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'roadFreight.label', default: 'RoadFreight'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}

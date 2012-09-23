package cargo



import org.junit.*
import grails.test.mixin.*

@TestFor(NotifyPartyController)
@Mock(NotifyParty)
class NotifyPartyControllerTests {


    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/notifyParty/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.notifyPartyInstanceList.size() == 0
        assert model.notifyPartyInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.notifyPartyInstance != null
    }

    void testSave() {
        controller.save()

        assert model.notifyPartyInstance != null
        assert view == '/notifyParty/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/notifyParty/show/1'
        assert controller.flash.message != null
        assert NotifyParty.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/notifyParty/list'


        populateValidParams(params)
        def notifyParty = new NotifyParty(params)

        assert notifyParty.save() != null

        params.id = notifyParty.id

        def model = controller.show()

        assert model.notifyPartyInstance == notifyParty
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/notifyParty/list'


        populateValidParams(params)
        def notifyParty = new NotifyParty(params)

        assert notifyParty.save() != null

        params.id = notifyParty.id

        def model = controller.edit()

        assert model.notifyPartyInstance == notifyParty
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/notifyParty/list'

        response.reset()


        populateValidParams(params)
        def notifyParty = new NotifyParty(params)

        assert notifyParty.save() != null

        // test invalid parameters in update
        params.id = notifyParty.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/notifyParty/edit"
        assert model.notifyPartyInstance != null

        notifyParty.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/notifyParty/show/$notifyParty.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        notifyParty.clearErrors()

        populateValidParams(params)
        params.id = notifyParty.id
        params.version = -1
        controller.update()

        assert view == "/notifyParty/edit"
        assert model.notifyPartyInstance != null
        assert model.notifyPartyInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/notifyParty/list'

        response.reset()

        populateValidParams(params)
        def notifyParty = new NotifyParty(params)

        assert notifyParty.save() != null
        assert NotifyParty.count() == 1

        params.id = notifyParty.id

        controller.delete()

        assert NotifyParty.count() == 0
        assert NotifyParty.get(notifyParty.id) == null
        assert response.redirectedUrl == '/notifyParty/list'
    }
}

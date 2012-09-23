package cargo



import org.junit.*
import grails.test.mixin.*

@TestFor(ConsigneeController)
@Mock(Consignee)
class ConsigneeControllerTests {


    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/consignee/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.consigneeInstanceList.size() == 0
        assert model.consigneeInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.consigneeInstance != null
    }

    void testSave() {
        controller.save()

        assert model.consigneeInstance != null
        assert view == '/consignee/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/consignee/show/1'
        assert controller.flash.message != null
        assert Consignee.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/consignee/list'


        populateValidParams(params)
        def consignee = new Consignee(params)

        assert consignee.save() != null

        params.id = consignee.id

        def model = controller.show()

        assert model.consigneeInstance == consignee
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/consignee/list'


        populateValidParams(params)
        def consignee = new Consignee(params)

        assert consignee.save() != null

        params.id = consignee.id

        def model = controller.edit()

        assert model.consigneeInstance == consignee
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/consignee/list'

        response.reset()


        populateValidParams(params)
        def consignee = new Consignee(params)

        assert consignee.save() != null

        // test invalid parameters in update
        params.id = consignee.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/consignee/edit"
        assert model.consigneeInstance != null

        consignee.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/consignee/show/$consignee.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        consignee.clearErrors()

        populateValidParams(params)
        params.id = consignee.id
        params.version = -1
        controller.update()

        assert view == "/consignee/edit"
        assert model.consigneeInstance != null
        assert model.consigneeInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/consignee/list'

        response.reset()

        populateValidParams(params)
        def consignee = new Consignee(params)

        assert consignee.save() != null
        assert Consignee.count() == 1

        params.id = consignee.id

        controller.delete()

        assert Consignee.count() == 0
        assert Consignee.get(consignee.id) == null
        assert response.redirectedUrl == '/consignee/list'
    }
}

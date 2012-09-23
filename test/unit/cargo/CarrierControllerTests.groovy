package cargo



import org.junit.*
import grails.test.mixin.*

@TestFor(CarrierController)
@Mock(Carrier)
class CarrierControllerTests {


    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/carrier/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.carrierInstanceList.size() == 0
        assert model.carrierInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.carrierInstance != null
    }

    void testSave() {
        controller.save()

        assert model.carrierInstance != null
        assert view == '/carrier/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/carrier/show/1'
        assert controller.flash.message != null
        assert Carrier.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/carrier/list'


        populateValidParams(params)
        def carrier = new Carrier(params)

        assert carrier.save() != null

        params.id = carrier.id

        def model = controller.show()

        assert model.carrierInstance == carrier
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/carrier/list'


        populateValidParams(params)
        def carrier = new Carrier(params)

        assert carrier.save() != null

        params.id = carrier.id

        def model = controller.edit()

        assert model.carrierInstance == carrier
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/carrier/list'

        response.reset()


        populateValidParams(params)
        def carrier = new Carrier(params)

        assert carrier.save() != null

        // test invalid parameters in update
        params.id = carrier.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/carrier/edit"
        assert model.carrierInstance != null

        carrier.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/carrier/show/$carrier.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        carrier.clearErrors()

        populateValidParams(params)
        params.id = carrier.id
        params.version = -1
        controller.update()

        assert view == "/carrier/edit"
        assert model.carrierInstance != null
        assert model.carrierInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/carrier/list'

        response.reset()

        populateValidParams(params)
        def carrier = new Carrier(params)

        assert carrier.save() != null
        assert Carrier.count() == 1

        params.id = carrier.id

        controller.delete()

        assert Carrier.count() == 0
        assert Carrier.get(carrier.id) == null
        assert response.redirectedUrl == '/carrier/list'
    }
}

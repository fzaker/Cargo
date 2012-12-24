import cargo.Country
import cargo.City
import grails.util.GrailsUtil
import cargo.Airport
import cargo.ForwardingReference
import cargo.Shipment

class BootStrap {

    def saveIt = {
        if (!it.save()) {
            it.errors.allErrors.each {error ->
                println "${error}"
            }
        }
    }

    def init = { servletContext ->
        if (GrailsUtil.environment == "development") {
            def iran = new Country(title: "Iran", persianTitle: "Iran", abbreviation: "IRR")
            saveIt iran

            def china = new Country(title: "China", persianTitle: "China", abbreviation: "CHN");
            saveIt china

            def tehran = new City(title: "Tehran", persianTitle: "Tehran", abbreviation: "TEH", port: false, country: iran)
            saveIt tehran

            def tabriz = new City(title: "Tabriz", persianTitle: "Tabriz", abbreviation: "TAB", port: false, country: iran)
            saveIt tabriz

            def shanghai = new City(title: "Shanghai", persianTitle: "Shanghai", abbreviation: "SHA", port: true, country: china)
            saveIt shanghai

            def mehrabad = new Airport(title: "Mehrabad", abbreviation: "MEH", city: tehran)
            saveIt mehrabad

            def shanghaiAirport = new Airport(title: "Shanghai", abbreviation: "SHA", city: shanghai)
            saveIt shanghaiAirport

            def forwardingRef = new ForwardingReference(address: "1", asACarrier: true, asAConsignee: true, asAnAgent: true, asANotifyParty: true, asAShipper: true, contactPerson: "Ali", fax: "123", telephone: "345", title: "Test Forwarding Ref", webSite: "www.test.com")
            saveIt forwardingRef

            def shipment = new Shipment(title: "Test Shipment", description: "Test")
            saveIt shipment
        }
    }
    def destroy = {
    }
}

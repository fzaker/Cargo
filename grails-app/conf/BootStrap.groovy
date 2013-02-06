import cargo.Country
import cargo.City
import cargo.Driver
import cargo.Truck
import grails.util.GrailsUtil
import cargo.Airport
import cargo.ForwardingReference
import cargo.Shipment
import jodd.util.StringUtil

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
//            def iran = new Country(title: "Iran", persianTitle: "Iran", abbreviation: "IRR")
//            saveIt iran
//
//            def china = new Country(title: "China", persianTitle: "China", abbreviation: "CHN");
//            saveIt china
//
//            def germany = new Country(title: "Germany", persianTitle: "Alman", abbreviation: "GRM");
//            saveIt germany
//
//            def tehran = new City(title: "Tehran", persianTitle: "Tehran", abbreviation: "TEH", port: false, country: iran)
//            saveIt tehran
//
//            def tabriz = new City(title: "Tabriz", persianTitle: "Tabriz", abbreviation: "TAB", port: false, country: iran)
//            saveIt tabriz
//
//            def shanghai = new City(title: "Shanghai", persianTitle: "Shanghai", abbreviation: "SHA", port: true, country: china)
//            saveIt shanghai
//
//            def mehrabad = new Airport(title: "Mehrabad", abbreviation: "MEH", city: tehran)
//            saveIt mehrabad
//
//            def shanghaiAirport = new Airport(title: "Shanghai", abbreviation: "SHA", city: shanghai)
//            saveIt shanghaiAirport
//
//            def forwardingRef = new ForwardingReference(address: "1", asACarrier: true, asAConsignee: true, asAnAgent: true, asANotifyParty: true, asAShipper: true, contactPerson: "Ali", fax: "123", telephone: "345", title: "Test Forwarding Ref", webSite: "www.test.com")
//            saveIt forwardingRef
//
//            def shipment = new Shipment(title: "Test Shipment", description: "Test")
//            saveIt shipment
//
//            def driver1 = new Driver(name: "driver1", family: "family1", fatherName: "dfff", idNumber: "23445", birthDate: "1920/03/23", placeOfBirth: "dffgg", mobile: "65454323", homeTel: "776655", address: "hjggyugyug",passportNumber: "775443",passportDateOfIssure: "2012/04/30",passportValidity:"2013/09/23", exitPermissionNumber: "223312", exitPermissionDateOfIssue: "2012/12/12",exitPermissionValidity: "2013/01/24")
//            saveIt driver1
//
//            def driver2 = new Driver(name: "driver2", family: "family2", fatherName: "dffsdsf", idNumber: "222245", birthDate: "1920/02/26", placeOfBirth: "wwfgg", mobile: "91254323", homeTel: "226655", address: "hjggyugyug",passportNumber: "745643",passportDateOfIssure: "2012/11/30",passportValidity:"2013/09/23", exitPermissionNumber: "22344442", exitPermissionDateOfIssue: "2012/12/21",exitPermissionValidity: "2013/08/24")
//            saveIt driver2
//
//            def truck1 = new Truck(registrationNo: "33BB3", typeOfVehicle:"kjbjby",chassisNo:"99MJ7700",trademark:"ASD",trailerNumber:"99B5544",otherParticulars:"khgjjj",carrier:forwardingRef)
//            //truck1.validate()
//            saveIt truck1
//
//
//            def truck2 = new Truck(registrationNo: "2A22", typeOfVehicle:"kjdddy",chassisNo:"997GGG7333",trademark:"HJK",trailerNumber:"99K22244",otherParticulars:"ksewdwjj",carrier:forwardingRef)
//            saveIt truck2
//
//

        }
    }
    def destroy = {
    }
}

package cargo.cargoItem

import cargo.freight.AirFreight

class AirCargoItem {

    CargoItem cargoItem
    AirFreight airFreight

    String aircraft
    Double flightNum

    Date loadingDate
    Date ETADate // Estimated Time Arrival
    Date arrivalDate
    Date deliveryOrderDate


    static constraints = {

        aircraft(nullable: false)
        flightNum(nullable: false)

        loadingDate(nullable: false)
        ETADate(nullable: false)
        arrivalDate(nullable: false)
        deliveryOrderDate(nullable: false)


    }
}

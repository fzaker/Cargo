package cargo.cargoItem

import cargo.Driver
import cargo.Truck
import cargo.freight.RoadFreight

class RoadCargoItem {

    CargoItem cargoItem
    RoadFreight roadFreight

    Driver driver
    Double CNTRNO
    Truck truck

    Date loadingDate
    Date ETADate // Estimated Time Arrival
    Date arrivalDate
    Date deliveryOrderDate


    static constraints = {

        truck(nullable: false)
        driver(nullable: false)
        CNTRNO(nullable: false)
        loadingDate(nullable: false)
        ETADate(nullable: false)
        arrivalDate(nullable: false)
        deliveryOrderDate(nullable: false)



    }
}

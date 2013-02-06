package cargo.cargoItem

import cargo.Driver
import cargo.Truck
import cargo.freight.RoadFreight

class RoadCargoItem {

    CargoItem cargoItem
    RoadFreight roadFreight

    Driver driver
    Double cntrNo
    Truck truck

    Date loadingDate
    Date etaDate // Estimated Time Arrival
    Date arrivalDate
    Date deliveryOrderDate


    static constraints = {

        truck(nullable: false)
        driver(nullable: false)
        cntrNo(nullable: false)
        loadingDate(nullable: false)
        etaDate(nullable: false)
        arrivalDate(nullable: false)
        deliveryOrderDate(nullable: false)



    }


}

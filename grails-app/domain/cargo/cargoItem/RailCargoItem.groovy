package cargo.cargoItem

import cargo.freight.RailFreight

class RailCargoItem {

    CargoItem cargoItem
    RailFreight railFreight

    String wagonType
    Double wagonNum
    String wagonStatus

    Date loadingDate
    Date ETADate // Estimated Time Arrival
    Date arrivalDate
    Date deliveryOrderDate

    static constraints = {

        wagonType(inList: ["Iranian", "Russian"])
        wagonNum(nullable: false)
        wagonStatus(inList: ["Flat", "Covered"])

        loadingDate(nullable: false)
        ETADate(nullable: false)
        arrivalDate(nullable: false)
        deliveryOrderDate(nullable: false)


    }
}

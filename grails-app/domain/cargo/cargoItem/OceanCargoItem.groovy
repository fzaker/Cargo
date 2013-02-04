package cargo.cargoItem

import cargo.freight.OceanFreight

class OceanCargoItem {
    CargoItem cargoItem
    OceanFreight oceanFreight


    Date loadingDate
    Date ETADate // Estimated Time Arrival
    Date arrivalDate
    Date deliveryOrderDate



    static constraints = {

        loadingDate(nullable: false)
        ETADate(nullable: false)
        arrivalDate(nullable: false)
        deliveryOrderDate(nullable: false)

    }
}

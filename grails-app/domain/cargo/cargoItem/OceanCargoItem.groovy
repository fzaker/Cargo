package cargo.cargoItem

import cargo.freight.OceanFreight

class OceanCargoItem {
    static searchable = true

    CargoItem cargoItem
    OceanFreight oceanFreight


    Date loadingDate
    Date etaDate // Estimated Time Arrival
    Date arrivalDate
    Date deliveryOrderDate



    static constraints = {

        loadingDate(nullable: false)
        etaDate(nullable: false)
        arrivalDate(nullable: false)
        deliveryOrderDate(nullable: false)

    }
}

package cargo.freight

import cargo.Shipment
import cargo.cargoItem.RailCargoItem

class RailFreight extends Freight {


    String railWayCo
    Double SMGSNO
    String wagonType
    Double wagonNum
    String wagonStatus

    Date loadingDate
    Date ETADate // Estimated Time Arrival
    Date arrivalDate
    Date deliveryOrderDate

    static hasMany = [cargoItem: RailCargoItem ]



    static constraints = {

        railWayCo(nullable: false)
        SMGSNO(nullable: false)
        wagonType(inList: ["Iranian", "Russian"])
        wagonNum(nullable: false)
        wagonStatus(inList: ["X","Y","Z"])

        loadingDate(nullable: false)
        ETADate(nullable: false)
        arrivalDate(nullable: false)
        deliveryOrderDate(nullable: false)







    }
}

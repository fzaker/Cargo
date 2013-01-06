package cargo.cargoItem

import cargo.freight.RailFreight

class RailCargoItem {

    CargoItem cargoItem
    RailFreight railFreight

    String railWayCo
    Double SMGSNO
    String wagonType
    Double wagonNum
    String wagonStatus

    static constraints = {

      railWayCo(nullable: false)
        SMGSNO(nullable: false)
        wagonType(inList: ["Iranian", "Russian"])
        wagonNum(nullable: false)
        wagonStatus(inList: ["X","Y","Z"])



    }
}

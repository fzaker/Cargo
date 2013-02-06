package cargo.freight

import cargo.Shipment
import cargo.cargoItem.RailCargoItem

class RailFreight extends Freight {


    String railWayCo
    Double SMGSNO
    Double stationCode

    Double totalCollect
    Double totalPrepaid



    static constraints = {

        railWayCo(nullable: false)
        SMGSNO(nullable: false)
        stationCode(nullable: false)
        totalCollect(nullable: true)
        totalPrepaid(nullable: true)

    }
}

package cargo

import cargo.freight.Freight
import cargo.cargoItem.CargoItem

class Shipment {

    String referenceCode
    String title
    String description
    Country originCnt
    City originCty
    Country destinationCnt
    City destinationCty

    String freightCharge
    Double charge
    String currency
    String HBL
    ForwardingReference shipper
    ForwardingReference consignee
    ForwardingReference notifyParty
    ForwardingReference agent


    static hasMany = [frieghts: Freight, cargoItems: CargoItem]

    static constraints = {


        referenceCode(blank: false)
        title(blank: false)
        description(maxSize: 1024)
        originCnt(nullable: false)
        originCty(nullable: false)
        destinationCnt(nullable: false)
        destinationCty(nullable: false)

        freightCharge(blank: true, inList: ["Prepaid","Collect"])
        charge(nullable: true)
        currency(nullable: true, inList: ["USD","CAD","EUR","IRR","TRY"])
        HBL(nullable: true)
        shipper(nullable: true)
        consignee(nullable: true)
        notifyParty(nullable: true)
        agent(nullable: true)




    }

    String toString(){"$title"}
}



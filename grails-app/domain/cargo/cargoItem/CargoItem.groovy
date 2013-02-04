package cargo.cargoItem

import cargo.Shipment

class CargoItem {

    Integer noOfPackage
    String kindOfPackage
    String commodity
    Double grossWeight
    String unitOfMeasure
    Double rateOrCharge
    Double chargeableWeight
    Double width
    Double length
    Double height
    String volume
    Double chargeableRate
    Double totalWeight
    Double totalVolume

    Shipment shipment

    static constraints = {

        noOfPackage(nullable: false)
        kindOfPackage(nullable: false)
        commodity(nullable: false)
        grossWeight(nullable: false)
        unitOfMeasure(nullable: false)
        rateOrCharge(nullable: false)
        chargeableWeight(nullable: false)
        width(nullable: false)
        length(nullable: false)
        height(nullable: false)
        volume(nullable: false)
        chargeableRate(nullable: false)
        totalWeight(nullable: false)
        totalVolume(nullable: false)

        shipment(nullable: false)

    }
}

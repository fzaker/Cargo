package cargo.cargoItem

import cargo.Shipment

class CargoItem {

    String kindOfPackage
    String commodity
    String unitOfMeasure
    Double rateOrCharge
    Integer noOfPackage = 0I
    Double grossWeight = 0D
    Double totalWeight
    Double chargeableWeight
    Double width = 0D
    Double length = 0D
    Double height = 0D
    Double volume
    Double chargeableRate
    Double totalVolume

    Shipment shipment

    static constraints = {


        kindOfPackage(nullable: false)
        commodity(nullable: false)
        unitOfMeasure(nullable: false)
        noOfPackage(nullable: false)
        grossWeight(nullable: false)
        totalWeight(nullable: false)
        rateOrCharge(nullable: false)
        chargeableWeight(nullable: false)
        width(nullable: false)
        length(nullable: false)
        height(nullable: false)
        volume(nullable: false)
        totalVolume(nullable: false)
        chargeableRate(nullable: false)
        shipment(nullable: false)

    }

}


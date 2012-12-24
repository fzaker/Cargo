package cargo.cargoItem

import cargo.Shipment

class CargoItem {
    Integer noOfPackage
    Double grossWeight
    String unitOfMeasure
    String rate
    String commodityItemNo
    Double chargeableWeight
    Double rateOrCharge
    Double total
    Double width
    Double length
    Double height
    String natureAndQuantityOfGoods

    Shipment shipment

    static constraints = {

    }
}

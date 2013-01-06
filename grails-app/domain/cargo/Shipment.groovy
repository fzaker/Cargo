package cargo

import cargo.freight.Freight
import cargo.cargoItem.CargoItem

class Shipment {
    String referenceCode
    String title
    String description

    static hasMany = [frieghts: Freight, cargoItems: CargoItem]

    static constraints = {
        referenceCode(blank: false)
        title(blank: false)
        description(maxSize: 1024)
    }
}



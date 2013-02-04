package cargo.insuranceCertificate

import cargo.cargoItem.RoadCargoItem

class RoadInsuranceCert  {

    RoadCargoItem roadCargoItem
    Double cmr

    static constraints = {

        cmr(nullable: false)
    }
}

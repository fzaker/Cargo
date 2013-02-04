package cargo.insuranceCertificate

import cargo.cargoItem.RailCargoItem

class RailInsuranceCert  {

    RailCargoItem railCargoItem
    Double SMGSNO

    static constraints = {

        SMGSNO(nullable: false)
    }
}

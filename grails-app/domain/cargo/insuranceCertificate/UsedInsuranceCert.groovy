package cargo.insuranceCertificate

import cargo.City
import cargo.LocalAgent
import cargo.Shipment

class UsedInsuranceCert extends AssignedInsuranceCert {

    Shipment shipment
    City transitFrom
    City transitTo
    Double totalCost
    Date usedDate


    static constraints = {

        usedDate()
        transitFrom(nullable: false)
        transitTo(nullable: false)
        totalCost(nullable: false)




    }
}

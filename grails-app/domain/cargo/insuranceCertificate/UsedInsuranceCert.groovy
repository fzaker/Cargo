package cargo.insuranceCertificate

import cargo.City
import cargo.LocalAgent
import cargo.Shipment

class UsedInsuranceCert extends Insurance {

    Shipment shipment
    City transitFrom
    City transitTo
    Double totalCost
    Date usedDate
    LocalAgent agent

    static constraints = {

        usedDate()
        transitFrom(nullable: false)
        transitTo(nullable: false)
        totalCost(nullable: false)
        agent(nullable: false)


    }
}

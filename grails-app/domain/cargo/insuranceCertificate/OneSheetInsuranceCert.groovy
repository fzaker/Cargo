package cargo.insuranceCertificate

import cargo.City
import cargo.Shipment


class OneSheetInsuranceCert {

    Integer insuranceNum
    Date issueDate
    City transitFrom
    City transitTo
    Double totalCost

    Shipment shipment

    static constraints = {

        insuranceNum(nullable: false)
        issueDate()
        transitFrom(nullable: false)
        transitTo(nullable: false)
        totalCost(nullable: false)
    }
}

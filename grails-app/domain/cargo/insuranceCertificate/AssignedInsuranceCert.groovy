package cargo.insuranceCertificate

import cargo.LocalAgent
import cargo.Shipment
import org.apache.commons.lang.math.DoubleRange

class AssignedInsuranceCert {

    LocalAgent agent
    Date sendingDate
    Double totalCount
    Double serialNumStart
    Double serialNumEnd
    Double totalDepreciated
    DoubleRange assignRange
    //Shipment shipment

    static constraints = {

        agent(inList: ["A1","A2","A3"])
        sendingDate()
        totalCount(nullable: false)
        serialNumStart(nullable: false)
        serialNumEnd(nullable: false)
        totalDepreciated(nullable: true)
    }
}

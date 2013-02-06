package cargo.insuranceCertificate

import cargo.LocalAgent
import org.apache.commons.lang.math.DoubleRange





class InsuranceCert {

    String purchaseCode
    Date purchaseDate
    Double totalCount
    Double serialNumStart
    Double serialNumEnd
    Double totalSending
    Double totalRemaining
    Double totalDepreciated
//    DoubleRange range




    static constraints = {

        purchaseCode(nullable: false)
        purchaseDate()
        totalCount(nullable: false)
        serialNumStart(nullable: false,)
        serialNumEnd(nullable: false)
        totalSending(nullable: true)
        totalRemaining(nullable: true)
        totalDepreciated(nullable: true)




    }
}

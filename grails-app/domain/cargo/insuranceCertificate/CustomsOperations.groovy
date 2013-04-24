package cargo.insuranceCertificate

import cargo.City

class CustomsOperations {

    String operationType
    Integer licenceNum
    Date customsDate
    Integer kutazhNum
    Integer rowNum
    City origin
    City destination
    Boolean oneSheetInsurance
    Boolean multiSheetInsurance




    static constraints = {

        operationType(nullable: false, inList: ["Import","Export","External Transit","Internal Transit"])
        licenceNum(nullable: false)
        customsDate()
        kutazhNum(nullable: false)
        rowNum(nullable: false)
        origin(nullable: false)
        destination(nullable: false)
        oneSheetInsurance()
        multiSheetInsurance()

    }
}

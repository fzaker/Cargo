package cargo.freight

class OceanFreight extends Freight {

    String shippingCo
    String MBL
    String vesselName
    Double vesselVoyNo

    Double totalCollect
    Double totalPrepaid
    //String portOfLoading  : value of super class & name will change in i18n
    //String portOfDischarge : value of super class & name will change in i18n


    static constraints = {

        shippingCo(nullable: false)
        MBL(nullable: false)
        vesselName(nullable: false)
        vesselVoyNo(nullable: false)
        totalCollect(nullable: true)
        totalPrepaid(nullable: true)

    }
}

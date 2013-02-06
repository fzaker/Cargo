package cargo.freight

import cargo.ForwardingReference
import cargo.City
import cargo.Shipment

class Freight {


    City placeOfLoading
    City placeOfDischarge
    City placeOfDelivery
    City placeOfReceipt

    String freightPayableAt
    City placeOfIssue
    Date dateOfIssue
    Integer numberOfBills
    String signature
    String signedAs

    Shipment shipment

    static constraints = {

        shipment (nullable: false,validator: {val, Shipment ->
            (val.HBL&&val.shipper&&val.consignee&&val.notifyParty&&val.agent)})

        placeOfLoading(nullable: false)
        placeOfDischarge(nullable: false)
        placeOfDelivery(nullable: false)
        placeOfReceipt(nullable: false)

        freightPayableAt(nullable: false)
        placeOfIssue(nullable: false)
        dateOfIssue(nullable:false)
        numberOfBills(nullable: true)
        signedAs(inList:["As Shipper","As Consignee","As NotifyParty","As Agent","As Carrier"])

        signature(maxSize: 512, nullable: true)

        shipment(nullable: false)

    }
}

package cargo

class BillOfLading {
    ForwardingReference shipper
    ForwardingReference consignee
    ForwardingReference notifyParty
    ForwardingReference agent

    City placeOfReceipt
    City placeOfLoading
    City placeOfDischarge
    City placeOfDelivery

    String freightPayableAt
    City placeOfIssue
    Date dateOfIssue
    Integer numberOfBills
    String signature
    String signedAs

    static constraints = {
        shipper(nullable:  false)
        consignee(nullable:  false)
        notifyParty(nullable:  false)
        agent(nullable:  false)

        placeOfReceipt(nullable: false)
        placeOfLoading(nullable: false)
        placeOfDischarge(nullable: false)
        placeOfDelivery(nullable: false)

        freightPayableAt(nullable: false)
        placeOfIssue(nullable: false)
        dateOfIssue(nullable: false)
        numberOfBills(nullable: false)
        signature(maxSize: 512, nullable: false)
        signedAs(inList: ["As Carrier", "As Agent"])
    }
}

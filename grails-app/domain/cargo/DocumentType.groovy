package cargo

class DocumentType {

    Shipment shipment
    User user

    String title
    String persianTitle
    Boolean critical
    byte[] bytes

    static constraints = {
        title(blank: false, maxSize: 50)
        persianTitle(blank: false, maxSize: 50)
        critical(nullable: false)
        bytes(maxSize: 100000000)

    }


}

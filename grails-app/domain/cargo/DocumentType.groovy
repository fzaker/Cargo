package cargo

class DocumentType {
    String title
    String persianTitle
    Boolean critical

    static constraints = {
        title(blank: false, maxSize: 50)
        persianTitle(blank: false, maxSize: 50)
        critical(nullable: false)
    }
}

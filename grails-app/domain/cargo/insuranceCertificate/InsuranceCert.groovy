package cargo.insuranceCertificate




class InsuranceCert extends Insurance {

    String insuranceCo
    Date purchaseDate




    static constraints = {

        insuranceCo(nullable: false)
        purchaseDate()




    }
}

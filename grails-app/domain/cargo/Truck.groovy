package cargo

class Truck {
    String registrationNo
    String typeOfVehicle
    String chassisNo
    String trademark
    String otherParticulars
    Date validityDate
    Date expireDate
    Carrier carrier

    static constraints = {
        registrationNo(blank: false)
        typeOfVehicle(blank: false)
        chassisNo(blank: false)
        trademark(blank: false)
        otherParticulars(maxSize: 128)
        validityDate(nullable: false)
        expireDate(nullable: false)
        carrier(nullable: false)
    }
}

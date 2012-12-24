package cargo

class Truck {
    String registrationNo
    String typeOfVehicle
    String chassisNo
    String trademark
    String kindOfVehicle
    String trailerNumber
    String otherParticulars
    ForwardingReference carrier

    static constraints = {
        registrationNo(blank: false)
        typeOfVehicle(blank: false)
        chassisNo(blank: false)
        trademark(blank: false)
        kindOfVehicle(blank: true)
        trailerNumber(blank: true)
        otherParticulars(maxSize: 128)
        carrier(nullable: false)
    }
}

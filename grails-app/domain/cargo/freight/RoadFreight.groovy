package cargo.freight

class RoadFreight extends Freight {

    String driverName
    Double truckTransitNumber


    static constraints = {

        driverName (nullable: false)
        truckTransitNumber (nullable: false)
    }
}

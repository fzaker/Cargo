package cargo

class ShipmentService {
    def generateReferenceCode(){

        return "SPR"+((Shipment.count())+1)
    }
}

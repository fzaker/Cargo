package cargo.freight

import cargo.Airport
import cargo.cargoItem.AirCargoItem
import cargo.cargoItem.CargoItem

class AirFreight extends Freight {

    Airport airportDeparture
    Airport airportDestination

    String otherCharges // todo: Could be composite relation
    String insurancePremium // todo: Same as above

    Double prepaidWeightCharge // todo: Check if using embedded properties is a better way
    Double collectWeightCharge
    Double prepaidValuationCharges
    Double collectValuationCharges
    Double prepaidTax
    Double collectTax
    Double prepaidTotalOtherChargesDueAgent
    Double collectTotalOtherChargesDueAgent
    Double prepaidTotalOtherChargesDueCarrier
    Double collectTotalOtherChargesDueCarrier

    Double totalPrepaid
    Double totalCollect

    Double currencyConversionRates
    Double ccChargesInDestCurrency
    Double chargesAtDestination
    Double totalCollectCharges

    String signatureOfShipperOrHisAgent
    String signatureOfIssuingCarrierOrItsAgent



    static hasMany = [cargoItems: AirCargoItem]

    static constraints = {

        airportDeparture(nullable: false)
        airportDestination(nullable: false)

        collectWeightCharge(nullable: true)
        collectValuationCharges(nullable: true)
        collectTax(nullable: true)
        collectTotalOtherChargesDueAgent(nullable: true)
        collectTotalOtherChargesDueCarrier(nullable: true)
        totalCollect (nullable: true)

        prepaidWeightCharge(nullable: true)
        prepaidValuationCharges(nullable: true)
        prepaidTax(nullable: true)
        prepaidTotalOtherChargesDueAgent(nullable: true)
        prepaidTotalOtherChargesDueCarrier(nullable: true)
        totalPrepaid (nullable: true)

        otherCharges(nullable: true)
        insurancePremium(nullable: true)

        currencyConversionRates(nullable: true)
        ccChargesInDestCurrency(nullable: true)
        chargesAtDestination(nullable: true)
        totalCollectCharges(nullable: true)

        signatureOfShipperOrHisAgent (nullable: true)
        signatureOfIssuingCarrierOrItsAgent (nullable: true)


    }
}

<%@ page import="cargo.freight.AirFreight" %>



<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'shipment', 'error')} required">
    <label for="shipment">
        <g:message code="airFreight.shipment.label" default="Shipment"/>
        <span class="required-indicator">*</span>
    </label>
    <g:select id="shipment" name="shipment.id" from="${cargo.Shipment.list()}" optionKey="id" required=""
              value="${airFreightInstance?.shipment?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'placeOfLoading', 'error')} required">
    <label for="placeOfLoading">
        <g:message code="airFreight.placeOfLoading.label" default="Place Of Loading"/>
        <span class="required-indicator">*</span>
    </label>
    <g:select id="placeOfLoading" name="placeOfLoading.id" from="${cargo.City.list()}" optionKey="id" required=""
              value="${airFreightInstance?.placeOfLoading?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'placeOfDischarge', 'error')} required">
    <label for="placeOfDischarge">
        <g:message code="airFreight.placeOfDischarge.label" default="Place Of Discharge"/>
        <span class="required-indicator">*</span>
    </label>
    <g:select id="placeOfDischarge" name="placeOfDischarge.id" from="${cargo.City.list()}" optionKey="id" required=""
              value="${airFreightInstance?.placeOfDischarge?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'placeOfDelivery', 'error')} required">
    <label for="placeOfDelivery">
        <g:message code="airFreight.placeOfDelivery.label" default="Place Of Delivery"/>
        <span class="required-indicator">*</span>
    </label>
    <g:select id="placeOfDelivery" name="placeOfDelivery.id" from="${cargo.City.list()}" optionKey="id" required=""
              value="${airFreightInstance?.placeOfDelivery?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'placeOfReceipt', 'error')} required">
    <label for="placeOfReceipt">
        <g:message code="airFreight.placeOfReceipt.label" default="Place Of Receipt"/>
        <span class="required-indicator">*</span>
    </label>
    <g:select id="placeOfReceipt" name="placeOfReceipt.id" from="${cargo.City.list()}" optionKey="id" required=""
              value="${airFreightInstance?.placeOfReceipt?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'freightPayableAt', 'error')} ">
    <label for="freightPayableAt">
        <g:message code="airFreight.freightPayableAt.label" default="Freight Payable At"/>

    </label>
    <g:textField name="freightPayableAt" value="${airFreightInstance?.freightPayableAt}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'placeOfIssue', 'error')} required">
    <label for="placeOfIssue">
        <g:message code="airFreight.placeOfIssue.label" default="Place Of Issue"/>
        <span class="required-indicator">*</span>
    </label>
    <g:select id="placeOfIssue" name="placeOfIssue.id" from="${cargo.City.list()}" optionKey="id" required=""
              value="${airFreightInstance?.placeOfIssue?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'dateOfIssue', 'error')} required">
    <label for="dateOfIssue">
        <g:message code="airFreight.dateOfIssue.label" default="Date Of Issue"/>
        <span class="required-indicator">*</span>
    </label>
    <g:datePicker name="dateOfIssue" precision="day" value="${airFreightInstance?.dateOfIssue}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'numberOfBills', 'error')} required">
    <label for="numberOfBills">
        <g:message code="airFreight.numberOfBills.label" default="Number Of Bills"/>
        <span class="required-indicator">*</span>
    </label>
    <g:field type="number" name="numberOfBills" required="" value="${airFreightInstance.numberOfBills}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'signature', 'error')} ">
    <label for="signature">
        <g:message code="airFreight.signature.label" default="Signature"/>

    </label>
    <g:textArea name="signature" cols="40" rows="5" maxlength="512" value="${airFreightInstance?.signature}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'signedAs', 'error')} ">
    <label for="signedAs">
        <g:message code="airFreight.signedAs.label" default="Signed As"/>

    </label>
    <g:select name="signedAs" from="${airFreightInstance.constraints.signedAs.inList}"
              value="${airFreightInstance?.signedAs}" valueMessagePrefix="airFreight.signedAs" noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'airport', 'error')} required">
    <label for="airport">
        <g:message code="airFreight.airport.label" default="Airport"/>
        <span class="required-indicator">*</span>
    </label>
    <g:select id="airport" name="airport.id" from="${cargo.Airport.list()}" optionKey="id" required=""
              value="${airFreightInstance?.airport?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'cargoItems', 'error')} ">
    <label for="cargoItems">
        <g:message code="airFreight.cargoItems.label" default="Cargo Items"/>

    </label>

    <ul class="one-to-many">
        <g:each in="${airFreightInstance?.cargoItems ?}" var="c">
            <li><g:link controller="airCargoItem" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
        </g:each>
        <li class="add">
            <g:link controller="airCargoItem" action="create"
                    params="['airFreight.id': airFreightInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'airCargoItem.label', default: 'AirCargoItem')])}</g:link>
        </li>
    </ul>

</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'ccChargesInDestCurrency', 'error')} ">
    <label for="ccChargesInDestCurrency">
        <g:message code="airFreight.ccChargesInDestCurrency.label" default="Cc Charges In Dest Currency"/>

    </label>
    <g:field type="number" name="ccChargesInDestCurrency" step="any"
             value="${airFreightInstance.ccChargesInDestCurrency}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'chargesAtDestination', 'error')} ">
    <label for="chargesAtDestination">
        <g:message code="airFreight.chargesAtDestination.label" default="Charges At Destination"/>

    </label>
    <g:field type="number" name="chargesAtDestination" step="any" value="${airFreightInstance.chargesAtDestination}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'collectTax', 'error')} ">
    <label for="collectTax">
        <g:message code="airFreight.collectTax.label" default="Collect Tax"/>

    </label>
    <g:field type="number" name="collectTax" step="any" value="${airFreightInstance.collectTax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'collectTotalOtherChargesDueAgent', 'error')} ">
    <label for="collectTotalOtherChargesDueAgent">
        <g:message code="airFreight.collectTotalOtherChargesDueAgent.label"
                   default="Collect Total Other Charges Due Agent"/>

    </label>
    <g:field type="number" name="collectTotalOtherChargesDueAgent" step="any"
             value="${airFreightInstance.collectTotalOtherChargesDueAgent}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'collectTotalOtherChargesDueCarrier', 'error')} ">
    <label for="collectTotalOtherChargesDueCarrier">
        <g:message code="airFreight.collectTotalOtherChargesDueCarrier.label"
                   default="Collect Total Other Charges Due Carrier"/>

    </label>
    <g:field type="number" name="collectTotalOtherChargesDueCarrier" step="any"
             value="${airFreightInstance.collectTotalOtherChargesDueCarrier}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'collectValuationCharges', 'error')} ">
    <label for="collectValuationCharges">
        <g:message code="airFreight.collectValuationCharges.label" default="Collect Valuation Charges"/>

    </label>
    <g:field type="number" name="collectValuationCharges" step="any"
             value="${airFreightInstance.collectValuationCharges}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'collectWeightCharge', 'error')} ">
    <label for="collectWeightCharge">
        <g:message code="airFreight.collectWeightCharge.label" default="Collect Weight Charge"/>

    </label>
    <g:field type="number" name="collectWeightCharge" step="any" value="${airFreightInstance.collectWeightCharge}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'currencyConversionRates', 'error')} ">
    <label for="currencyConversionRates">
        <g:message code="airFreight.currencyConversionRates.label" default="Currency Conversion Rates"/>

    </label>
    <g:field type="number" name="currencyConversionRates" step="any"
             value="${airFreightInstance.currencyConversionRates}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'executionDate', 'error')} ">
    <label for="executionDate">
        <g:message code="airFreight.executionDate.label" default="Execution Date"/>

    </label>
    <g:datePicker name="executionDate" precision="day" value="${airFreightInstance?.executionDate}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'executionPlace', 'error')} ">
    <label for="executionPlace">
        <g:message code="airFreight.executionPlace.label" default="Execution Place"/>

    </label>
    <g:datePicker name="executionPlace" precision="day" value="${airFreightInstance?.executionPlace}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'insurancePremium', 'error')} ">
    <label for="insurancePremium">
        <g:message code="airFreight.insurancePremium.label" default="Insurance Premium"/>

    </label>
    <g:textField name="insurancePremium" value="${airFreightInstance?.insurancePremium}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'otherCharges', 'error')} ">
    <label for="otherCharges">
        <g:message code="airFreight.otherCharges.label" default="Other Charges"/>

    </label>
    <g:textField name="otherCharges" value="${airFreightInstance?.otherCharges}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'prepaidTax', 'error')} ">
    <label for="prepaidTax">
        <g:message code="airFreight.prepaidTax.label" default="Prepaid Tax"/>

    </label>
    <g:field type="number" name="prepaidTax" step="any" value="${airFreightInstance.prepaidTax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'prepaidTotalOtherChargesDueAgent', 'error')} ">
    <label for="prepaidTotalOtherChargesDueAgent">
        <g:message code="airFreight.prepaidTotalOtherChargesDueAgent.label"
                   default="Prepaid Total Other Charges Due Agent"/>

    </label>
    <g:field type="number" name="prepaidTotalOtherChargesDueAgent" step="any"
             value="${airFreightInstance.prepaidTotalOtherChargesDueAgent}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'prepaidTotalOtherChargesDueCarrier', 'error')} ">
    <label for="prepaidTotalOtherChargesDueCarrier">
        <g:message code="airFreight.prepaidTotalOtherChargesDueCarrier.label"
                   default="Prepaid Total Other Charges Due Carrier"/>
    </label>
    <g:field type="number" name="prepaidTotalOtherChargesDueCarrier" step="any"
             value="${airFreightInstance.prepaidTotalOtherChargesDueCarrier}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'prepaidValuationCharges', 'error')} ">
    <label for="prepaidValuationCharges">
        <g:message code="airFreight.prepaidValuationCharges.label" default="Prepaid Valuation Charges"/>

    </label>
    <g:field type="number" name="prepaidValuationCharges" step="any"
             value="${airFreightInstance.prepaidValuationCharges}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'prepaidWeightCharge', 'error')} ">
    <label for="prepaidWeightCharge">
        <g:message code="airFreight.prepaidWeightCharge.label" default="Prepaid Weight Charge"/>

    </label>
    <g:field type="number" name="prepaidWeightCharge" step="any" value="${airFreightInstance.prepaidWeightCharge}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'signatureOfIssuingCarrierOrItsAgent', 'error')} ">
    <label for="signatureOfIssuingCarrierOrItsAgent">
        <g:message code="airFreight.signatureOfIssuingCarrierOrItsAgent.label"
                   default="Signature Of Issuing Carrier Or Its Agent"/>

    </label>
    <g:textField name="signatureOfIssuingCarrierOrItsAgent"
                 value="${airFreightInstance?.signatureOfIssuingCarrierOrItsAgent}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'signatureOfShipperOrHisAgent', 'error')} ">
    <label for="signatureOfShipperOrHisAgent">
        <g:message code="airFreight.signatureOfShipperOrHisAgent.label" default="Signature Of Shipper Or His Agent"/>

    </label>
    <g:textField name="signatureOfShipperOrHisAgent" value="${airFreightInstance?.signatureOfShipperOrHisAgent}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'totalCollect', 'error')} ">
    <label for="totalCollect">
        <g:message code="airFreight.totalCollect.label" default="Total Collect"/>

    </label>
    <g:field type="number" name="totalCollect" step="any" value="${airFreightInstance.totalCollect}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'totalCollectCharges', 'error')} ">
    <label for="totalCollectCharges">
        <g:message code="airFreight.totalCollectCharges.label" default="Total Collect Charges"/>

    </label>
    <g:field type="number" name="totalCollectCharges" step="any" value="${airFreightInstance.totalCollectCharges}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: airFreightInstance, field: 'totalPrepaid', 'error')} ">
    <label for="totalPrepaid">
        <g:message code="airFreight.totalPrepaid.label" default="Total Prepaid"/>

    </label>
    <g:field type="number" name="totalPrepaid" step="any" value="${airFreightInstance.totalPrepaid}"/>
</div>


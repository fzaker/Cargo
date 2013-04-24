<%@ page import="cargo.insuranceCertificate.UsedInsuranceCert" %>


<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'agent', 'error')} required">
    <label for="agent">
        <g:message code="usedInsuranceCert.agent.label" default="Agent" />
        <span class="required-indicator">*</span>
    </label>
    <g:select id="agent" name="agent.id" from="${cargo.LocalAgent.list()}" optionKey="id" required="" value="${usedInsuranceCertInstance?.agent?.id}" class="many-to-one"/>
</div>


<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'usedDate', 'error')} required">
    <label for="usedDate">
        <g:message code="usedInsuranceCert.usedDate.label" default="Used Date" />
        <span class="required-indicator">*</span>
    </label>
    <g:datePicker name="usedDate" precision="day"  value="${usedInsuranceCertInstance?.usedDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'shipment', 'error')} required">
    <label for="shipment">
        <g:message code="usedInsuranceCert.shipment.label" default="Shipment" />
        <span class="required-indicator">*</span>
    </label>
    <g:select id="shipment" name="shipment.id" from="${cargo.Shipment.list()}" optionKey="id" required="" value="${usedInsuranceCertInstance?.shipment?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'transitFrom', 'error')} required">
    <label for="transitFrom">
        <g:message code="usedInsuranceCert.transitFrom.label" default="Transit From" />
        <span class="required-indicator">*</span>
    </label>
    <g:select id="transitFrom" name="transitFrom.id" from="${cargo.City.list()}" optionKey="id" required="" value="${usedInsuranceCertInstance?.transitFrom?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'transitTo', 'error')} required">
    <label for="transitTo">
        <g:message code="usedInsuranceCert.transitTo.label" default="Transit To" />
        <span class="required-indicator">*</span>
    </label>
    <g:select id="transitTo" name="transitTo.id" from="${cargo.City.list()}" optionKey="id" required="" value="${usedInsuranceCertInstance?.transitTo?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'serialNumFrom', 'error')} required">
	<label for="serialNumFrom">
		<g:message code="usedInsuranceCert.serialNumFrom.label" default="Serial Num From" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="serialNumFrom" required="" value="${usedInsuranceCertInstance.serialNumFrom}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'serialNumTo', 'error')} required">
	<label for="serialNumTo">
		<g:message code="usedInsuranceCert.serialNumTo.label" default="Serial Num To" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="serialNumTo" required="" value="${usedInsuranceCertInstance.serialNumTo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'totalCount', 'error')} required">
    <label for="totalCount">
        <g:message code="usedInsuranceCert.totalCount.label" default="Total Count" />
        <span class="required-indicator">*</span>
    </label>
    <g:field type="number" name="totalCount" required="" value="${usedInsuranceCertInstance.totalCount}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usedInsuranceCertInstance, field: 'totalCost', 'error')} required">
	<label for="totalCost">
		<g:message code="usedInsuranceCert.totalCost.label" default="Total Cost" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="totalCost" step="any" required="" value="${usedInsuranceCertInstance.totalCost}"/>
</div>




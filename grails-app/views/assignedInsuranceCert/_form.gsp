<%@ page import="cargo.insuranceCertificate.AssignedInsuranceCert" %>



<div class="fieldcontain ${hasErrors(bean: assignedInsuranceCertInstance, field: 'agent', 'error')} required">
	<label for="agent">
		<g:message code="assignedInsuranceCert.agent.label" default="Agent" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="agent" name="agent.id" from="${cargo.LocalAgent.list()}" optionKey="id" required="" value="${assignedInsuranceCertInstance?.agent?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: assignedInsuranceCertInstance, field: 'sendingDate', 'error')} required">
	<label for="sendingDate">
		<g:message code="assignedInsuranceCert.sendingDate.label" default="Sending Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="sendingDate" precision="day"  value="${assignedInsuranceCertInstance?.sendingDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: assignedInsuranceCertInstance, field: 'totalCount', 'error')} required">
	<label for="totalCount">
		<g:message code="assignedInsuranceCert.totalCount.label" default="Total Count" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="totalCount" step="any" required="" value="${assignedInsuranceCertInstance.totalCount}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: assignedInsuranceCertInstance, field: 'serialNumStart', 'error')} required">
	<label for="serialNumStart">
		<g:message code="assignedInsuranceCert.serialNumStart.label" default="Serial Num Start" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="serialNumStart" step="any" required="" value="${assignedInsuranceCertInstance.serialNumStart}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: assignedInsuranceCertInstance, field: 'serialNumEnd', 'error')} required">
	<label for="serialNumEnd">
		<g:message code="assignedInsuranceCert.serialNumEnd.label" default="Serial Num End" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="serialNumEnd" step="any" required="" value="${assignedInsuranceCertInstance.serialNumEnd}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: assignedInsuranceCertInstance, field: 'totalDepreciated', 'error')} ">
	<label for="totalDepreciated">
		<g:message code="assignedInsuranceCert.totalDepreciated.label" default="Total Depreciated" />
		
	</label>
	<g:field type="number" name="totalDepreciated" step="any" value="${assignedInsuranceCertInstance.totalDepreciated}"/>
</div>


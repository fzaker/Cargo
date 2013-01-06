<%@ page import="cargo.Shipment" %>

<div class="fieldcontain ${hasErrors(bean: shipmentInstance, field: 'referenceCode', 'error')} required">
    <label for="referenceCode">
        <g:message code="shipment.referenceCode.label" default="ReferenceCode" />
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="referenceCode" required="" value="${shipmentInstance?.referenceCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shipmentInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="shipment.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${shipmentInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shipmentInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="shipment.description.label" default="Description" />
		
	</label>
	<g:textArea name="description" cols="40" rows="5" maxlength="1024" value="${shipmentInstance?.description}"/>
</div>


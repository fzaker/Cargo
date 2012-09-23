<%@ page import="cargo.Shipper" %>



<div class="fieldcontain ${hasErrors(bean: shipperInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="shipper.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="50" required="" value="${shipperInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shipperInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="shipper.address.label" default="Address" />
		
	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="512" value="${shipperInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shipperInstance, field: 'telephone', 'error')} ">
	<label for="telephone">
		<g:message code="shipper.telephone.label" default="Telephone" />
		
	</label>
	<g:textField name="telephone" maxlength="12" value="${shipperInstance?.telephone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shipperInstance, field: 'fax', 'error')} ">
	<label for="fax">
		<g:message code="shipper.fax.label" default="Fax" />
		
	</label>
	<g:textField name="fax" maxlength="12" value="${shipperInstance?.fax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shipperInstance, field: 'webSite', 'error')} ">
	<label for="webSite">
		<g:message code="shipper.webSite.label" default="Web Site" />
		
	</label>
	<g:textField name="webSite" maxlength="50" value="${shipperInstance?.webSite}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shipperInstance, field: 'contactPerson', 'error')} ">
	<label for="contactPerson">
		<g:message code="shipper.contactPerson.label" default="Contact Person" />
		
	</label>
	<g:textField name="contactPerson" maxlength="50" value="${shipperInstance?.contactPerson}"/>
</div>


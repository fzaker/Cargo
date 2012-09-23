<%@ page import="cargo.Carrier" %>



<div class="fieldcontain ${hasErrors(bean: carrierInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="carrier.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="50" required="" value="${carrierInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: carrierInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="carrier.address.label" default="Address" />
		
	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="512" value="${carrierInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: carrierInstance, field: 'telephone', 'error')} ">
	<label for="telephone">
		<g:message code="carrier.telephone.label" default="Telephone" />
		
	</label>
	<g:textField name="telephone" maxlength="12" value="${carrierInstance?.telephone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: carrierInstance, field: 'fax', 'error')} ">
	<label for="fax">
		<g:message code="carrier.fax.label" default="Fax" />
		
	</label>
	<g:textField name="fax" maxlength="12" value="${carrierInstance?.fax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: carrierInstance, field: 'webSite', 'error')} ">
	<label for="webSite">
		<g:message code="carrier.webSite.label" default="Web Site" />
		
	</label>
	<g:textField name="webSite" maxlength="50" value="${carrierInstance?.webSite}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: carrierInstance, field: 'contactPerson', 'error')} ">
	<label for="contactPerson">
		<g:message code="carrier.contactPerson.label" default="Contact Person" />
		
	</label>
	<g:textField name="contactPerson" maxlength="50" value="${carrierInstance?.contactPerson}"/>
</div>


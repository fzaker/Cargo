<%@ page import="cargo.ForwardingReference" %>

<div class="fieldcontain ${hasErrors(bean: forwardingReferenceInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="forwardingReference.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="50" required="" value="${forwardingReferenceInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: forwardingReferenceInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="forwardingReference.address.label" default="Address" />

	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="512" value="${forwardingReferenceInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: forwardingReferenceInstance, field: 'telephone', 'error')} ">
	<label for="telephone">
		<g:message code="forwardingReference.telephone.label" default="Telephone" />

	</label>
	<g:textField name="telephone" maxlength="12" value="${forwardingReferenceInstance?.telephone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: forwardingReferenceInstance, field: 'fax', 'error')} ">
	<label for="fax">
		<g:message code="forwardingReference.fax.label" default="Fax" />

	</label>
	<g:textField name="fax" maxlength="12" value="${forwardingReferenceInstance?.fax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: forwardingReferenceInstance, field: 'webSite', 'error')} ">
	<label for="webSite">
		<g:message code="forwardingReference.webSite.label" default="Web Site" />

	</label>
	<g:textField name="webSite" maxlength="50" value="${forwardingReferenceInstance?.webSite}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: forwardingReferenceInstance, field: 'contactPerson', 'error')} ">
	<label for="contactPerson">
		<g:message code="forwardingReference.contactPerson.label" default="Contact Person" />

	</label>
	<g:textField name="contactPerson" maxlength="50" value="${forwardingReferenceInstance?.contactPerson}"/>
</div>


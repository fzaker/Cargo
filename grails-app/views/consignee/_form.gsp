<%@ page import="cargo.Consignee" %>



<div class="fieldcontain ${hasErrors(bean: consigneeInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="consignee.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="50" required="" value="${consigneeInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: consigneeInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="consignee.address.label" default="Address" />
		
	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="512" value="${consigneeInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: consigneeInstance, field: 'telephone', 'error')} ">
	<label for="telephone">
		<g:message code="consignee.telephone.label" default="Telephone" />
		
	</label>
	<g:textField name="telephone" maxlength="12" value="${consigneeInstance?.telephone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: consigneeInstance, field: 'fax', 'error')} ">
	<label for="fax">
		<g:message code="consignee.fax.label" default="Fax" />
		
	</label>
	<g:textField name="fax" maxlength="12" value="${consigneeInstance?.fax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: consigneeInstance, field: 'webSite', 'error')} ">
	<label for="webSite">
		<g:message code="consignee.webSite.label" default="Web Site" />
		
	</label>
	<g:textField name="webSite" maxlength="50" value="${consigneeInstance?.webSite}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: consigneeInstance, field: 'contactPerson', 'error')} ">
	<label for="contactPerson">
		<g:message code="consignee.contactPerson.label" default="Contact Person" />
		
	</label>
	<g:textField name="contactPerson" maxlength="50" value="${consigneeInstance?.contactPerson}"/>
</div>


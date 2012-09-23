<%@ page import="cargo.NotifyParty" %>



<div class="fieldcontain ${hasErrors(bean: notifyPartyInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="notifyParty.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="50" required="" value="${notifyPartyInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: notifyPartyInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="notifyParty.address.label" default="Address" />
		
	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="512" value="${notifyPartyInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: notifyPartyInstance, field: 'telephone', 'error')} ">
	<label for="telephone">
		<g:message code="notifyParty.telephone.label" default="Telephone" />
		
	</label>
	<g:textField name="telephone" maxlength="12" value="${notifyPartyInstance?.telephone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: notifyPartyInstance, field: 'fax', 'error')} ">
	<label for="fax">
		<g:message code="notifyParty.fax.label" default="Fax" />
		
	</label>
	<g:textField name="fax" maxlength="12" value="${notifyPartyInstance?.fax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: notifyPartyInstance, field: 'webSite', 'error')} ">
	<label for="webSite">
		<g:message code="notifyParty.webSite.label" default="Web Site" />
		
	</label>
	<g:textField name="webSite" maxlength="50" value="${notifyPartyInstance?.webSite}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: notifyPartyInstance, field: 'contactPerson', 'error')} ">
	<label for="contactPerson">
		<g:message code="notifyParty.contactPerson.label" default="Contact Person" />
		
	</label>
	<g:textField name="contactPerson" maxlength="50" value="${notifyPartyInstance?.contactPerson}"/>
</div>


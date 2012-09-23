<%@ page import="cargo.Agent" %>



<div class="fieldcontain ${hasErrors(bean: agentInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="agent.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="50" required="" value="${agentInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: agentInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="agent.address.label" default="Address" />
		
	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="512" value="${agentInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: agentInstance, field: 'telephone', 'error')} ">
	<label for="telephone">
		<g:message code="agent.telephone.label" default="Telephone" />
		
	</label>
	<g:textField name="telephone" maxlength="12" value="${agentInstance?.telephone}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: agentInstance, field: 'fax', 'error')} ">
	<label for="fax">
		<g:message code="agent.fax.label" default="Fax" />
		
	</label>
	<g:textField name="fax" maxlength="12" value="${agentInstance?.fax}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: agentInstance, field: 'webSite', 'error')} ">
	<label for="webSite">
		<g:message code="agent.webSite.label" default="Web Site" />
		
	</label>
	<g:textField name="webSite" maxlength="50" value="${agentInstance?.webSite}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: agentInstance, field: 'contactPerson', 'error')} ">
	<label for="contactPerson">
		<g:message code="agent.contactPerson.label" default="Contact Person" />
		
	</label>
	<g:textField name="contactPerson" maxlength="50" value="${agentInstance?.contactPerson}"/>
</div>


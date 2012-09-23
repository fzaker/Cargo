
<%@ page import="cargo.NotifyParty" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'notifyParty.label', default: 'NotifyParty')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-notifyParty" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-notifyParty" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list notifyParty">
			
				<g:if test="${notifyPartyInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="notifyParty.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${notifyPartyInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${notifyPartyInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="notifyParty.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${notifyPartyInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${notifyPartyInstance?.telephone}">
				<li class="fieldcontain">
					<span id="telephone-label" class="property-label"><g:message code="notifyParty.telephone.label" default="Telephone" /></span>
					
						<span class="property-value" aria-labelledby="telephone-label"><g:fieldValue bean="${notifyPartyInstance}" field="telephone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${notifyPartyInstance?.fax}">
				<li class="fieldcontain">
					<span id="fax-label" class="property-label"><g:message code="notifyParty.fax.label" default="Fax" /></span>
					
						<span class="property-value" aria-labelledby="fax-label"><g:fieldValue bean="${notifyPartyInstance}" field="fax"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${notifyPartyInstance?.webSite}">
				<li class="fieldcontain">
					<span id="webSite-label" class="property-label"><g:message code="notifyParty.webSite.label" default="Web Site" /></span>
					
						<span class="property-value" aria-labelledby="webSite-label"><g:fieldValue bean="${notifyPartyInstance}" field="webSite"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${notifyPartyInstance?.contactPerson}">
				<li class="fieldcontain">
					<span id="contactPerson-label" class="property-label"><g:message code="notifyParty.contactPerson.label" default="Contact Person" /></span>
					
						<span class="property-value" aria-labelledby="contactPerson-label"><g:fieldValue bean="${notifyPartyInstance}" field="contactPerson"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${notifyPartyInstance?.id}" />
					<g:link class="edit" action="edit" id="${notifyPartyInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>

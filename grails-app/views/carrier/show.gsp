
<%@ page import="cargo.Carrier" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'carrier.label', default: 'Carrier')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-carrier" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-carrier" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list carrier">
			
				<g:if test="${carrierInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="carrier.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${carrierInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${carrierInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="carrier.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${carrierInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${carrierInstance?.telephone}">
				<li class="fieldcontain">
					<span id="telephone-label" class="property-label"><g:message code="carrier.telephone.label" default="Telephone" /></span>
					
						<span class="property-value" aria-labelledby="telephone-label"><g:fieldValue bean="${carrierInstance}" field="telephone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${carrierInstance?.fax}">
				<li class="fieldcontain">
					<span id="fax-label" class="property-label"><g:message code="carrier.fax.label" default="Fax" /></span>
					
						<span class="property-value" aria-labelledby="fax-label"><g:fieldValue bean="${carrierInstance}" field="fax"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${carrierInstance?.webSite}">
				<li class="fieldcontain">
					<span id="webSite-label" class="property-label"><g:message code="carrier.webSite.label" default="Web Site" /></span>
					
						<span class="property-value" aria-labelledby="webSite-label"><g:fieldValue bean="${carrierInstance}" field="webSite"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${carrierInstance?.contactPerson}">
				<li class="fieldcontain">
					<span id="contactPerson-label" class="property-label"><g:message code="carrier.contactPerson.label" default="Contact Person" /></span>
					
						<span class="property-value" aria-labelledby="contactPerson-label"><g:fieldValue bean="${carrierInstance}" field="contactPerson"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${carrierInstance?.id}" />
					<g:link class="edit" action="edit" id="${carrierInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>

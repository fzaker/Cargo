
<%@ page import="cargo.insuranceCertificate.CustomsOperations" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'customsOperations.label', default: 'CustomsOperations')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-customsOperations" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-customsOperations" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list customsOperations">
			
				<g:if test="${customsOperationsInstance?.operationType}">
				<li class="fieldcontain">
					<span id="operationType-label" class="property-label"><g:message code="customsOperations.operationType.label" default="Operation Type" /></span>
					
						<span class="property-value" aria-labelledby="operationType-label"><g:fieldValue bean="${customsOperationsInstance}" field="operationType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.licenceNum}">
				<li class="fieldcontain">
					<span id="licenceNum-label" class="property-label"><g:message code="customsOperations.licenceNum.label" default="Licence Num" /></span>
					
						<span class="property-value" aria-labelledby="licenceNum-label"><g:fieldValue bean="${customsOperationsInstance}" field="licenceNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.customsDate}">
				<li class="fieldcontain">
					<span id="customsDate-label" class="property-label"><g:message code="customsOperations.customsDate.label" default="Customs Date" /></span>
					
						<span class="property-value" aria-labelledby="customsDate-label"><g:formatDate date="${customsOperationsInstance?.customsDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.kutazhNum}">
				<li class="fieldcontain">
					<span id="kutazhNum-label" class="property-label"><g:message code="customsOperations.kutazhNum.label" default="Kutazh Num" /></span>
					
						<span class="property-value" aria-labelledby="kutazhNum-label"><g:fieldValue bean="${customsOperationsInstance}" field="kutazhNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.rowNum}">
				<li class="fieldcontain">
					<span id="rowNum-label" class="property-label"><g:message code="customsOperations.rowNum.label" default="Row Num" /></span>
					
						<span class="property-value" aria-labelledby="rowNum-label"><g:fieldValue bean="${customsOperationsInstance}" field="rowNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.origin}">
				<li class="fieldcontain">
					<span id="origin-label" class="property-label"><g:message code="customsOperations.origin.label" default="Origin" /></span>
					
						<span class="property-value" aria-labelledby="origin-label"><g:link controller="city" action="show" id="${customsOperationsInstance?.origin?.id}">${customsOperationsInstance?.origin?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.destination}">
				<li class="fieldcontain">
					<span id="destination-label" class="property-label"><g:message code="customsOperations.destination.label" default="Destination" /></span>
					
						<span class="property-value" aria-labelledby="destination-label"><g:link controller="city" action="show" id="${customsOperationsInstance?.destination?.id}">${customsOperationsInstance?.destination?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.oneSheetInsurance}">
				<li class="fieldcontain">
					<span id="oneSheetInsurance-label" class="property-label"><g:message code="customsOperations.oneSheetInsurance.label" default="One Sheet Insurance" /></span>
					
						<span class="property-value" aria-labelledby="oneSheetInsurance-label"><g:formatBoolean boolean="${customsOperationsInstance?.oneSheetInsurance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${customsOperationsInstance?.multiSheetInsurance}">
				<li class="fieldcontain">
					<span id="multiSheetInsurance-label" class="property-label"><g:message code="customsOperations.multiSheetInsurance.label" default="Multi Sheet Insurance" /></span>
					
						<span class="property-value" aria-labelledby="multiSheetInsurance-label"><g:formatBoolean boolean="${customsOperationsInstance?.multiSheetInsurance}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${customsOperationsInstance?.id}" />
					<g:link class="edit" action="edit" id="${customsOperationsInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>

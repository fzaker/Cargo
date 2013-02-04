
<%@ page import="cargo.insuranceCertificate.AssignedInsuranceCert" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'assignedInsuranceCert.label', default: 'AssignedInsuranceCert')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-assignedInsuranceCert" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-assignedInsuranceCert" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="assignedInsuranceCert.agent.label" default="Agent" /></th>
					
						<g:sortableColumn property="sendingDate" title="${message(code: 'assignedInsuranceCert.sendingDate.label', default: 'Sending Date')}" />
					
						<g:sortableColumn property="totalCount" title="${message(code: 'assignedInsuranceCert.totalCount.label', default: 'Total Count')}" />
					
						<g:sortableColumn property="serialNumStart" title="${message(code: 'assignedInsuranceCert.serialNumStart.label', default: 'Serial Num Start')}" />
					
						<g:sortableColumn property="serialNumEnd" title="${message(code: 'assignedInsuranceCert.serialNumEnd.label', default: 'Serial Num End')}" />
					
						<g:sortableColumn property="totalDepreciated" title="${message(code: 'assignedInsuranceCert.totalDepreciated.label', default: 'Total Depreciated')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${assignedInsuranceCertInstanceList}" status="i" var="assignedInsuranceCertInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${assignedInsuranceCertInstance.id}">${fieldValue(bean: assignedInsuranceCertInstance, field: "agent")}</g:link></td>
					
						<td><g:formatDate date="${assignedInsuranceCertInstance.sendingDate}" /></td>
					
						<td>${fieldValue(bean: assignedInsuranceCertInstance, field: "totalCount")}</td>
					
						<td>${fieldValue(bean: assignedInsuranceCertInstance, field: "serialNumStart")}</td>
					
						<td>${fieldValue(bean: assignedInsuranceCertInstance, field: "serialNumEnd")}</td>
					
						<td>${fieldValue(bean: assignedInsuranceCertInstance, field: "totalDepreciated")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${assignedInsuranceCertInstanceTotal}" />
			</div>
		</div>
	</body>
</html>

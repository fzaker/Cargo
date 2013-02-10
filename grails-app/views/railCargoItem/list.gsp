
<%@ page import="cargo.cargoItem.RailCargoItem" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'railCargoItem.label', default: 'RailCargoItem')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-railCargoItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-railCargoItem" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="wagonType" title="${message(code: 'railCargoItem.wagonType.label', default: 'Wagon Type')}" />
					
						<g:sortableColumn property="wagonNum" title="${message(code: 'railCargoItem.wagonNum.label', default: 'Wagon Num')}" />
					
						<g:sortableColumn property="wagonStatus" title="${message(code: 'railCargoItem.wagonStatus.label', default: 'Wagon Status')}" />
					
						<g:sortableColumn property="loadingDate" title="${message(code: 'railCargoItem.loadingDate.label', default: 'Loading Date')}" />
					
						<g:sortableColumn property="etaDate" title="${message(code: 'railCargoItem.etaDate.label', default: 'Eta Date')}" />
					
						<g:sortableColumn property="arrivalDate" title="${message(code: 'railCargoItem.arrivalDate.label', default: 'Arrival Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${railCargoItemInstanceList}" status="i" var="railCargoItemInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${railCargoItemInstance.id}">${fieldValue(bean: railCargoItemInstance, field: "wagonType")}</g:link></td>
					
						<td>${fieldValue(bean: railCargoItemInstance, field: "wagonNum")}</td>
					
						<td>${fieldValue(bean: railCargoItemInstance, field: "wagonStatus")}</td>
					
						<td><g:formatDate date="${railCargoItemInstance.loadingDate}" /></td>
					
						<td><g:formatDate date="${railCargoItemInstance.etaDate}" /></td>
					
						<td><g:formatDate date="${railCargoItemInstance.arrivalDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${railCargoItemInstanceTotal}" />
			</div>
		</div>
	</body>
</html>

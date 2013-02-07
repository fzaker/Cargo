
<%@ page import="cargo.freight.RailFreight" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'railFreight.label', default: 'RailFreight')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-railFreight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-railFreight" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="railFreight.shipment.label" default="Shipment" /></th>
					
						<th><g:message code="railFreight.placeOfLoading.label" default="Place Of Loading" /></th>
					
						<th><g:message code="railFreight.placeOfDischarge.label" default="Place Of Discharge" /></th>
					
						<th><g:message code="railFreight.placeOfDelivery.label" default="Place Of Delivery" /></th>
					
						<th><g:message code="railFreight.placeOfReceipt.label" default="Place Of Receipt" /></th>
					
						<g:sortableColumn property="freightPayableAt" title="${message(code: 'railFreight.freightPayableAt.label', default: 'Freight Payable At')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${railFreightInstanceList}" status="i" var="railFreightInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${railFreightInstance.id}">${fieldValue(bean: railFreightInstance, field: "shipment")}</g:link></td>
					
						<td>${fieldValue(bean: railFreightInstance, field: "placeOfLoading")}</td>
					
						<td>${fieldValue(bean: railFreightInstance, field: "placeOfDischarge")}</td>
					
						<td>${fieldValue(bean: railFreightInstance, field: "placeOfDelivery")}</td>
					
						<td>${fieldValue(bean: railFreightInstance, field: "placeOfReceipt")}</td>
					
						<td>${fieldValue(bean: railFreightInstance, field: "freightPayableAt")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${railFreightInstanceTotal}" />
			</div>
		</div>
	</body>
</html>

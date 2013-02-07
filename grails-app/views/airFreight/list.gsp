
<%@ page import="cargo.freight.AirFreight" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'airFreight.label', default: 'AirFreight')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-airFreight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-airFreight" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="airFreight.shipment.label" default="Shipment" /></th>
					
						<th><g:message code="airFreight.placeOfLoading.label" default="Place Of Loading" /></th>
					
						<th><g:message code="airFreight.placeOfDischarge.label" default="Place Of Discharge" /></th>
					
						<th><g:message code="airFreight.placeOfDelivery.label" default="Place Of Delivery" /></th>
					
						<th><g:message code="airFreight.placeOfReceipt.label" default="Place Of Receipt" /></th>
					
						<g:sortableColumn property="freightPayableAt" title="${message(code: 'airFreight.freightPayableAt.label', default: 'Freight Payable At')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${airFreightInstanceList}" status="i" var="airFreightInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${airFreightInstance.id}">${fieldValue(bean: airFreightInstance, field: "shipment")}</g:link></td>
					
						<td>${fieldValue(bean: airFreightInstance, field: "placeOfLoading")}</td>
					
						<td>${fieldValue(bean: airFreightInstance, field: "placeOfDischarge")}</td>
					
						<td>${fieldValue(bean: airFreightInstance, field: "placeOfDelivery")}</td>
					
						<td>${fieldValue(bean: airFreightInstance, field: "placeOfReceipt")}</td>
					
						<td>${fieldValue(bean: airFreightInstance, field: "freightPayableAt")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${airFreightInstanceTotal}" />
			</div>
		</div>
	</body>
</html>

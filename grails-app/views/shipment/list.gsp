
<%@ page import="cargo.Shipment" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'shipment.label', default: 'Shipment')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
        <h2><g:message code="default.list.label" args="[entityName]" /></h2>
        <a href="#list-shipment" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>

        <div id="list-shipment" ng-controller="shipmentController" class="content scaffold-list" role="main">
            <rg:grid domainClass="${cargo.Shipment}" caption="" width="1000px" maxColumns="15"></rg:grid>
            <rg:dialog id="shipment" title="Shipment Dialog">
                <rg:fields bean="${new cargo.Shipment()}"></rg:fields>
                <rg:saveButton domainClass="${cargo.Shipment}"/>
                <rg:cancelButton/>
            </rg:dialog>
            <input type="button" ng-click="openShipmentCreateDialog()" value="Create Shipment"/>
            <input type="button" ng-click="openShipmentEditDialog()" value="Edit Shipment"/>
        </div>
    </body>
</html>

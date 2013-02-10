
<%@ page import="cargo.freight.AirFreight" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'airFreight.label', default: 'AirFreight')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h2><g:message code="default.list.label" args="[entityName]" /></h2>
<a href="#list-airFreight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>

<div id="list-airFreight" ng-controller="airFreightController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${cargo.freight.AirFreight}" caption="" width="800px" maxColumns="15"></rg:grid>
    <rg:dialog id="airFreight" title="AirFreight Dialog">
        <rg:fields bean="${new cargo.freight.AirFreight()}"></rg:fields>
        <rg:saveButton domainClass="${cargo.freight.AirFreight}"/>
        <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openAirFreightCreateDialog()" value="Create AirFreight"/>
    <input type="button" ng-click="openAirFreightEditDialog()" value="Edit AirFreight"/>
</div>
</body>
</html>


<%@ page import="cargo.freight.OceanFreight" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'oceanFreight.label', default: 'OceanFreight')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h2><g:message code="default.list.label" args="[entityName]" /></h2>
<a href="#list-oceanFreight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>

<div id="list-oceanFreight" ng-controller="oceanFreightController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${cargo.freight.OceanFreight}" caption="" width="800px" maxColumns="15"></rg:grid>
    <rg:dialog id="oceanFreight" title="OceanFreight Dialog">
        <rg:fields bean="${new cargo.freight.OceanFreight()}"></rg:fields>
        <rg:saveButton domainClass="${cargo.freight.OceanFreight}"/>
        <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openOceanFreightCreateDialog()" value="Create OceanFreight"/>
    <input type="button" ng-click="openOceanFreightEditDialog()" value="Edit OceanFreight"/>
</div>
</body>
</html>


<%@ page import="cargo.freight.RailFreight" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'railFreight.label', default: 'RailFreight')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h2><g:message code="default.list.label" args="[entityName]" /></h2>
<a href="#list-railFreight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>

<div id="list-railFreight" ng-controller="railFreightController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${cargo.freight.RailFreight}" caption="" width="800px" maxColumns="15"></rg:grid>
    <rg:dialog id="railFreight" title="RailFreight Dialog">
        <rg:fields bean="${new cargo.freight.RailFreight()}"></rg:fields>
        <rg:saveButton domainClass="${cargo.freight.RailFreight}"/>
        <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openRailFreightCreateDialog()" value="Create RailFreight"/>
    <input type="button" ng-click="openRailFreightEditDialog()" value="Edit RailFreight"/>
</div>
</body>
</html>

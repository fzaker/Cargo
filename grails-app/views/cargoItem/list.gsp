
<%@ page import="cargo.cargoItem.CargoItem" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'cargoItem.label', default: 'CargoItem')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h2><g:message code="default.list.label" args="[entityName]" /></h2>
<a href="#list-cargoItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
    </ul>
</div>

<div id="list-cargoItem" ng-controller="cargoItemController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${cargo.cargoItem.CargoItem}" caption="" width="1000px" maxColumns="15"></rg:grid>
    <rg:dialog id="cargoItem" title="CargoItem Dialog">
        <rg:fields bean="${new cargo.cargoItem.CargoItem()}"></rg:fields>
        <rg:saveButton domainClass="${cargo.cargoItem.CargoItem}"/>
        <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openCargoItemCreateDialog()" value="Create CargoItem"/>
    <input type="button" ng-click="openCargoItemEditDialog()" value="Edit CargoItem"/>
</div>
</body>
</html>

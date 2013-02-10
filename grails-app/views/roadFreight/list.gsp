
<%@ page import="cargo.freight.RoadFreight" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'roadFreight.label', default: 'RoadFreight')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h2><g:message code="default.list.label" args="[entityName]" /></h2>
<a href="#list-roadFreight" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>

<div id="list-roadFreight" ng-controller="roadFreightController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${cargo.freight.RoadFreight}" caption="" width="800px" maxColumns="15"></rg:grid>
    <rg:dialog id="roadFreight" title="RoadFreight Dialog">
        <rg:fields bean="${new cargo.freight.RoadFreight()}"></rg:fields>
        <rg:saveButton domainClass="${cargo.freight.RoadFreight}"/>
        <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openRoadFreightCreateDialog()" value="Create RoadFreight"/>
    <input type="button" ng-click="openRoadFreightEditDialog()" value="Edit RoadFreight"/>
</div>
</body>
</html>

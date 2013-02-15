
<%@ page import="cargo.User" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h2><g:message code="default.list.label" args="[entityName]" /></h2>
<a href="#list-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>

<div id="list-user" ng-controller="userController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${cargo.User}" caption="" width="1000px" maxColumns="15"></rg:grid>
    <rg:dialog id="user" title="User Dialog">
        <rg:fields bean="${new cargo.User()}">
        </rg:fields>
        <rg:saveButton domainClass="${cargo.User}"/>
        <rg:cancelButton/>
    </rg:dialog>

    <input type="button" ng-click="openUserCreateDialog()" value="Create User"/>
    <input type="button" ng-click="openUserEditDialog()" value="Edit User"/>
</div>
</body>
</html>

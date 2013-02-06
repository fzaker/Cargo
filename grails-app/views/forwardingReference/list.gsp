
<%@ page import="cargo.ForwardingReference" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'forwardingReference.label', default:
            'ForwardingReference')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h2><g:message code="default.list.label" args="[entityName]" /></h2>
<a href="#list-forwardingReference" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                                          default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message
                code="default.home.label"/></a></li>
    </ul>
</div>
<div id="list-forwardingReference" ng-controller="forwardingReferenceController" class="content scaffold-list"
     role="main">
    <rg:grid domainClass="${cargo.ForwardingReference}" maxColumns="11"></rg:grid>
    <rg:dialog id="forwardingReference" title="ForwardingReference Dialog">
        <rg:fields bean="${new cargo.ForwardingReference()}"></rg:fields>
        <rg:saveButton domainClass="${cargo.ForwardingReference}"/>
        <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openForwardingReferenceCreateDialog()" value="Create ForwardingReference"/>
    <input type="button" ng-click="openForwardingReferenceEditDialog()" value="Edit ForwardingReference"/>
</div>
</body>
</html>

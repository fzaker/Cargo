
<%@ page import="cargo.LocalAgent" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'localAgent.label', default: 'LocalAgent')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
        <h2><g:message code="default.list.label" args="[entityName]" /></h2>
        <a href="#list-localAgent" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
			</ul>
		</div>
		<div id="list-localAgent" ng-controller="localAgentController" class="content scaffold-list" role="main">
            <rg:grid domainClass="${cargo.LocalAgent}"></rg:grid>
            <rg:dialog id="localAgent" title="Local Agent Dialog">
                <rg:fields bean="${new cargo.LocalAgent()}"></rg:fields>
                <rg:saveButton domainClass="${cargo.LocalAgent}"/>
                <rg:cancelButton/>
            </rg:dialog>
            <input type="button" ng-click="openLocalAgentCreateDialog()" value="Create Local Agent"/>
            <input type="button" ng-click="openLocalAgentEditDialog()" value="Edit Local Agent"/>
        </div>
	</body>
</html>

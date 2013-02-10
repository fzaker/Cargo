
<%@ page import="cargo.Driver" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'driver.label', default: 'Driver')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
    <h2><g:message code="default.list.label" args="[entityName]" /></h2>
    <a href="#list-driver" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
			</ul>
		</div>
        <div id="list-driver" ng-controller="driverController" class="content scaffold-list" role="main">
            <rg:grid domainClass="${cargo.Driver}" maxColumns="10"></rg:grid>
            <rg:dialog id="driver" title="Driver Dialog">
                <rg:fields bean="${new cargo.Driver()}"></rg:fields>
                <rg:saveButton domainClass="${cargo.Driver}"/>
                <rg:cancelButton/>
            </rg:dialog>
            <input type="button" ng-click="openDriverCreateDialog()" value="Create Driver"/>
            <input type="button" ng-click="openDriverEditDialog()" value="Edit Driver"/>
        </div>
	</body>
</html>

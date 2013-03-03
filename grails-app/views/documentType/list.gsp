
<%@ page import="cargo.DocumentType" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'documentType.label', default: 'DocumentType')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
        <h2><g:message code="default.list.label" args="[entityName]" /></h2>
        <a href="#list-documentType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="logout" action="index" controller="logout"><g:message code="logout.label"/></g:link></li>
			</ul>
		</div>
		<div id="list-documentType" ng-controller="documentTypeController" class="content scaffold-list" role="main">
                <rg:grid domainClass="${cargo.DocumentType}"></rg:grid>
                <rg:dialog id="documentType" title="Document Type Dialog">
                    <rg:fields bean="${new cargo.DocumentType()}"></rg:fields>
                    <rg:saveButton domainClass="${cargo.DocumentType}"/>
                    <rg:cancelButton/>
                </rg:dialog>
                <input type="button" ng-click="openDocumentTypeCreateDialog()" value="Create Document Type"/>
                <input type="button" ng-click="openDocumentTypeEditDialog()" value="Edit Document Type"/>
            </div>
        </div>
	</body>
</html>

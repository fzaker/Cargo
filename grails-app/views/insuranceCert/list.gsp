
<%@ page import="cargo.insuranceCertificate.InsuranceCert" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'insuranceCert.label', default: 'InsuranceCert')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-insuranceCert" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
    		<div id="list-insuranceCert" ng-controller="insuranceCertController" class="content scaffold-list" role="main">

            <rg:grid domainClass="${cargo.insuranceCertificate.InsuranceCert}" caption="" width="800px"></rg:grid>
            <rg:dialog id="insuranceCert" title="Insurance Certification Dialog">
                <rg:fields bean="${new cargo.insuranceCertificate.InsuranceCert()}"></rg:fields>
                <rg:saveButton domainClass="${cargo.insuranceCertificate.InsuranceCert}"/>
                <rg:cancelButton/>
            </rg:dialog>
            <input type="button" ng-click="openInsuranceCertCreateDialog()" value="Create Insurance Certificate"/>
            <input type="button" ng-click="openInsuranceCertEditDialog()" value="Edit Insurance Certificate"/>
            </div>
    </body>
</html>
					
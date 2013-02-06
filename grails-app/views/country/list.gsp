
<%@ page import="cargo.Country" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'country.label', default: 'Country')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
        <h2><g:message code="default.list.label" args="[entityName]" /></h2>
        <a href="#list-country" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>

			</ul>
		</div>
		<div id="list-country" ng-controller="countryController" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
            <rg:grid domainClass="${cargo.Country}" onSelectRow="loadCities"></rg:grid>
            <g:javascript>
                var loadCities = function (rowId) {
                    var criteria = '[{\'op\':\'eq\', \'field\':\'country.id\', \'val\':\'' + rowId + '\'}]'
                    loadGridWithCriteria("CityGrid", criteria)
                }
            </g:javascript>
            <rg:dialog id="country" title="Country Dialog">
                <rg:fields bean="${new cargo.Country()}"></rg:fields>
                <rg:saveButton domainClass="${cargo.Country}"/>
                <rg:cancelButton/>
            </rg:dialog>
            <input type="button" ng-click="openCountryCreateDialog()" value="Create Country"/>
            <input type="button" ng-click="openCountryEditDialog()" value="Edit Country"/>
        </div>
        <br>
		<div id="list-city" ng-controller="cityController" class="content scaffold-list" role="main">
            <rg:grid domainClass="${cargo.City}" onSelectRow="loadAirports"></rg:grid>
            <g:javascript>
                var loadAirports = function (rowId) {
                    var criteria = '[{\'op\':\'eq\', \'field\':\'city.id\', \'val\':\'' + rowId + '\'}]'
                    loadGridWithCriteria("AirportGrid", criteria)
                }
            </g:javascript>
            <rg:dialog id="city" title="City Dialog">
                <rg:fields bean="${new cargo.City()}">
                </rg:fields>
                <rg:saveButton domainClass="${cargo.City}"/>
                <rg:cancelButton/>
            </rg:dialog>
            <input type="button" ng-click="openCityCreateDialog()" value="Create City"/>
            <input type="button" ng-click="openCityEditDialog()" value="Edit City"/>
        </div>
        <br>
		<div id="list-airport" ng-controller="airportController" class="content scaffold-list" role="main">
            <rg:grid domainClass="${cargo.Airport}"></rg:grid>
            <rg:dialog id="airport" title="Airport Dialog">
                <rg:fields bean="${new cargo.Airport()}"></rg:fields>
                <rg:saveButton domainClass="${cargo.Airport}"/>
                <rg:cancelButton/>
            </rg:dialog>
            <input type="button" ng-click="openAirportCreateDialog()" value="Create Airport"/>
            <input type="button" ng-click="openAirportEditDialog()" value="Edit Airport"/>
        </div>
	</body>
</html>

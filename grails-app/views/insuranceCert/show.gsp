<%@ page import="cargo.insuranceCertificate.InsuranceCert" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'insuranceCert.label', default: 'InsuranceCert')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>
<a href="#show-insuranceCert" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                                    default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="show-insuranceCert" class="content scaffold-show" role="main">
    <h1><g:message code="default.show.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <ol class="property-list insuranceCert">

        <g:if test="${insuranceCertInstance?.insuranceCo}">
            <li class="fieldcontain">
                <span id="insuranceCo-label" class="property-label"><g:message code="insuranceCert.insuranceCo.label"
                                                                               default="Insurance Co"/></span>

                <span class="property-value" aria-labelledby="insuranceCo-label"><g:fieldValue
                        bean="${insuranceCertInstance}" field="insuranceCo"/></span>

            </li>
        </g:if>

        <g:if test="${insuranceCertInstance?.purchaseDate}">
            <li class="fieldcontain">
                <span id="purchaseDate-label" class="property-label"><g:message code="insuranceCert.purchaseDate.label"
                                                                                default="Purchase Date"/></span>

                <span class="property-value" aria-labelledby="purchaseDate-label"><g:formatDate
                        date="${insuranceCertInstance?.purchaseDate}"/></span>

            </li>
        </g:if>

        <g:if test="${insuranceCertInstance?.totalCount}">
            <li class="fieldcontain">
                <span id="totalCount-label" class="property-label"><g:message code="insuranceCert.totalCount.label"
                                                                              default="Total Count"/></span>

                <span class="property-value" aria-labelledby="totalCount-label"><g:fieldValue
                        bean="${insuranceCertInstance}" field="totalCount"/></span>

            </li>
        </g:if>

        <g:if test="${insuranceCertInstance?.serialNumFrom}">
            <li class="fieldcontain">
                <span id="serialNumFrom-label" class="property-label"><g:message
                        code="insuranceCert.serialNumFrom.label" default="Serial Num From"/></span>

                <span class="property-value" aria-labelledby="serialNumFrom-label"><g:fieldValue
                        bean="${insuranceCertInstance}" field="serialNumFrom"/></span>

            </li>
        </g:if>

        <g:if test="${insuranceCertInstance?.serialNumTo}">
            <li class="fieldcontain">
                <span id="serialNumTo-label" class="property-label"><g:message code="insuranceCert.serialNumTo.label"
                                                                               default="Serial Num To"/></span>

                <span class="property-value" aria-labelledby="serialNumTo-label"><g:fieldValue
                        bean="${insuranceCertInstance}" field="serialNumTo"/></span>

            </li>
        </g:if>

    </ol>
    <g:form>
        <fieldset class="buttons">
            <g:hiddenField name="id" value="${insuranceCertInstance?.id}"/>
            <g:link class="edit" action="edit" id="${insuranceCertInstance?.id}"><g:message
                    code="default.button.edit.label" default="Edit"/></g:link>
            <g:actionSubmit class="delete" action="delete"
                            value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                            onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/>
        </fieldset>
    </g:form>
</div>
</body>
</html>

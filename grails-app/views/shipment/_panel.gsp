<div id="show-shipment" class="content scaffold-show" role="main">
            <h2><g:message code="default.show.label" args="[entityName]"/></h2>
<g:if test="${flash.message}">
    <div class="message" role="status">${flash.message}</div>
</g:if>
<ol class="property-list shipment">

    <g:if test="${shipmentInstance?.referenceCode}">
        <li class="fieldcontain">
            <span id="referenceCode-label" class="property-label"><g:message code="shipment.referenceCode.label"
                                                                     default="ReferenceCode"/></span>

            <span class="property-value" aria-labelledby="referenceCode-label"><g:fieldValue bean="${shipmentInstance}"
                                                                                     field="referenceCode"/></span>

        </li>
    </g:if>

    <g:if test="${shipmentInstance?.title}">
        <li class="fieldcontain">
            <span id="title-label" class="property-label"><g:message code="shipment.title.label"
                                                                     default="Title"/></span>

            <span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${shipmentInstance}"
                                                                                     field="title"/></span>

        </li>
    </g:if>

    <g:if test="${shipmentInstance?.description}">
        <li class="fieldcontain">
            <span id="description-label" class="property-label"><g:message code="shipment.description.label"
                                                                           default="Description"/></span>

            <span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${shipmentInstance}"
                                                                                           field="description"/></span>

        </li>
    </g:if>
</ol>

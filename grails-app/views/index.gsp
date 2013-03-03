<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>E-Forwarding System</title>
    <style type="text/css" media="screen">
    #status {
        background-color: #eee;
        border: .2em solid #fff;
        margin: 2em 2em 1em;
        padding: 1em;
        width: 12em;
        float: left;
        -moz-box-shadow: 0px 0px 1.25em #ccc;
        -webkit-box-shadow: 0px 0px 1.25em #ccc;
        box-shadow: 0px 0px 1.25em #ccc;
        -moz-border-radius: 0.6em;
        -webkit-border-radius: 0.6em;
        border-radius: 0.6em;
    }

    .ie6 #status {
        display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
    }

    #status ul {
        font-size: 0.9em;
        list-style-type: none;
        margin-bottom: 0.6em;
        padding: 0;
    }

    #status li {
        line-height: 1.3;
    }

    #status h1 {
        text-transform: uppercase;
        font-size: 1.1em;
        margin: 0 0 0.3em;
    }

    #page-body {
        margin: 2em 1em 1.25em 18em;
    }

    h2 {
        margin-top: 1em;
        margin-bottom: 0.3em;
        font-size: 1em;
    }

    p {
        line-height: 1.5;
        margin: 0.25em 0;
    }

    #controller-list ul {
        list-style-position: inside;
    }

    #controller-list li {
        line-height: 1.3;
        list-style-position: inside;
        margin: 0.25em 0;
    }

    @media screen and (max-width: 480px) {
        #status {
            display: none;
        }

        #page-body {
            margin: 0 1em 1em;
        }

        #page-body h1 {
            margin-top: 0;
        }
    }
    </style>

    <link rel="stylesheet" href="${resource(dir: 'css', file: (setting ? setting.siteColor : 'blue') + 'Style.css')}"/>
</head>

<body>
<h2></h2>

<div style="margin-top: 60px;">
    <g:javascript src="jquerymenu-min.js"/>
    <script type="text/javascript">
        $(document).ready(function () {
            jQuery().jqueryMenu();
        });
    </script>


    <div style="direction:ltr;font-size:16px;margin:auto;" id="jquerymenu">
        <ul>
                <sec:ifAnyGranted roles="Admin,Head BasicInfo,BasicInfo Operator">
                <li>
                    <a href="" rel="basicInformation">
                        <g:message code="basic.information"/>
                        <span><g:message code="basic.information.description"/></span>
                    </a>
                </li>
                </sec:ifAnyGranted>
                <sec:ifAnyGranted roles="Admin,Head Shipment Creator,Shipment Creator">
                <li>
                    <a href="" rel="shipmentStatus">
                        <g:message code="shipment.status"/>
                        <span><g:message code="shipment.status.description"/></span>
                    </a>
                </li>
                </sec:ifAnyGranted>


            <li>
                <a href="" rel="costs">
                    <g:message code="costs"/>
                    <span><g:message code="costs.description"/></span>
                </a>
            </li>
            <li>
                <a href="" rel="secretariat">
                    <g:message code="secretariat"/>
                    <span><g:message code="secretariat.description"/></span>
                </a>

            </li>
            <li>
                <a href="" rel="reports">
                    <g:message code="reports"/>
                    <span><g:message code="reports.description"/></span>
                </a>
            </li>
            <li>
                <a href="" rel="communications">
                    <g:message code="communications"/>
                    <span><g:message code="communications.description"/></span>
                </a>
            </li>
            <li>
                <a href="" rel="search">
                    <g:message code="search"/>
                    <span><g:message code="search.description"/></span>
                </a>
            </li>
                <sec:ifAllGranted roles="Admin">
                <li>
                    <a href="" rel="userMng">
                        <g:message code="userMng"/>
                        <span><g:message code="userMng.description"/></span>
                    </a>
                </li>
                </sec:ifAllGranted>

        </ul>

    </div>

    <div style="direction:ltr;" id="jquerymenububble">
        <div class="slider">
            <sec:ifAnyGranted roles="Admin,Head BasicInfo,BasicInfo Operator">
                <div class="set basicInformation">
                    <ul>
                        <li>
                            <span>
                              <a  href="<g:createLink controller="country"/>">  <img src="${resource(dir: 'images/reportMenuImages', file: 'geography.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="country"/>"><g:message code="menu.geography"/></a>
                        </li>
                        <li>
                            <span>
                                <a href="<g:createLink controller="forwardingReference"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'forwardingRef.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="forwardingReference"/>"><g:message code="menu.forwardingReference"/></a>
                        </li>
                        <li>
                            <span>
                                <a href="<g:createLink controller="localAgent"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'localAgent.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="localAgent"/>"><g:message code="menu.localAgent"/></a>
                        </li>
                        <li>
                            <span>
                                <a href="<g:createLink controller="driver"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'driver.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="driver"/>"><g:message code="menu.driver"/></a>
                        </li>
                        <li>
                            <span>
                                <a href="<g:createLink controller="truck"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'trucks.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="truck"/>"><g:message code="menu.truck"/></a>
                        </li>
                        <li>
                            <span>
                                <a href="<g:createLink controller="documentType"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'document.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="documentType"/>"><g:message
                                    code="menu.documentType"/></a>
                        </li>

                    </ul>
                </div>
            </sec:ifAnyGranted>
            <sec:ifAnyGranted roles="Admin,Head Shipment Creator,Shipment Creator">
            <div class="set shipmentStatus">
                <ul>
                    <li>
                        <span>
                            <a href="<g:createLink controller="shipment"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'shipment.png')}"/></a>
                        </span>
                        <a href="<g:createLink controller="shipment"/>"><g:message code="menu.shipment"/></a>
                    </li>
                    <li>
                        <span>
                            <a href="<g:createLink controller="cargoItem"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'cargoItem.png')}"/></a>
                        </span>
                        <a href="<g:createLink controller="cargoItem"/>"><g:message code="menu.cargoItem"/></a>
                    </li>
                </ul>
            </div>
            </sec:ifAnyGranted>

            <div class="set costs">
                <ul>
                    <li>
                        <a href=""><h3>This part will Complete in the next version</h3></a>
                    </li>
                </ul>
            </div>

            <div class="set secretariat">
                <ul>
                    <li>
                        <a href=""><h3>This part will Complete in the next version</h3></a>
                    </li>

                </ul>
            </div>

            <div class="set reports">
                <ul>
                    <li>
                        <a href=""><h3>This part will Complete in the next version</h3></a>
                    </li>

                </ul>
            </div>

            <div class="set communications">
                <ul>
                    <li>
                        <a href=""><h3>This part will Complete in the next version</h3></a>
                    </li>
                </ul>
            </div>

            <div class="set search">
                <ul>
                    <li>
                        <a href="<g:createLink controller="country"/>"><g:message code="menu.searchGeography"/></a>
                    </li>
                    <li>
                        <a href="<g:createLink controller="shipment"/>"><g:message code="menu.searchShipment"/></a>
                    </li>
                    <li>
                        <a href=""><g:message code="menu.searchFreight"/></a>
                        <a href="<g:createLink controller="airFreight"/>"><g:message code="menu.searchAirFreight"/></a>
                        <a href="<g:createLink controller="oceanFreight"/>"><g:message code="menu.searchOceanFreight"/></a>
                        <a href="<g:createLink controller="railFreight"/>"><g:message code="menu.searchRailFreight"/></a>
                        <a href="<g:createLink controller="roadFreight"/>"><g:message code="menu.searchRoadFreight"/></a>
                    </li>
                    <li>
                        <a href="<g:createLink controller="cargoItem"/>"><g:message code="menu.searchCargoItem"/></a>
                    </li>
                </ul>
            </div>
            <sec:ifAllGranted roles="Admin">
                <div class="set userMng">
                    <ul>
                        <li>
                            <span>
                                <a href="<g:createLink controller="user"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'userMng2.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="user"/>"><g:message code="menu.userMng"/></a>
                        </li>
                        <li>
                            <span>
                                <a href="<g:createLink controller="userRole"/>"><img src="${resource(dir: 'images/reportMenuImages', file: 'roles.png')}"/></a>
                            </span>
                            <a href="<g:createLink controller="userRole"/>"><g:message code="menu.rolMng"/></a>
                        </li>
                    </ul>
                </div>
            </sec:ifAllGranted>
        </div>
    </div>
</div>
</body>
</html>

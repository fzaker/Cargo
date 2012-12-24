<%@ page import="cargo.cargoItem.RoadCargoItem; cargo.cargoItem.RailCargoItem; cargo.cargoItem.OceanCargoItem; cargo.cargoItem.AirCargoItem; cargo.cargoItem.CargoItem; cargo.Shipment" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="shipment">
    <g:set var="entityName" value="${message(code: 'shipment.label', default: 'Shipment')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>
<div id="list-cargoItem" ng-controller="cargoItemController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${CargoItem}">
        <rg:criteria>
            <rg:eq name="shipment.id" value="${shipmentInstance.id}"/>
        </rg:criteria>
    </rg:grid>
    <rg:dialog id="cargoItem" title="CargoItem Dialog">
        <rg:fields bean="${new CargoItem()}"></rg:fields>
        <rg:saveButton domainClass="${CargoItem}"/>
        <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openCargoItemCreateDialog()" value="Create CargoItem"/>
    <input type="button" ng-click="openCargoItemEditDialog()" value="Edit CargoItem"/>
</div>

<br>

<div id="list-freight" ng-controller="freightController" class="content scaffold-list" role="main">
    <rg:grid domainClass="${cargo.freight.Freight}" onSelectRow="loadCargoItems"
             columns="${[[name: "type", expression: "obj.metaClass.theClass.name.replace(\\'cargo.freight.\\', \\'\\')"], [name: "shipper"], [name: "consignee"], [name: "notifyParty"], [name: "agent"], [name: "placeOfReceipt"], [name: "placeOfLoading"]]}"
    >
        <rg:criteria>
            <rg:eq name="shipment.id" value="${shipmentInstance.id}"/>
        </rg:criteria>
    </rg:grid>
    <g:javascript>
        var loadCargoItems = function (rowId) {
            var rowData = freightsGrid.jqGrid('getRowData', rowId);
            var type = rowData.type.replace("Freight", "");

            var criteria = '[{\'op\':\'eq\', \'field\':\'' + type.toLowerCase() + 'Freight.id\', \'val\':\'' + rowId + '\'}]'
            loadGridWithCriteria(type + "CargoItemGrid", criteria)

            showCargoItem(type.toLowerCase());
        }
    </g:javascript>


    <rg:dialog id="airFreight" title="Air Freight Dialog">
    <rg:fields bean="${new cargo.freight.AirFreight()}" angular="false"></rg:fields>
    <rg:saveButton domainClass="${cargo.freight.AirFreight}" gridId="freight" />
    <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openAirFreightCreateDialog()" value="Create Air Freight"/>

    <rg:dialog id="oceanFreight" title="Ocean Freight Dialog">
    <rg:fields bean="${new cargo.freight.OceanFreight()}" angular="false"></rg:fields>
    <rg:saveButton domainClass="${cargo.freight.OceanFreight}" gridId="freight" />
    <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openOceanFreightCreateDialog()" value="Create Ocean Freight"/>

    <rg:dialog id="railFreight" title="Rail Freight Dialog">
    <rg:fields bean="${new cargo.freight.RailFreight()}" angular="false"></rg:fields>
    <rg:saveButton domainClass="${cargo.freight.RailFreight}" gridId="freight" />
    <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openRailFreightCreateDialog()" value="Create Rail Freight"/>

    <rg:dialog id="roadFreight" title="Road Freight Dialog">
    <rg:fields bean="${new cargo.freight.RoadFreight()}" angular="false"></rg:fields>
    <rg:saveButton domainClass="${cargo.freight.RoadFreight}" gridId="freight" />
    <rg:cancelButton/>
    </rg:dialog>
    <input type="button" ng-click="openRoadFreightCreateDialog()" value="Create Road Freight"/>

    <rg:angularController domainClass="${cargo.freight.Freight}" subClasses="true" self="false"/>
</div>

<br>

<div id="list-airCargoItem" ng-controller="airCargoItemController" class="content scaffold-list" role="main" >
    <rg:grid domainClass="${AirCargoItem}">
        <rg:criteria>
            <rg:eq name="airFreight.id" value="${0}"/>
        </rg:criteria>
        <rg:commands>
            <rg:deleteCommand/>
        </rg:commands>
    </rg:grid>
    <rg:dialog id="airCargoItem" title="Air Cargo Item Dialog">
        <rg:fields bean="${new AirCargoItem()}">

            <rg:modify>
                <rg:hiddenReference field="airFreight"></rg:hiddenReference>
                <rg:hiddenReference field="cargoItem"></rg:hiddenReference>
            </rg:modify>

            <rg:interceptCreateDialog>
                $scope.airCargoItemInstance.airFreight = { id: $scope.freightId };
                $scope.airCargoItemInstance.cargoItem = { id: $scope.cargoItemId };
            </rg:interceptCreateDialog>

        </rg:fields>
        <rg:saveButton domainClass="${AirCargoItem}"/>
        <rg:cancelButton/>
    </rg:dialog>
</div>
<div id="list-oceanCargoItem" ng-controller="oceanCargoItemController" class="content scaffold-list" role="main" >
    <rg:grid domainClass="${OceanCargoItem}">
        <rg:criteria>
            <rg:eq name="oceanFreight.id" value="${0}"/>
        </rg:criteria>
        <rg:commands>
            <rg:deleteCommand/>
        </rg:commands>
    </rg:grid>
    <rg:dialog id="oceanCargoItem" title="Ocean Cargo Item Dialog">
        <rg:fields bean="${new OceanCargoItem()}">

            <rg:modify>
                <rg:hiddenReference field="oceanFreight"></rg:hiddenReference>
                <rg:hiddenReference field="cargoItem"></rg:hiddenReference>
            </rg:modify>

            <rg:interceptCreateDialog>
                $scope.oceanCargoItemInstance.oceanFreight = { id: $scope.freightId };
                $scope.oceanCargoItemInstance.cargoItem = { id: $scope.cargoItemId };
            </rg:interceptCreateDialog>

        </rg:fields>
        <rg:saveButton domainClass="${OceanCargoItem}"/>
        <rg:cancelButton/>
    </rg:dialog>
</div>
<div id="list-railCargoItem" ng-controller="railCargoItemController" class="content scaffold-list" role="main" >
    <rg:grid domainClass="${RailCargoItem}">
        <rg:criteria>
            <rg:eq name="railFreight.id" value="${0}"/>
        </rg:criteria>
        <rg:commands>
            <rg:deleteCommand/>
        </rg:commands>
    </rg:grid>
    <rg:dialog id="railCargoItem" title="Rail Cargo Item Dialog">
        <rg:fields bean="${new RailCargoItem()}">

            <rg:modify>
                <rg:hiddenReference field="railFreight"></rg:hiddenReference>
                <rg:hiddenReference field="cargoItem"></rg:hiddenReference>
            </rg:modify>

            <rg:interceptCreateDialog>
                $scope.railCargoItemInstance.railFreight = { id: $scope.freightId };
                $scope.railCargoItemInstance.cargoItem = { id: $scope.cargoItemId };
            </rg:interceptCreateDialog>

        </rg:fields>
        <rg:saveButton domainClass="${RailCargoItem}"/>
        <rg:cancelButton/>
    </rg:dialog>
</div>
<div id="list-roadCargoItem" ng-controller="roadCargoItemController" class="content scaffold-list" role="main" >
    <rg:grid domainClass="${RoadCargoItem}">
        <rg:criteria>
            <rg:eq name="roadFreight.id" value="${0}"/>
        </rg:criteria>
        <rg:commands>
            <rg:deleteCommand/>
        </rg:commands>
    </rg:grid>
    <rg:dialog id="roadCargoItem" title="Road Cargo Item Dialog">
        <rg:fields bean="${new RoadCargoItem()}">

            <rg:modify>
                <rg:hiddenReference field="roadFreight"></rg:hiddenReference>
                <rg:hiddenReference field="cargoItem"></rg:hiddenReference>
            </rg:modify>

            <rg:interceptCreateDialog>
                $scope.roadCargoItemInstance.roadFreight = { id: $scope.freightId };
                $scope.roadCargoItemInstance.cargoItem = { id: $scope.cargoItemId };
            </rg:interceptCreateDialog>

        </rg:fields>
        <rg:saveButton domainClass="${RoadCargoItem}"/>
        <rg:cancelButton/>
    </rg:dialog>
</div>


<g:javascript>
    var cargoItemsGrid = jQuery("#CargoItemGrid");
    var freightsGrid = jQuery("#FreightGrid");

    function makeCargoItemsDraggable() {
        var r = jQuery("#CargoItemGrid tr");
        r.draggable({
            appendTo:"body",
            cursorAt:{ left:0, top:60 },
            helper: function(row) {
                var id = jQuery(row.currentTarget).attr("id");
                var rowData = cargoItemsGrid.jqGrid('getRowData', id);
                var tag = "<div style=\"background-color:#00ffff; padding: 5px; border-width: 1px; border-style: solid;\">";
                tag += "<p>Chargeable Weight: " + rowData.chargeableWeight + "</p>";
                tag += "<p>Commodity Item No: " + rowData.commodityItemNo + "</p>";
                tag += "<p>Gross Weight: " + rowData.grossWeight + "</p>";
                tag += "<p>Height: " + rowData.height + "</p>";
                tag += "<p>Length: " + rowData.length + "</p>";
                tag += "<p>Nature And Quantity Of Goods: " + rowData.natureAndQuantityOfGoods + "</p>";
                tag += "</div>";
                return tag;
            }
        });
    }

    function makeFreightsDroppable() {
        var r = jQuery("#FreightGrid tr");
        r.droppable({
            drop: function(event, ui) {
                var targetId = jQuery(this).attr("id");
                var sourceId = jQuery(ui.draggable).attr("id");

                var rowData = freightsGrid.jqGrid('getRowData', targetId);
                var type = rowData.type.replace("Freight", "");

                var scp = angular.element(jQuery('#list-' + type.toLowerCase() + 'CargoItem')).scope();

                scp.cargoItemId = sourceId;
                scp.freightId = targetId;

                showCargoItem(type);

                var fn;
                if (type == "Air")
                    fn = scp.openAirCargoItemCreateDialog;
                else if (type == "Ocean")
                    fn = scp.openOceanCargoItemCreateDialog;
                else if (type == "Rail")
                    fn = scp.openRailCargoItemCreateDialog;
                else if (type == "Road")
                    fn = scp.openRoadCargoItemCreateDialog;

                fn();

                var i = 0;
            },
            hoverClass:"ui-state-highlight"
        });
    }


    function showCargoItem(prefix) {
        prefix = prefix.toLowerCase();
        if (prefix != "air")
            jQuery("#list-airCargoItem").hide();
        if (prefix != "ocean")
            jQuery("#list-oceanCargoItem").hide();
        if (prefix != "rail")
            jQuery("#list-railCargoItem").hide();
        if (prefix != "road")
            jQuery("#list-roadCargoItem").hide();

        jQuery("#list-" + prefix + "CargoItem").show();
    }

    cargoItemsGrid.jqGrid('setGridParam', { loadComplete:function (data) {
        makeCargoItemsDraggable();
    }});
    cargoItemsGrid.jqGrid('setGridParam', { gridComplete:function () {
        makeCargoItemsDraggable();
    }});

    freightsGrid.jqGrid('setGridParam', { loadComplete:function (data) {
        makeFreightsDroppable();
    }});
    freightsGrid.jqGrid('setGridParam', { gridComplete: function () {
        makeFreightsDroppable();
    }});

    showCargoItem("");

</g:javascript>

</body>
</html>

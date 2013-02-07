databaseChangeLog = {

	changeSet(author: "roohi (generated)", id: "1360223255840-1") {
		createTable(tableName: "air_cargo_item") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "air_cargo_itePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "air_freight_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "aircraft", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "arrival_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "cargo_item_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "delivery_order_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "eta_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "flight_num", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "loading_date", type: "datetime") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-2") {
		createTable(tableName: "air_waybill_air_cargo_item") {
			column(name: "air_waybill_cargo_items_id", type: "bigint")

			column(name: "air_cargo_item_id", type: "bigint")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-3") {
		createTable(tableName: "airport") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "airportPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "abbreviation", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "city_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-4") {
		createTable(tableName: "assigned_insurance_cert") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "assigned_insuPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "agent_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "assign_range", type: "tinyblob") {
				constraints(nullable: "false")
			}

			column(name: "sending_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "serial_num_end", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "serial_num_start", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "total_count", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "total_depreciated", type: "double precision(19)")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-5") {
		createTable(tableName: "available_insurance_cert") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "available_insPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "assigned_insurance_cert_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "avl_end", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "avl_start", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "insurance_cert_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-6") {
		createTable(tableName: "bill_of_lading") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "bill_of_ladinPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "agent_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "consignee_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_of_issue", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "freight_payable_at", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "notify_party_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "number_of_bills", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "place_of_delivery_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_discharge_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_issue_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_loading_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_receipt_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "shipper_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "signature", type: "varchar(512)") {
				constraints(nullable: "false")
			}

			column(name: "signed_as", type: "varchar(10)") {
				constraints(nullable: "false")
			}

			column(name: "class", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "cc_charges_in_dest_currency", type: "double precision(19)")

			column(name: "charges_at_destination", type: "double precision(19)")

			column(name: "collect_tax", type: "double precision(19)")

			column(name: "collect_total_other_charges_due_agent", type: "double precision(19)")

			column(name: "collect_total_other_charges_due_carrier", type: "double precision(19)")

			column(name: "collect_valuation_charges", type: "double precision(19)")

			column(name: "collect_weight_charge", type: "double precision(19)")

			column(name: "currency_conversion_rates", type: "double precision(19)")

			column(name: "execution_date", type: "datetime")

			column(name: "execution_place", type: "datetime")

			column(name: "insurance_premium", type: "varchar(255)")

			column(name: "other_charges", type: "varchar(255)")

			column(name: "prepaid_tax", type: "double precision(19)")

			column(name: "prepaid_total_other_charges_due_agent", type: "double precision(19)")

			column(name: "prepaid_total_other_charges_due_carrier", type: "double precision(19)")

			column(name: "prepaid_valuation_charges", type: "double precision(19)")

			column(name: "prepaid_weight_charge", type: "double precision(19)")

			column(name: "signature_of_issuing_carrier_or_its_agent", type: "varchar(255)")

			column(name: "signature_of_shipper_or_his_agent", type: "varchar(255)")

			column(name: "total_collect", type: "double precision(19)")

			column(name: "total_collect_charges", type: "double precision(19)")

			column(name: "total_prepaid", type: "double precision(19)")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-7") {
		createTable(tableName: "cargo_item") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "cargo_itemPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "chargeable_rate", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "chargeable_weight", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "commodity", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "gross_weight", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "height", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "kind_of_package", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "length", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "no_of_package", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "rate_or_charge", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "shipment_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "total_volume", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "total_weight", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "unit_of_measure", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "volume", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "width", type: "double precision(19)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-8") {
		createTable(tableName: "city") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "cityPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "abbreviation", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "country_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "persian_title", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "port", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(50)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-9") {
		createTable(tableName: "country") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "countryPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "abbreviation", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "persian_title", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(50)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-10") {
		createTable(tableName: "document_type") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "document_typePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "critical", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "persian_title", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(50)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-11") {
		createTable(tableName: "driver") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "driverPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "address", type: "varchar(1024)") {
				constraints(nullable: "false")
			}

			column(name: "birth_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "exit_permission_date_of_issue", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "exit_permission_number", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "exit_permission_validity", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "family", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "father_name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "home_tel", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "id_number", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "mobile", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "passport_date_of_issure", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "passport_number", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "passport_validity", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "place_of_birth", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-12") {
		createTable(tableName: "forwarding_reference") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "forwarding_rePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "address", type: "varchar(512)") {
				constraints(nullable: "false")
			}

			column(name: "asacarrier", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "asaconsignee", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "asanotify_party", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "asashipper", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "as_an_agent", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "contact_person", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "fax", type: "varchar(12)") {
				constraints(nullable: "false")
			}

			column(name: "telephone", type: "varchar(12)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "web_site", type: "varchar(50)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-13") {
		createTable(tableName: "freight") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "freightPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_of_issue", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "freight_payable_at", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "number_of_bills", type: "integer")

			column(name: "place_of_delivery_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_discharge_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_issue_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_loading_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "place_of_receipt_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "shipment_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "signature", type: "varchar(512)")

			column(name: "signed_as", type: "varchar(10)") {
				constraints(nullable: "false")
			}

			column(name: "class", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "airport_departure_id", type: "bigint")

			column(name: "airport_destination_id", type: "bigint")

			column(name: "cc_charges_in_dest_currency", type: "double precision(19)")

			column(name: "charges_at_destination", type: "double precision(19)")

			column(name: "collect_tax", type: "double precision(19)")

			column(name: "collect_total_other_charges_due_agent", type: "double precision(19)")

			column(name: "collect_total_other_charges_due_carrier", type: "double precision(19)")

			column(name: "collect_valuation_charges", type: "double precision(19)")

			column(name: "collect_weight_charge", type: "double precision(19)")

			column(name: "currency_conversion_rates", type: "double precision(19)")

			column(name: "insurance_premium", type: "varchar(255)")

			column(name: "other_charges", type: "varchar(255)")

			column(name: "prepaid_tax", type: "double precision(19)")

			column(name: "prepaid_total_other_charges_due_agent", type: "double precision(19)")

			column(name: "prepaid_total_other_charges_due_carrier", type: "double precision(19)")

			column(name: "prepaid_valuation_charges", type: "double precision(19)")

			column(name: "prepaid_weight_charge", type: "double precision(19)")

			column(name: "signature_of_issuing_carrier_or_its_agent", type: "varchar(255)")

			column(name: "signature_of_shipper_or_his_agent", type: "varchar(255)")

			column(name: "total_collect", type: "double precision(19)")

			column(name: "total_collect_charges", type: "double precision(19)")

			column(name: "total_prepaid", type: "double precision(19)")

			column(name: "smgsno", type: "double precision(19)")

			column(name: "rail_way_co", type: "varchar(255)")

			column(name: "station_code", type: "double precision(19)")

			column(name: "mbl", type: "varchar(255)")

			column(name: "shipping_co", type: "varchar(255)")

			column(name: "vessel_name", type: "varchar(255)")

			column(name: "vessel_voy_no", type: "double precision(19)")

			column(name: "cmr", type: "varchar(255)")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-14") {
		createTable(tableName: "insurance_cert") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "insurance_cerPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "purchase_code", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "purchase_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "serial_num_end", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "serial_num_start", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "total_count", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "total_depreciated", type: "double precision(19)")

			column(name: "total_remaining", type: "double precision(19)")

			column(name: "total_sending", type: "double precision(19)")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-15") {
		createTable(tableName: "local_agent") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "local_agentPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "address", type: "varchar(1024)") {
				constraints(nullable: "false")
			}

			column(name: "agent", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "city_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "fax", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "telephone", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-16") {
		createTable(tableName: "ocean_cargo_item") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "ocean_cargo_iPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "arrival_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "cargo_item_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "delivery_order_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "eta_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "loading_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "ocean_freight_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-17") {
		createTable(tableName: "rail_cargo_item") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rail_cargo_itPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "arrival_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "cargo_item_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "delivery_order_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "eta_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "loading_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "rail_freight_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "wagon_num", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "wagon_status", type: "varchar(7)") {
				constraints(nullable: "false")
			}

			column(name: "wagon_type", type: "varchar(7)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-18") {
		createTable(tableName: "rail_insurance_cert") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rail_insurancPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "smgsno", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "rail_cargo_item_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-19") {
		createTable(tableName: "road_cargo_item") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "road_cargo_itPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "arrival_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "cargo_item_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cntr_no", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "delivery_order_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "driver_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "eta_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "loading_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "road_freight_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "truck_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-20") {
		createTable(tableName: "road_insurance_cert") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "road_insurancPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cmr", type: "double precision(19)") {
				constraints(nullable: "false")
			}

			column(name: "road_cargo_item_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-21") {
		createTable(tableName: "shipment") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "shipmentPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "hbl", type: "varchar(255)")

			column(name: "agent_id", type: "bigint")

			column(name: "charge", type: "double precision(19)")

			column(name: "consignee_id", type: "bigint")

			column(name: "currency", type: "varchar(3)")

			column(name: "description", type: "varchar(1024)") {
				constraints(nullable: "false")
			}

			column(name: "destination_cnt_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "destination_cty_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "freight_charge", type: "varchar(7)") {
				constraints(nullable: "false")
			}

			column(name: "notify_party_id", type: "bigint")

			column(name: "origin_cnt_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "origin_cty_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "reference_code", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "shipper_id", type: "bigint")

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-22") {
		createTable(tableName: "truck") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "truckPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "carrier_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "chassis_no", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "other_particulars", type: "varchar(128)") {
				constraints(nullable: "false")
			}

			column(name: "registration_no", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "trademark", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "trailer_number", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "type_of_vehicle", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-23") {
		addForeignKeyConstraint(baseColumnNames: "air_freight_id", baseTableName: "air_cargo_item", constraintName: "FKAD3CBCB37547F62", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "freight", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-24") {
		addForeignKeyConstraint(baseColumnNames: "cargo_item_id", baseTableName: "air_cargo_item", constraintName: "FKAD3CBCBD2FA89A2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cargo_item", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-25") {
		addForeignKeyConstraint(baseColumnNames: "air_cargo_item_id", baseTableName: "air_waybill_air_cargo_item", constraintName: "FK656152494C4BF205", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "air_cargo_item", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-26") {
		addForeignKeyConstraint(baseColumnNames: "air_waybill_cargo_items_id", baseTableName: "air_waybill_air_cargo_item", constraintName: "FK65615249495131F9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "bill_of_lading", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-27") {
		addForeignKeyConstraint(baseColumnNames: "city_id", baseTableName: "airport", constraintName: "FKC4E45CCB201FB0EC", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-28") {
		addForeignKeyConstraint(baseColumnNames: "agent_id", baseTableName: "assigned_insurance_cert", constraintName: "FK15641EFA4921881", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "local_agent", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-29") {
		addForeignKeyConstraint(baseColumnNames: "assigned_insurance_cert_id", baseTableName: "available_insurance_cert", constraintName: "FK78F3AC9FDCF8BDF1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "assigned_insurance_cert", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-30") {
		addForeignKeyConstraint(baseColumnNames: "insurance_cert_id", baseTableName: "available_insurance_cert", constraintName: "FK78F3AC9FDF30EE50", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "insurance_cert", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-31") {
		addForeignKeyConstraint(baseColumnNames: "agent_id", baseTableName: "bill_of_lading", constraintName: "FKDF85923E87DAC11", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-32") {
		addForeignKeyConstraint(baseColumnNames: "consignee_id", baseTableName: "bill_of_lading", constraintName: "FKDF859235185F9B7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-33") {
		addForeignKeyConstraint(baseColumnNames: "notify_party_id", baseTableName: "bill_of_lading", constraintName: "FKDF859236DB878C6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-34") {
		addForeignKeyConstraint(baseColumnNames: "place_of_delivery_id", baseTableName: "bill_of_lading", constraintName: "FKDF85923A9BB1D93", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-35") {
		addForeignKeyConstraint(baseColumnNames: "place_of_discharge_id", baseTableName: "bill_of_lading", constraintName: "FKDF859234B818465", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-36") {
		addForeignKeyConstraint(baseColumnNames: "place_of_issue_id", baseTableName: "bill_of_lading", constraintName: "FKDF85923D226ECEE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-37") {
		addForeignKeyConstraint(baseColumnNames: "place_of_loading_id", baseTableName: "bill_of_lading", constraintName: "FKDF85923BED3E9AB", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-38") {
		addForeignKeyConstraint(baseColumnNames: "place_of_receipt_id", baseTableName: "bill_of_lading", constraintName: "FKDF85923B2AAE72F", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-39") {
		addForeignKeyConstraint(baseColumnNames: "shipper_id", baseTableName: "bill_of_lading", constraintName: "FKDF85923EAFA435", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-40") {
		addForeignKeyConstraint(baseColumnNames: "shipment_id", baseTableName: "cargo_item", constraintName: "FKF412C1B61E8E358C", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "shipment", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-41") {
		addForeignKeyConstraint(baseColumnNames: "country_id", baseTableName: "city", constraintName: "FK2E996B122C55A8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-42") {
		addForeignKeyConstraint(baseColumnNames: "airport_departure_id", baseTableName: "freight", constraintName: "FKDC04A343509233B3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "airport", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-43") {
		addForeignKeyConstraint(baseColumnNames: "airport_destination_id", baseTableName: "freight", constraintName: "FKDC04A343A78FD59", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "airport", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-44") {
		addForeignKeyConstraint(baseColumnNames: "place_of_delivery_id", baseTableName: "freight", constraintName: "FKDC04A343A9BB1D93", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-45") {
		addForeignKeyConstraint(baseColumnNames: "place_of_discharge_id", baseTableName: "freight", constraintName: "FKDC04A3434B818465", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-46") {
		addForeignKeyConstraint(baseColumnNames: "place_of_issue_id", baseTableName: "freight", constraintName: "FKDC04A343D226ECEE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-47") {
		addForeignKeyConstraint(baseColumnNames: "place_of_loading_id", baseTableName: "freight", constraintName: "FKDC04A343BED3E9AB", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-48") {
		addForeignKeyConstraint(baseColumnNames: "place_of_receipt_id", baseTableName: "freight", constraintName: "FKDC04A343B2AAE72F", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-49") {
		addForeignKeyConstraint(baseColumnNames: "shipment_id", baseTableName: "freight", constraintName: "FKDC04A3431E8E358C", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "shipment", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-50") {
		addForeignKeyConstraint(baseColumnNames: "city_id", baseTableName: "local_agent", constraintName: "FK67E10931201FB0EC", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-51") {
		addForeignKeyConstraint(baseColumnNames: "cargo_item_id", baseTableName: "ocean_cargo_item", constraintName: "FK8D857397D2FA89A2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cargo_item", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-52") {
		addForeignKeyConstraint(baseColumnNames: "ocean_freight_id", baseTableName: "ocean_cargo_item", constraintName: "FK8D857397303A41BA", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "freight", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-53") {
		addForeignKeyConstraint(baseColumnNames: "cargo_item_id", baseTableName: "rail_cargo_item", constraintName: "FKE05F3C83D2FA89A2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cargo_item", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-54") {
		addForeignKeyConstraint(baseColumnNames: "rail_freight_id", baseTableName: "rail_cargo_item", constraintName: "FKE05F3C83DB527238", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "freight", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-55") {
		addForeignKeyConstraint(baseColumnNames: "rail_cargo_item_id", baseTableName: "rail_insurance_cert", constraintName: "FKA8F20B677CEE8C3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "rail_cargo_item", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-56") {
		addForeignKeyConstraint(baseColumnNames: "cargo_item_id", baseTableName: "road_cargo_item", constraintName: "FK88DAE435D2FA89A2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "cargo_item", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-57") {
		addForeignKeyConstraint(baseColumnNames: "driver_id", baseTableName: "road_cargo_item", constraintName: "FK88DAE43589AA5F4C", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "driver", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-58") {
		addForeignKeyConstraint(baseColumnNames: "road_freight_id", baseTableName: "road_cargo_item", constraintName: "FK88DAE435FEA56A9C", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "freight", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-59") {
		addForeignKeyConstraint(baseColumnNames: "truck_id", baseTableName: "road_cargo_item", constraintName: "FK88DAE435A75A4888", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "truck", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-60") {
		addForeignKeyConstraint(baseColumnNames: "road_cargo_item_id", baseTableName: "road_insurance_cert", constraintName: "FK38AB9F6827F4B803", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "road_cargo_item", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-61") {
		addForeignKeyConstraint(baseColumnNames: "agent_id", baseTableName: "shipment", constraintName: "FKE139719AE87DAC11", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-62") {
		addForeignKeyConstraint(baseColumnNames: "consignee_id", baseTableName: "shipment", constraintName: "FKE139719A5185F9B7", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-63") {
		addForeignKeyConstraint(baseColumnNames: "destination_cnt_id", baseTableName: "shipment", constraintName: "FKE139719AE82B2446", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-64") {
		addForeignKeyConstraint(baseColumnNames: "destination_cty_id", baseTableName: "shipment", constraintName: "FKE139719A8AFF6060", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-65") {
		addForeignKeyConstraint(baseColumnNames: "notify_party_id", baseTableName: "shipment", constraintName: "FKE139719A6DB878C6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-66") {
		addForeignKeyConstraint(baseColumnNames: "origin_cnt_id", baseTableName: "shipment", constraintName: "FKE139719A458D8E2E", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "country", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-67") {
		addForeignKeyConstraint(baseColumnNames: "origin_cty_id", baseTableName: "shipment", constraintName: "FKE139719AE861CA48", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "city", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-68") {
		addForeignKeyConstraint(baseColumnNames: "shipper_id", baseTableName: "shipment", constraintName: "FKE139719AEAFA435", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-69") {
		addForeignKeyConstraint(baseColumnNames: "carrier_id", baseTableName: "truck", constraintName: "FK6983C5FC0FEA73E", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "forwarding_reference", referencesUniqueColumn: "false")
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-70") {
		createIndex(indexName: "FKAD3CBCB37547F62", tableName: "air_cargo_item") {
			column(name: "air_freight_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-71") {
		createIndex(indexName: "FKAD3CBCBD2FA89A2", tableName: "air_cargo_item") {
			column(name: "cargo_item_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-72") {
		createIndex(indexName: "FK65615249495131F9", tableName: "air_waybill_air_cargo_item") {
			column(name: "air_waybill_cargo_items_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-73") {
		createIndex(indexName: "FK656152494C4BF205", tableName: "air_waybill_air_cargo_item") {
			column(name: "air_cargo_item_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-74") {
		createIndex(indexName: "FKC4E45CCB201FB0EC", tableName: "airport") {
			column(name: "city_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-75") {
		createIndex(indexName: "FK15641EFA4921881", tableName: "assigned_insurance_cert") {
			column(name: "agent_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-76") {
		createIndex(indexName: "FK78F3AC9FDCF8BDF1", tableName: "available_insurance_cert") {
			column(name: "assigned_insurance_cert_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-77") {
		createIndex(indexName: "FK78F3AC9FDF30EE50", tableName: "available_insurance_cert") {
			column(name: "insurance_cert_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-78") {
		createIndex(indexName: "FKDF859234B818465", tableName: "bill_of_lading") {
			column(name: "place_of_discharge_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-79") {
		createIndex(indexName: "FKDF859235185F9B7", tableName: "bill_of_lading") {
			column(name: "consignee_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-80") {
		createIndex(indexName: "FKDF859236DB878C6", tableName: "bill_of_lading") {
			column(name: "notify_party_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-81") {
		createIndex(indexName: "FKDF85923A9BB1D93", tableName: "bill_of_lading") {
			column(name: "place_of_delivery_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-82") {
		createIndex(indexName: "FKDF85923B2AAE72F", tableName: "bill_of_lading") {
			column(name: "place_of_receipt_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-83") {
		createIndex(indexName: "FKDF85923BED3E9AB", tableName: "bill_of_lading") {
			column(name: "place_of_loading_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-84") {
		createIndex(indexName: "FKDF85923D226ECEE", tableName: "bill_of_lading") {
			column(name: "place_of_issue_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-85") {
		createIndex(indexName: "FKDF85923E87DAC11", tableName: "bill_of_lading") {
			column(name: "agent_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-86") {
		createIndex(indexName: "FKDF85923EAFA435", tableName: "bill_of_lading") {
			column(name: "shipper_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-87") {
		createIndex(indexName: "FKF412C1B61E8E358C", tableName: "cargo_item") {
			column(name: "shipment_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-88") {
		createIndex(indexName: "FK2E996B122C55A8", tableName: "city") {
			column(name: "country_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-89") {
		createIndex(indexName: "FKDC04A3431E8E358C", tableName: "freight") {
			column(name: "shipment_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-90") {
		createIndex(indexName: "FKDC04A3434B818465", tableName: "freight") {
			column(name: "place_of_discharge_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-91") {
		createIndex(indexName: "FKDC04A343509233B3", tableName: "freight") {
			column(name: "airport_departure_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-92") {
		createIndex(indexName: "FKDC04A343A78FD59", tableName: "freight") {
			column(name: "airport_destination_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-93") {
		createIndex(indexName: "FKDC04A343A9BB1D93", tableName: "freight") {
			column(name: "place_of_delivery_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-94") {
		createIndex(indexName: "FKDC04A343B2AAE72F", tableName: "freight") {
			column(name: "place_of_receipt_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-95") {
		createIndex(indexName: "FKDC04A343BED3E9AB", tableName: "freight") {
			column(name: "place_of_loading_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-96") {
		createIndex(indexName: "FKDC04A343D226ECEE", tableName: "freight") {
			column(name: "place_of_issue_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-97") {
		createIndex(indexName: "FK67E10931201FB0EC", tableName: "local_agent") {
			column(name: "city_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-98") {
		createIndex(indexName: "FK8D857397303A41BA", tableName: "ocean_cargo_item") {
			column(name: "ocean_freight_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-99") {
		createIndex(indexName: "FK8D857397D2FA89A2", tableName: "ocean_cargo_item") {
			column(name: "cargo_item_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-100") {
		createIndex(indexName: "FKE05F3C83D2FA89A2", tableName: "rail_cargo_item") {
			column(name: "cargo_item_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-101") {
		createIndex(indexName: "FKE05F3C83DB527238", tableName: "rail_cargo_item") {
			column(name: "rail_freight_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-102") {
		createIndex(indexName: "FKA8F20B677CEE8C3", tableName: "rail_insurance_cert") {
			column(name: "rail_cargo_item_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-103") {
		createIndex(indexName: "FK88DAE43589AA5F4C", tableName: "road_cargo_item") {
			column(name: "driver_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-104") {
		createIndex(indexName: "FK88DAE435A75A4888", tableName: "road_cargo_item") {
			column(name: "truck_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-105") {
		createIndex(indexName: "FK88DAE435D2FA89A2", tableName: "road_cargo_item") {
			column(name: "cargo_item_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-106") {
		createIndex(indexName: "FK88DAE435FEA56A9C", tableName: "road_cargo_item") {
			column(name: "road_freight_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-107") {
		createIndex(indexName: "FK38AB9F6827F4B803", tableName: "road_insurance_cert") {
			column(name: "road_cargo_item_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-108") {
		createIndex(indexName: "FKE139719A458D8E2E", tableName: "shipment") {
			column(name: "origin_cnt_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-109") {
		createIndex(indexName: "FKE139719A5185F9B7", tableName: "shipment") {
			column(name: "consignee_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-110") {
		createIndex(indexName: "FKE139719A6DB878C6", tableName: "shipment") {
			column(name: "notify_party_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-111") {
		createIndex(indexName: "FKE139719A8AFF6060", tableName: "shipment") {
			column(name: "destination_cty_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-112") {
		createIndex(indexName: "FKE139719AE82B2446", tableName: "shipment") {
			column(name: "destination_cnt_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-113") {
		createIndex(indexName: "FKE139719AE861CA48", tableName: "shipment") {
			column(name: "origin_cty_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-114") {
		createIndex(indexName: "FKE139719AE87DAC11", tableName: "shipment") {
			column(name: "agent_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-115") {
		createIndex(indexName: "FKE139719AEAFA435", tableName: "shipment") {
			column(name: "shipper_id")
		}
	}

	changeSet(author: "roohi (generated)", id: "1360223255840-116") {
		createIndex(indexName: "FK6983C5FC0FEA73E", tableName: "truck") {
			column(name: "carrier_id")
		}
	}
}

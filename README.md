---
title: FedEx
keywords: 
last_updated: September 18, 2019
tags: []
summary: "Detailed description of the API of the FedEx endpoint."
---

## Overview

The FedEx endpoint has the following features:
 
- Track packages

Please make sure you take a look at the documentation from FedEx as features are based on its API:

- [API Reference](https://www.fedex.com/us/developer/webhelp/ws/2019/WebServicesLandingPage.html)

## Quick start

Once you have created it and the endpoint is configured, you can start interact with the API.

After you configure the endpoint you can use the helpers like this: 

```js
var res = app.endpoints.fedex.track("449044304137821"); // using package tracking number
log(JSON.stringify(res));
```


## Configuration

In order to configure the endpoint, you previously need to have an FedEx account and provide following settings.

### URL

The URL to make request to FedEx Web Services.

### Account Number

The Account Number to make request to FedEx Web Services.

### Meter Number

The meter number to make request to the FedEx Web Services.

### Key

The key of the account to make request to the FedEx Web Services.

### Password

The password of the account to make request to the FedEx Web Services.


## Javascript API

The Javascript API of the endpoint is based on the [FedEx](https://www.fedex.com/us/developer/webhelp/ws/2019/US/index.htm#t=wsdvg%2FTracking_and_Visibility_Services.htm) API Trracking Service,
so you should see their documentation for details on parameters. 

### Tracking by tracking number

For now, API only allows to work with functions related to the tracking of packages.

```js
var res = app.endpoints.fedex.track("449044304137821"); // using package tracking number
log(JSON.stringify(res));
```

This option applies to FedEx Express, FedEx SmartPost, and FedEx Custom Critical shipments. 
You can track any package shipped by FedEx using this tracking method.

### Tracking by reference

In order to track by reference you need send an object with following parameters:

**ref (object):** This object define the types/values of track to be performed. It is required.

**shipmentAccountNumber (string):** The ShipmentAccountNumber is not required, but makes tracking by reference much easier. If ShipmentAccountNumber is not specified, then the Destination PostalCode & CountryCode, and the ship date range (ShipDateRangeBegin & ShipDateRangeEnd), must be specified.

**shipDateRange (string):** If shipDateRangeBegin is equals to shipDateRangeEnd you can replace them by this.

**shipDateRangeBegin (string):** To narrow the search to a period in time, use the ShipDateRangeBegin and ShipDateRangeEnd to help eliminate duplicates.

**shipDateRangeEnd (string):** To narrow the search to a period in time, use the ShipDateRangeBegin and ShipDateRangeEnd to help eliminate duplicates.

**postalCode (string):** Destination postal code

**countryCode (string):** Destination country code

**countryName (string):** Destination country name


```js
var res = app.endpoints.fedex.trackByReference({
    ref: object,
    'shipmentAccountNumber': string,
    'shipDateRange': string,
    'shipDateRangeBegin': string,
    'shipDateRangeEnd': string,
    'postalCode': string,
    'countryCode': string,
    'countryName': string,
});
log(JSON.stringify(res));
```

Valid values for reference types are:

 - BILL_OF_LADING
 - COD_RETURN_TRACKING_NUMBER
 - CUSTOMER_AUTHORIZATION_NUMBER
 - CUSTOMER_REFERENCE
 - DEPARTMENT
 - DOCUMENT_AIRWAY_BILL
 - FREE_FORM_REFERENCE
 - GROUND_INTERNATIONAL
 - GROUND_SHIPMENT_ID
 - GROUP_MPS
 - INVOICE
 - JOB_GLOBAL_TRACKING_NUMBER
 - ORDER_GLOBAL_TRACKING_NUMBER
 - ORDER_TO_PAY_NUMBER
 - OUTBOUND_LINK_TO_RETURN
 - PARTNER_CARRIER_NUMBER
 - PART_NUMBER
 - PURCHASE_ORDER
 - REROUTE_TRACKING_NUMBER
 - RETURNED_TO_SHIPPER_TRACKING_NUMBER
 - RETURN_MATERIALS_AUTHORIZATION
 - SHIPPER_REFERENCE
 - STANDARD_MPS
 - TRACKING_NUMBER_OR_DOORTAG
 - TRANSPORTATION_CONTROL_NUMBER
 
 Check following examples using sandbox data from `https://www.fedex.com/en-us/developer/web-services/process.html#develop`:
 
 ```js

var res = app.endpoints.proxy.trackByReference({
  'ref': {
    'SHIPPER_REFERENCE': 'P218101_004154359',
    'PURCHASE_ORDER': 'P218101_004154359'
  },
  'shipmentAccountNumber': '510088000',
  'shipDateRange': '2018-08-15'
});
log(JSON.stringify(res));

// or

var res2 = app.endpoints.proxy.trackByReference({
  'ref': {
    'CUSTOMER_REFERENCE': '115380173',
    'GROUND_SHIPMENT_ID': 'DMWsGWdnN'
  },
  'shipmentAccountNumber': '510088000',
  'shipDateRangeBegin': '2018-08-15',
  'shipDateRangeEnd': '2018-08-15'
});
log(JSON.stringify(res2));
```

## About SLINGR

SLINGR is a low-code rapid application development platform that accelerates development, with robust architecture for integrations and executing custom workflows and automation.

[More info about SLINGR](https://slingr.io)

## License

This endpoint is licensed under the Apache License 2.0. See the `LICENSE` file for more details.

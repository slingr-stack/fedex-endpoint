endpoint.track = function (trackingNumber, callbackData, callbacks) {
    var options = {
        packageIdentifierValue: trackingNumber,
        packageIdentifierType: "TRACKING_NUMBER_OR_DOORTAG"
    };
    return endpoint._trackByPackageIdentifier(options, callbackData, callbacks);
};

endpoint.trackByPackageIdentifier= function (value, identifierType, callbackData, callbacks) {
    var options = {
        packageIdentifierValue: value,
        packageIdentifierType: identifierType
    };
    return endpoint._trackByPackageIdentifier(options, callbackData, callbacks);
};

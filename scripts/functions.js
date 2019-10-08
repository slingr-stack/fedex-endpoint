endpoint.track = function (trackingNumber, callbackData, callbacks) {
    var options = {
        ref: {
            'TRACKING_NUMBER_OR_DOORTAG': trackingNumber
        }
    };
    return endpoint._track(options, callbackData, callbacks);
};

endpoint.trackByReference = function (options, callbackData, callbacks) {
    return endpoint._track(options, callbackData, callbacks);
};

package io.slingr.endpoints.fedex;

import io.slingr.endpoints.Endpoint;
import io.slingr.endpoints.framework.annotations.EndpointFunction;
import io.slingr.endpoints.framework.annotations.EndpointProperty;
import io.slingr.endpoints.framework.annotations.SlingrEndpoint;
import io.slingr.endpoints.utils.Json;
import org.apache.log4j.Logger;

@SlingrEndpoint(name = "fedex")
public class FedexEndpoint extends Endpoint {

    private static final Logger logger = Logger.getLogger(FedexEndpoint.class);
    private static TrackClient fedexTrackClient;

    @EndpointProperty
    private String url;

    @EndpointProperty
    private String accountNumber;

    @EndpointProperty
    private String meterNumber;

    @EndpointProperty
    private String key;

    @EndpointProperty
    private String password;


    @Override
    public void endpointStarted() {
        logger.info("Starting Fedex track client...");
        this.fedexTrackClient = new TrackClient(url, accountNumber, meterNumber, key, password);
    }

    @EndpointFunction(name = "_trackByPackageIdentifier")
    public Json trackByPackageIdentifier(Json params) {

        if (params.contains(TrackClient.PACKAGE_IDENTIFIER_VALUE) && params.contains(TrackClient.PACKAGE_IDENTIFIER_TYPE)) {

            String value = params.string(TrackClient.PACKAGE_IDENTIFIER_VALUE);
            String type = params.string(TrackClient.PACKAGE_IDENTIFIER_TYPE);
            return Json.parse(this.fedexTrackClient.trackByPackageIdentifier(value, type));
        }

        logger.info("Tracking number can not be null");
        return null;

    }

}

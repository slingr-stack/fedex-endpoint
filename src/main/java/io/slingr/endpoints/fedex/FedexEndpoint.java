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

    @EndpointFunction(name = "_track")
    public Json track(Json params) {

        return Json.parse(this.fedexTrackClient.track(params));

    }

}

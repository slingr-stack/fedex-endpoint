package io.slingr.endpoints.fedex;

import io.slingr.endpoints.Endpoint;
import io.slingr.endpoints.framework.annotations.SlingrEndpoint;
import org.apache.log4j.Logger;

@SlingrEndpoint(name = "fedex")
public class FedexEndpoint extends Endpoint {
    private static final Logger logger = Logger.getLogger(FedexEndpoint.class);
}

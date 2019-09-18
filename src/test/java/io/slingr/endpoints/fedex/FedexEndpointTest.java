package io.slingr.endpoints.fedex;

import io.slingr.endpoints.utils.Json;
import io.slingr.endpoints.utils.tests.EndpointTests;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("For dev purposes only")
public class FedexEndpointTest {

    private static EndpointTests test;
    private static FedexEndpoint endpoint;

    @BeforeClass
    public static void init() throws Exception {
        test = EndpointTests.start(new io.slingr.endpoints.fedex.Runner(), "test.properties");
        endpoint = (FedexEndpoint) test.getEndpoint();
    }


    @Test
    public void testRequest() {

        // check tracks numbers in https://www.fedex.com/en-us/developer/web-services/process.html#develop
        String trackNumber = "449044304137821";

        Json params = Json.map()
                .set(TrackClient.PACKAGE_IDENTIFIER_VALUE, trackNumber)
                .set(TrackClient.PACKAGE_IDENTIFIER_TYPE, "TRACKING_NUMBER_OR_DOORTAG");

        FedexEndpoint endpoint = new FedexEndpoint();
        Json res = endpoint.trackByPackageIdentifier(params);

        Assert.assertNotNull(res);

    }

}

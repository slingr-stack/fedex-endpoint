package io.slingr.endpoints.fedex;

import com.fedex.ws.track.v18.TrackIdentifierType;
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
    public void trackByTrackNumber() {

        // check tracks numbers in https://www.fedex.com/en-us/developer/web-services/process.html#develop
        Json params = Json.map();
        params.set(TrackClient.REF, Json.map()
                .set("TRACKING_NUMBER_OR_DOORTAG", "449044304137821"));

        endpoint = new FedexEndpoint();
        Json res = endpoint.track(params);

        System.out.println(res.toString());
        Assert.assertNotNull(res);
    }



    @Test
    public void testByCustomerReferenceAndGroundShipmentId() {

        Json params = Json.map();
        params.set(TrackClient.REF, Json.map()
                .set("CUSTOMER_REFERENCE", "115380173")
                .set("GROUND_SHIPMENT_ID", "DMWsGWdnN"));
        params.set(TrackClient.SHIPMENT_ACCOUNT_NUMBER, "510088000");
//        params.set(TrackClient.SHIP_DATE, "2018-08-15");
        params.set(TrackClient.SHIP_DATE_BEGIN, "2018-08-15");
        params.set(TrackClient.SHIP_DATE_END, "2018-08-15");
//        params.set(TrackClient.POSTAL_CODE, "33126");
//        params.set(TrackClient.COUNTRY, "United States");

        endpoint = new FedexEndpoint();
        Json res = endpoint.track(params);

        System.out.println(res.toString());
        Assert.assertNotNull(res);

    }


    @Test
    public void testAtDestinationSortFacility() {

        Json params = Json.map();
        params.set(TrackClient.REF, Json.map()
                .set(TrackIdentifierType.SHIPPER_REFERENCE.toString(), "P218101_004154359")
                .set(TrackIdentifierType.PURCHASE_ORDER.toString(), "P218101_004154359"));
        params.set(TrackClient.SHIPMENT_ACCOUNT_NUMBER, "510088000");
//        params.set(TrackClient.SHIP_DATE, "2018-08-15");
        params.set(TrackClient.SHIP_DATE_BEGIN, "2018-08-15");
        params.set(TrackClient.SHIP_DATE_END, "2018-08-15");
        params.set(TrackClient.POSTAL_CODE, "33126");
        params.set(TrackClient.COUNTRY, "United States");

        endpoint = new FedexEndpoint();
        Json res = endpoint.track(params);

        System.out.println(res.toString());
        Assert.assertNotNull(res);

    }

}

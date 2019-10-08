package io.slingr.endpoints.fedex;

import com.fedex.ws.track.v18.*;
import io.slingr.endpoints.utils.Json;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TrackClient {

    private static final Logger logger = Logger.getLogger(TrackClient.class);

    public static final String REF = "ref";
    public static final String SHIPMENT_ACCOUNT_NUMBER = "shipmentAccountNumber";
    public static final String SHIP_DATE = "shipDate";
    public static final String SHIP_DATE_BEGIN = "shipDateBegin";
    public static final String SHIP_DATE_END = "shipDateEnd";
    public static final String POSTAL_CODE = "postalCode";
    public static final String COUNTRY = "country";
    public static final String COUNTRY_CODE = "countryCode";

    private String url;
    private String accountNumber;
    private String meterNumber;
    private String key;
    private String password;

    public TrackClient(String url, String accountNumber, String meterNumber, String key, String password) {
        this.url = url;
        this.accountNumber = accountNumber;
        this.meterNumber = meterNumber;
        this.key = key;
        this.password = password;
    }

    public String track(Json json) {

        TrackRequest request = new TrackRequest();

        request.setClientDetail(createClientDetail(accountNumber, meterNumber));
        request.setWebAuthenticationDetail(createWebAuthenticationDetail(key, password));

        VersionId versionId = new VersionId("trck", 18, 0, 0);
        request.setVersion(versionId);

        List<TrackSelectionDetail> selDetails = new ArrayList<>();
        if (json.json(REF) != null) {

            Json ref = json.json(REF);

            for (String key : ref.keys()) {
                TrackPackageIdentifier packageIdentifier = new TrackPackageIdentifier();
                packageIdentifier.setType(TrackIdentifierType.fromString(key));
                packageIdentifier.setValue(ref.string(key));

                TrackSelectionDetail selectionDetail = new TrackSelectionDetail();

                selectionDetail.setPackageIdentifier(packageIdentifier);

                if (json.string(SHIPMENT_ACCOUNT_NUMBER) != null) {
                    selectionDetail.setShipmentAccountNumber(json.string(SHIPMENT_ACCOUNT_NUMBER));
                }

                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    if (json.string(SHIP_DATE) != null) {
                        selectionDetail.setShipDateRangeBegin(sdf.parse(json.string(SHIP_DATE)));
                        selectionDetail.setShipDateRangeEnd(sdf.parse(json.string(SHIP_DATE)));
                    } else {
                        if (json.string(SHIP_DATE_BEGIN) != null) {
                            selectionDetail.setShipDateRangeBegin(sdf.parse(json.string(SHIP_DATE_BEGIN)));
                        }
                        if (json.string(SHIP_DATE_END) != null) {
                            selectionDetail.setShipDateRangeEnd(sdf.parse(json.string(SHIP_DATE_END)));
                        }
                    }

                    if (json.string(POSTAL_CODE) != null || json.string(COUNTRY) != null || json.string(COUNTRY_CODE) != null) {
                        Address address = new Address();
                        if (json.string(POSTAL_CODE) != null) {
                            address.setPostalCode(json.string(POSTAL_CODE));
                        }
                        if (json.string(COUNTRY) != null) {
                            address.setCountryName(json.string(COUNTRY));
                        }
                        if (json.string(COUNTRY_CODE) != null) {
                            address.setCountryCode(json.string(COUNTRY_CODE));
                        }
                        selectionDetail.setDestination(address);
                    }

                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                }

                selDetails.add(selectionDetail);
            }
        }

        request.setSelectionDetails(selDetails.toArray(new TrackSelectionDetail[selDetails.size()]));
        TrackRequestProcessingOptionType processingOption = TrackRequestProcessingOptionType.INCLUDE_DETAILED_SCANS;
        request.setProcessingOptions(new TrackRequestProcessingOptionType[]{processingOption});

        try {

            TrackServiceLocator service = new TrackServiceLocator();
            TrackPortType port;

            service.setTrackServicePortEndpointAddress(url);
            port = service.getTrackServicePort();

            TrackReply reply = port.track(request); // This is the call to the web service passing in a request object and returning a reply object

            return JSONUtils.toJson(reply, true);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }


    private ClientDetail createClientDetail(String accountNumberParam, String meterNumberParam) {

        ClientDetail clientDetail = new ClientDetail();

        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");

        if (accountNumber == null) {
            accountNumber = accountNumberParam;
        }
        if (meterNumber == null) {
            meterNumber = meterNumberParam;
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
    }

    private WebAuthenticationDetail createWebAuthenticationDetail(String keyParam, String passwordParam) {

        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();

        String key = System.getProperty("key");
        String password = System.getProperty("password");

        if (key == null) {
            key = keyParam;
        }

        if (password == null) {
            password = passwordParam;
        }

        userCredential.setKey(key);
        userCredential.setPassword(password);

        return new WebAuthenticationDetail(null, userCredential);
    }
}

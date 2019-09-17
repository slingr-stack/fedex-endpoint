package io.slingr.endpoints.fedex;

import com.fedex.ws.track.v18.*;
import org.apache.log4j.Logger;

public class TrackClient {

    private static final Logger logger = Logger.getLogger(TrackClient.class);

    public static final String TRACKING_NUMBER = "trackingNumber";

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

    public String track(String trackNumber) {

        TrackRequest request = new TrackRequest();

        request.setClientDetail(createClientDetail(accountNumber, meterNumber));
        request.setWebAuthenticationDetail(createWebAuthenticationDetail(key, password));

        VersionId versionId = new VersionId("trck", 18, 0, 0);
        request.setVersion(versionId);

        TrackSelectionDetail selectionDetail = new TrackSelectionDetail();
        TrackPackageIdentifier packageIdentifier = new TrackPackageIdentifier();
        packageIdentifier.setType(TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG);

        packageIdentifier.setValue(trackNumber); // tracking number

        selectionDetail.setPackageIdentifier(packageIdentifier);
        request.setSelectionDetails(new TrackSelectionDetail[]{selectionDetail});
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

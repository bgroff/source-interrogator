package source.interrogator.services.impls;

import jakarta.inject.Singleton;
import source.interrogator.domain.GoogleOAuth;
import source.interrogator.services.GoogleInterrogatorService;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class GoogleInterrogatorServiceImpl implements GoogleInterrogatorService {
    @Override
    public GoogleOAuth getOauthCredentials(String oauthSecretId) {
        var googleOAuth = new GoogleOAuth();
        googleOAuth.setAccessToken("MAGIC");
        googleOAuth.setClientId("Client_ID");
        googleOAuth.setRefreshToken("TOKEN");
        return googleOAuth;
    }

    @Override
    public Map<String, Object> getAccountInformation(GoogleOAuth oauthSecret) {
        // TODO: Actual Google Stuff Here

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("resourceName", "customers/1234567890");
        responseMap.put("descriptiveName", "Example Account");
        responseMap.put("currencyCode", "USD");
        responseMap.put("timeZone", "America/New_York");
        responseMap.put("trackingUrlTemplate", "");
        responseMap.put("finalUrlSuffix", "");
        responseMap.put("autoTaggingEnabled", false);
        responseMap.put("hasMccNotification", false);
        responseMap.put("canManageClients", false);
        responseMap.put("testAccount", false);
        responseMap.put("manager", false);
        responseMap.put("managerCustomerId", "1234567890");
        responseMap.put("testAccountToken", "");
        responseMap.put("callOnlyDefaultCountryCode", "");
        responseMap.put("callOnlyPhoneNumberVerificationUrl", "");
        responseMap.put("currencyConversionTimeZone", "");
        responseMap.put("id", "1234567890");
        return responseMap;
    }
}

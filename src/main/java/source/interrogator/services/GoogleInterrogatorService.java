package source.interrogator.services;

import source.interrogator.domain.GoogleOAuth;

import java.util.Map;

public interface GoogleInterrogatorService extends InterrogatorService<GoogleOAuth> {
    Map<String, Object> getAccountInformation(GoogleOAuth oauthSecret);
}

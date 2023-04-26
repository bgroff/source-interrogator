package source.interrogator.services;

public interface InterrogatorService <T extends Object> {
    T getOauthCredentials(String oauthSecretId);
}

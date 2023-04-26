package source.interrogator.routes;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.QueryValue;
import source.interrogator.dtos.InterrogateSourceRequest;
import source.interrogator.dtos.InterrogateSourceResponse;
import source.interrogator.dtos.SourceNameEnum;
import source.interrogator.services.GoogleInterrogatorService;

import java.util.Map;

@Controller("/")
public class InterrogateSource {
    final GoogleInterrogatorService googleInterrogatorService;

    public InterrogateSource(GoogleInterrogatorService googleInterrogatorService) {
        this.googleInterrogatorService = googleInterrogatorService;
    }

    @Get("/")
    InterrogateSourceResponse interrogateSource(@QueryValue SourceNameEnum sourceName, @QueryValue String oauthSecretId) {
        switch (sourceName) {
            case GOOGLE_ADS -> {
                final var oauthSecret = googleInterrogatorService.getOauthCredentials(oauthSecretId);
                final Map<String, Object> accountInformation = googleInterrogatorService.getAccountInformation(oauthSecret);

                var interrogateSourceResponse = new InterrogateSourceResponse();
                interrogateSourceResponse.setSourceName(SourceNameEnum.GOOGLE_ADS.value);
                interrogateSourceResponse.setData(accountInformation);
                return interrogateSourceResponse;
            }
            default -> {
                return new InterrogateSourceResponse();
            }
        }
    }
}

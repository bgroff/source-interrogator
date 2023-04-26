package source.interrogator.dtos;

public class InterrogateSourceRequest {

    SourceNameEnum sourceName;
    String secretName;

    public InterrogateSourceRequest(SourceNameEnum sourceName, String secretName) {
        this.sourceName = sourceName;
        this.secretName = secretName;
    }

    public SourceNameEnum getSourceName() {
        return sourceName;
    }

    public void setSourceName(SourceNameEnum sourceName) {
        this.sourceName = sourceName;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }
}

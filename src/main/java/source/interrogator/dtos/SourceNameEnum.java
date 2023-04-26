package source.interrogator.dtos;

public enum SourceNameEnum {
    GOOGLE_ADS("google-ads");
    public final String value;

    SourceNameEnum(String value) {
        this.value = value;
    }
}

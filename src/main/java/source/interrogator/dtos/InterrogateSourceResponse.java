package source.interrogator.dtos;

import java.util.Map;

public class InterrogateSourceResponse {
    String sourceName;
    Map data;

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}

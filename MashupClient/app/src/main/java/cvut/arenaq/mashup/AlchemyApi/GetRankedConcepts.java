package cvut.arenaq.mashup.AlchemyApi;

import java.util.List;

public class GetRankedConcepts {
    private String status;
    private String language;
    private List<Concept> concepts;

    public String getStatus() {
        return status;
    }

    public String getLanguage() {
        return language;
    }

    public List<Concept> getConcepts() {
        return concepts;
    }
}

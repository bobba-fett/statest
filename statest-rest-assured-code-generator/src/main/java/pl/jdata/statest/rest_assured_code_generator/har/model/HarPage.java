package pl.jdata.statest.rest_assured_code_generator.har.model;

import lombok.Data;

@Data
public class HarPage {

    private String startedDateTime;
    private String id;
    private String title;
    private PageTimings pageTimings;

}

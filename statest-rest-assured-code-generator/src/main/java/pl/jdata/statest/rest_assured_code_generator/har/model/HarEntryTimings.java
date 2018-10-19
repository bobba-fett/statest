package pl.jdata.statest.rest_assured_code_generator.har.model;

import lombok.Data;

@Data
public class HarEntryTimings {

    private Double blocked;
    private Double dns;
    private Double connect;
    private Double send;
    private Double wait;
    private Double receive;
    private Double ssl;

}

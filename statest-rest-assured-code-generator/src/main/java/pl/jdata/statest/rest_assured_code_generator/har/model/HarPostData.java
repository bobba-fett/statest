package pl.jdata.statest.rest_assured_code_generator.har.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class HarPostData {

    private String mimeType;
    private String text;
    private List<HarParam> params = new ArrayList<>();

}

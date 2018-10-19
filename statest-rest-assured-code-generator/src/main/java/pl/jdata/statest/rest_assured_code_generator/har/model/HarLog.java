package pl.jdata.statest.rest_assured_code_generator.har.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class HarLog {

    private String version;
    private HarCreator creator;
    private HarBrowser browser;
    private List<HarPage> pages = new ArrayList<>();
    private List<HarEntry> entries = new ArrayList<>();

}

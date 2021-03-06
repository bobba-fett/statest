package pl.jdata.statest.utils;

import org.junit.runner.RunWith;
import pl.jdata.statest.common.junit.Statest;
import pl.jdata.statest.common.junit.StatestRunner;
import pl.jdata.statest.common.junit.TestState;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(StatestRunner.class)
public class IntegrationTest {

    @Statest(order = 1, storeResultIn = "along")
    public long createNumber() {
        return 3L;
    }

    @Statest(order = 2, storeResultIn = "aString")
    public String convertNumberToString(@TestState(objectId = "along") Long number) {
        assertThat(number).isEqualTo(3L);
        return "some string";
    }

    @Statest(order = 3)
    public void getString(@TestState(objectId = "aString") String text) {
        assertThat(text).isEqualTo("some string");
    }
}

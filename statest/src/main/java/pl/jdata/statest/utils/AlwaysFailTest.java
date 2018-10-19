package pl.jdata.statest.utils;

import org.junit.runner.RunWith;
import pl.jdata.statest.common.junit.Statest;
import pl.jdata.statest.common.junit.StatestRunner;

@RunWith(StatestRunner.class)
public class AlwaysFailTest {

    @Statest
    public void testIt() {
        throw new RuntimeException("Mysterious message");
    }

}

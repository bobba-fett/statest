package pl.jdata.statest.utils;

import pl.jdata.statest.common.junit.Statest;
import pl.jdata.statest.common.junit.StatestRunner;
import org.junit.runner.RunWith;

@RunWith(StatestRunner.class)
public class AlwaysFailTest {

    @Statest
    public void testIt() {
        throw new RuntimeException("Mysterious message");
    }

}

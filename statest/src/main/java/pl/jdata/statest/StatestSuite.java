package pl.jdata.statest;

import pl.jdata.statest.common.junit.StatestSuiteDefinition;
import pl.jdata.statest.common.junit.StatestSuiteJUnitRunner;
import org.junit.runner.RunWith;

@RunWith(StatestSuiteJUnitRunner.class)
public class StatestSuite {

    @StatestSuiteJUnitRunner.DefinitionFactory
    public static StatestSuiteDefinition createDefinition() {
        return StatestSuiteDefinition.Builder.newInstance()
                .testStep(StatestSuite.class)
                .build();
    }

}

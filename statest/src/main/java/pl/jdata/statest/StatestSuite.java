package pl.jdata.statest;

import org.junit.runner.RunWith;
import pl.jdata.statest.common.junit.StatestSuiteDefinition;
import pl.jdata.statest.common.junit.StatestSuiteJUnitRunner;

@RunWith(StatestSuiteJUnitRunner.class)
public class StatestSuite {

    @StatestSuiteJUnitRunner.DefinitionFactory
    public static StatestSuiteDefinition createDefinition() {
        return StatestSuiteDefinition.Builder.newInstance()
                .testStep(StatestSuite.class)
                .build();
    }

}

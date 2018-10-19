package pl.jdata.statest.common;

import java.util.Map;
import java.util.Random;

import com.google.common.collect.ImmutableMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.jdata.statest.common.junit.CustomParameterFactory;
import pl.jdata.statest.common.junit.TestStateRepository;

public class TestGenerateParameterFactory implements CustomParameterFactory<TestGenerate> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestGenerateParameterFactory.class);

    private static final Map<Class<?>, ParameterValueGenerator<?>> PARAMETER_GENERATORS =
            ImmutableMap.of(
                    Integer.class, new IntegerParameterGenerator()
            );

    @Override
    public Class<TestGenerate> getSupportedAnnotationClass() {
        return TestGenerate.class;
    }

    @Override
    public <T> T getParameter(TestGenerate annotation, Class<T> parameterClass,
                               TestStateRepository testStateRepository) {
        final ParameterValueGenerator<T> parameterValueGenerator = getParameterGenerator(parameterClass);

        final T result = parameterValueGenerator.generate();

        LOGGER.info("Generated parameter value: " + result);

        return result;
    }

    private <T> ParameterValueGenerator<T> getParameterGenerator(Class<T> parameterClass) {
        @SuppressWarnings("unchecked")
        final ParameterValueGenerator<T> result = (ParameterValueGenerator<T>) PARAMETER_GENERATORS.get(parameterClass);

        if (result == null) {
            throw new RuntimeException(
                    "Class " + parameterClass.getName() + " is not supported by @TestGenerate annotation.");
        }

        return result;
    }

    private interface ParameterValueGenerator<T> {
        T generate();
    }

    private static class IntegerParameterGenerator implements ParameterValueGenerator<Integer> {
        private static final Random random = new Random();

        @Override
        public Integer generate() {
            return random.nextInt();
        }
    }

}

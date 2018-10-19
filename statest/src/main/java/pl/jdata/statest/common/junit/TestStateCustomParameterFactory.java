package pl.jdata.statest.common.junit;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.jdata.statest.common.StatestUtils;

public class TestStateCustomParameterFactory implements CustomParameterFactory<TestState> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestStateCustomParameterFactory.class);

    @Override
    public Class<TestState> getSupportedAnnotationClass() {
        return TestState.class;
    }

    @Override
    public <T> T getParameter(TestState annotation, Class<T> parameterClass,
                              TestStateRepository testStateRepository) {
        final String parameterId = determineObjectId(parameterClass, annotation);
        try {
            final T result = testStateRepository.load(parameterId, parameterClass);
            LOGGER.info("Loaded test state object. Id: " + parameterId + ", value: " + result);
            return result;
        } catch (TestStateObjectDoesNotExistException e) {
            if (annotation.optional()) {
                return null;
            }
            throw e;
        }
    }

    private String determineObjectId(Class<?> parameterType, TestState annotation) {
        return StringUtils.isEmpty(annotation.objectId())
                ? StatestUtils.defaultObjectId(parameterType) : annotation.objectId();
    }

}

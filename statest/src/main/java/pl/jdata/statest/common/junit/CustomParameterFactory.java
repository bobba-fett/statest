package pl.jdata.statest.common.junit;

import java.lang.annotation.Annotation;

public interface CustomParameterFactory<T extends Annotation> {

    Class<T> getSupportedAnnotationClass();

    /**
     * This method assuress that generated parameter is of class <i>parameterClass</i>.
     *
     * @param annotation a test generator annotation.
     * @param parameterClass expected generated parameter class.
     * @param <S> target parameter class
     */
    <S> S getParameter(T annotation, Class<S> parameterClass, TestStateRepository testStateRepository);
}

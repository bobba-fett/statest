package pl.jdata.statest.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import pl.jdata.statest.common.junit.CustomParameterFactory;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AnnotatedParameterFactories {

    Class<? extends CustomParameterFactory<?>>[] value();

}

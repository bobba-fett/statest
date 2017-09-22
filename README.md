# About statest

Statest is a test library to perform tests which might pass state between test method calls.

Statest is based on junit 4. Defines custom junit runner.

Sample usage:
```java
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
```

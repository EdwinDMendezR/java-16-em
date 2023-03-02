package records;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnotacionesRecordTest {

    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation {
        String value();
    }

    @MyAnnotation("Hello")
    public record Person(@MyAnnotation("Name") String name, int age) {
        public void printNameAndAge() {
            System.out.printf("Name: %s, Age: %d%n", name, age);
        }
    }

    @Test
    public void methodTest() {
        Person person = new Person("name", 1);
        person.printNameAndAge();
    }

}

package records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClonacionRecordTest {

    public record Person(String name, int age) implements Cloneable {
        public Person {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }

        @Override
        public Person clone() throws CloneNotSupportedException {
            return (Person) super.clone();
        }
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Person person = new Person("personA", 2);
        Person clone = person.clone();
        Assertions.assertNotSame(person, clone);
    }

    @Test
    public void cloneErrorTest() {
        try {
            Person person = new Person("personA", -1);
            Assertions.fail("Debe Generrar Error");
        } catch (Exception e) {
            Assertions.assertEquals("Age cannot be negative", e.getLocalizedMessage());
        }

    }

}

package records;

public class DesestruturacionRecordTest {

    public record Person(String name, int age) {
        public void printNameAndAge() {
            //var (firstName, lastName) = name.split(" ");
            //System.out.printf("Name: %s %s, Age: %d%n", firstName, lastName, age);
        }
    }


}

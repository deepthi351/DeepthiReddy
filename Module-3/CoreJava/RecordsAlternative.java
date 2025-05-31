import java.util.List;
import java.util.stream.Collectors;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class RecordsAlternative {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 20);
        Person p3 = new Person("Charlie", 25);
        System.out.println(p1);
        List<Person> people = List.of(p1, p2, p3);
        List<Person> adults = people.stream()
            .filter(p -> p.getAge() >= 25)
            .collect(Collectors.toList());
        System.out.println("Adults: " + adults);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

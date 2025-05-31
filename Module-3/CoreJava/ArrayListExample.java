import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter student names (type 'exit' to finish):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            students.add(input);
        }
        System.out.println("Students entered:");
        for (String name : students) {
            System.out.println(name);
        }
        scanner.close();
    }
}

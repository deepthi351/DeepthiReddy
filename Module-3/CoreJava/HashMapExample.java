import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter student ID and name (type 'exit' to finish):");
        while (true) {
            System.out.print("ID: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            int id = Integer.parseInt(input);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("Enter ID to retrieve name: ");
        int searchId = scanner.nextInt();
        if (studentMap.containsKey(searchId)) {
            System.out.println("Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
        scanner.close();
    }
}

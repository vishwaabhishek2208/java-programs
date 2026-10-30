
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();

        while (true) {
            System.out.print("Enter Roll Number (0 to exit): ");
            int rollnum = sc.nextInt();
            sc.nextLine();

            if (rollnum == 0) {
                break;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            map.put(rollnum, name);

            System.out.println("Student added successfully");
        }

        System.out.println("All Student Details:");
        System.out.println(map);

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        if (map.containsKey(searchRoll)) {
            System.out.println("Student Name: " + map.get(searchRoll));
        } else {
            System.out.println("Student not found!");
        }

        sc.close();
    }
}


import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();

        System.out.print("Enter your RollNumber: ");
        int rollnum = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        map.put(rollnum, name);

        System.out.println("Student Details: " + map);

        System.out.println("Does the RollNumber exist? " + map.containsKey(rollnum));

        sc.close();
    }
}

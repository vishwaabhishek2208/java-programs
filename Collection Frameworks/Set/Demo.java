import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Abhishek");
        set.add("Rohit");
        set.add("Aditya");
        set.add("Abhishek");// it will not stored in the memory b/z duplicates are not allowed

        System.out.println(set);

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Abhishek");
        map.put(102, "Aditya");
        map.put(103, "Abhishek");

        System.out.println(map);

    }
}

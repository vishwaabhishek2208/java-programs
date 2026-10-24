import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Abhishek");
        name.add("Aditya");
        name.add("Aniket");
        name.add("Aman");

        System.out.println(name);

        name.set(1, "Adarsh");
        System.out.println(name);

        name.remove(2);
        System.out.println(name);

        Iterator<String> it = name.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        name.add(2, "Anika");
        System.out.println(name);

        System.out.println(name.size());

        name.addLast("Suman");
        System.out.println(name);

        name.addFirst("Suman");
        System.out.println(name);

    }
}

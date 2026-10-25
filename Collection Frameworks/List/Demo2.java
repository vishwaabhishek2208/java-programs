import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.remove(0);
        System.out.println(list);

        list.set(0, 2);
        System.out.println(list);

        list.addAll(3, List.of(5, 6, 7));
        System.out.println(list);

        System.out.println(list.indexOf(5));

        System.out.println(list.lastIndexOf(5));

        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        // l.add(9);

        List<Integer> l2 = List.copyOf(l); // unmodifiable list
        // l2.add(7); can't do that

        System.out.println(l2);

    }
}

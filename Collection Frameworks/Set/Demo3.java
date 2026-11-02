import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // TreeSet

        TreeSet<Integer> set = new TreeSet<>();

        // Set<Integer> set2 = new TreeSet<>();

        set.add(80);
        set.add(60);
        set.add(45);
        set.add(90);
        set.add(10);
        set.add(23);

        // SortedSet Interface --> O(log N)

        System.out.println(set.first());// smallest element
        System.out.println(set.last());// Biggest element

        System.out.println(set.headSet(80));// all element below 80

        // fromElement is inclusive
        System.out.println(set.tailSet(80));// all element above 80

        // fromElement is inclusive and toElement is Exclusive
        System.out.println(set.subSet(23, 80));

        // Navigable set

        // Largest number smaller than 80
        System.out.println(set.lower(80));

        // Smallest number greater than 80
        System.out.println(set.higher(80));

        // Smallest no. greater than or equal to 80
        System.out.println(set.ceiling(80));

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());

        System.out.println(set.descendingSet());

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(set.headSet(80, true));
        set.tailSet(80, false);
        set.subSet(10, false, 80, true);
    }

}
// BST --> leftest most node --> smallest
// rightest most node. --> largest

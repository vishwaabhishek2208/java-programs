import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

// Iterable
// 10-->20-->30-->40-->50

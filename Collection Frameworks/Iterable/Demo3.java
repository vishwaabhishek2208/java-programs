import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            int value = it.next();
            if (value == 30) {
                list.remove(value);
            }

            System.out.println(value);
        }
    }
}

// Concurrent Modidification Exception --> Fail fast

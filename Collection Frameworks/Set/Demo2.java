import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        // constructor of HashSet/ LinkedHashSet

        Set<Integer> set = new HashSet<>();

        // Initial capicity
        Set<Integer> set2 = new HashSet<>(100);

        // capacity/ loadfactor
        Set<Integer> set3 = new HashSet<>(100, 0.8f);

        // using another collection
        Set<Integer> set4 = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7));

        // constructor of HashSet/ LinkedHashSet

        Set<Integer> set5 = new LinkedHashSet<>();

        // Initial capicity
        Set<Integer> set6 = new LinkedHashSet<>(100);

        // capacity/ loadfactor
        Set<Integer> set7 = new LinkedHashSet<>(100, 0.8f);

        // using another collection
        Set<Integer> set8 = new LinkedHashSet<>(List.of(1, 2, 3, 4, 5, 6, 7));

    }

}

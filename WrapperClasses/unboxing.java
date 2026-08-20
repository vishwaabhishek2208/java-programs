public class unautobox {
    public static void main(String[] args) {

        // Autoboxing
        int x = 10;
        Integer y = x; // autoboxing

        System.out.println(x);
        System.out.println(y); // unboxing

        // Unboxing
        Integer a = 20; // Autoboxing
        int b = a; // unboxing

        System.out.println(a); // unboxing
        System.out.println(b);

        int m = 50;
        printInteger(m);

        Integer c = 10;
        Integer d = 20;

        int sum = c.intValue() + d.intValue();
        System.out.println(sum);

        Integer p = null;
        int q = p;

        System.out.println(q);
    }

    static void printInteger(Integer x) {
        System.out.println(x);
    }
}
// 1. Assignments
// 2. Method calls
// 3. Arithmetic operations

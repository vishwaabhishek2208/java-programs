public class demo {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println(x == y);

        Integer a = 100;
        Integer b = 100;
        // a == b --> If a and b points to same refrence

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

}

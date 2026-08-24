public class scope {

    static String name = "Abhishek"; // Global scope

    public static void main(String[] args) {

        // scope of a variable

        int x = 2; // local scope
        int y = 5;

        if (x == 2) {
            int j = 7;
            System.out.println(j);
        }

        System.out.println(x + " ," + y);

        System.out.println(name);

        fun();
    }

    static void fun() {
        int x = 4; // local scope
        int y = 5;
        System.out.println(x + " , " + y);

        System.out.println(name);
    }
}

public class Foverload {
    public static void main(String[] args) {
        // Function overloading

        int x = sum(2, 3);
        System.out.println(x);

        int y = sum(5, 6);
        System.out.println(y);

        int z = sum(2, 4, 5);
        System.out.println(z);

        greet("Abhishek", 20);
        greet(20, "Abhishek");
    }

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    static double sum(double a, double b) {
        return (int) (a + b);
    }

    static void greet(String name, int age) {
        System.out.println("Hii " + name + ". Your age is " + age);
    }

    static void greet(int age, String name) {
        System.out.println("Hi " + name + ". Your age is " + age);
    }

    static void fun() {
        System.out.println("hello");

    }

    static int fun2() {
        System.out.println("Hello");
        return 5;
    }

}

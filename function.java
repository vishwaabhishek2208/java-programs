public class funtion {
    public static void main(String[] args) {
        // function in java

        greet();

        sayHello("Abhishek");

        System.out.println(getNumber());

        System.out.println(multiply(2, 4)); // 8

        return; // optionalStstic
    }

    // No Ip, No Op
    static void greet() {
        System.out.println("Hello");
        return;

    }

    // Ip, No Op
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // No Ip, Op
    static int getNumber() {
        return 10;
    }

    // Ip, Op

    static int multiply(int a, int b) {
        return (a * b);
    }
}

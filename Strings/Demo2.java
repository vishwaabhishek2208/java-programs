public class Demo2 {
    public static void main(String[] args) {
        String s1 = "Ja" + "va"; // Java
        String s2 = "Java";

        System.out.println(s1 == s2);

        String s3 = "Hello";
        String s4 = s3 + "World";
        String s5 = "Hello World";

        System.out.println(s4 == s5);// False

        String s6 = "Hello";
        String s7 = s6;

        System.out.println(s6 == s7); // True

        String s8 = "Hello";
        s8 = "world";

        System.out.println(s8);

        String s9 = new String("Hello");
        String s10 = "Hello";

        System.out.println(s9 == s10);// False
    }

}
// String pool --> Hello
// Heap --> Hello

// String pool -> "Hello, " World", "Hello World"
// Heap --> "Hello World"

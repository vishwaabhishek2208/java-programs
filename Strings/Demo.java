public class Demo {
    public static void main(String[] args) {
        String s1 = "Hello";// Literals --> in StringPool
        String s2 = "Hello";

        System.out.println(s1 == s2);

        String s3 = new String("Aditya");
        String s4 = new String("Abhishek");

        System.out.println(s3 == s4);// False -->in Heap having different Objects
    }
}

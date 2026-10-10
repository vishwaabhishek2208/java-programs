public class Demo4 {
    public static void main(String[] args) {
        String s1 = new String();

        // String
        String s2 = new String("Hello");

        String s3 = "Abhishek";
        String s4 = new String(s3);

        // Char array
        char[] arr = { 'A', 'b', 'h', 'i', 's', 'h', 'e', 'k', ' ', 'S', 'h', 'a', 'r', 'm', 'a' };
        String s5 = new String(arr);

        System.out.println(s5);

        // char array subset
        String s6 = new String(arr, 0, 2); // [0,2)

        System.out.println(s6);

        byte[] arr2 = { 97, 98, 99 };
        String s7 = new String(arr2, 0, 2);

        System.out.println(s7);

        // StringBuilder / StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        String s8 = new String(sb);

        System.out.println(s8);
    }
}

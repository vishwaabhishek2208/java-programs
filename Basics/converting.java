public class converting {
    public static void main(String[] args) {
        // 1.Implicit conversion
        // (byte to int)
        // byte b = 24;
        // int i;
        // i = b;
        // System.out.println(i);

        // // char to int
        // char c = 'a';
        // int i;
        // i = c;
        // System.out.println(i);

        // 2. Explicit conversion
        // int i = 300;
        // byte b;
        // b = (byte) i;
        // System.out.println(b);// 300%256 = 44

        // 3. Truncating conversion
        // float f = 15.678f;
        // int i;
        // i = (int) f;
        // System.out.println(i);//.678 --> truncated

        // Boolean to any datatypes
        // These cpnversions are not possible

        byte b = 50;
        b = (byte) (b * 2);
        System.out.println(b);
    }

}

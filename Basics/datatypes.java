public class datatypes {
    public static void main(String[] args) {
        // Integers --> byte, short , int, long
        // Binary(2), octal(8), hexadecimal(16) number system
        // byte = 10; //decimal
        // byte = 0b101; //Binary
        // byte b = 07; //Octal
        byte b = 0XA; // hexadecimal ( 0 - 15 ) --> 0-9, A,B,C,D,E,F
        short s = 100;
        int i = 1000;
        long l = 10000;

        // Real numbers
        float f = 10.5f;
        double d = 20.123;

        // Character
        char c = 'a'; // 'a' --> integer --> binary --> store

        // Bollean
        Boolean bool = false;

        System.out.println("Integer values --> " + b + " " + s + " " + i + " " + l);
        System.out.println("Floating values --> " + f + " , " + d);
        System.out.println("Characters values --> " + c);
        System.out.println("Boolean value --> " + bool);
    }

}

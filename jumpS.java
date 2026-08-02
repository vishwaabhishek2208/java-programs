public class loops1 {
    public static void main(String[] args) {
        // int i = 1 , j;

        // comma separated variation
        // for (i = 1, j = 1; i <= 10 && j <= 5; i++, j += 2) {
        // System.out.println(i * j);
        // }

        // boolean b = true;
        // for( i = 1; b == true; i++) {
        // if(condition) {
        // b= false;
        // }

        // }

        // Integer --> byte, short, int, long

        // for(int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // Nested loops
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // jump statements in java
        // Break and continue

        // boolean b = false;
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // if (b == true) {
        // break;
        // }
        // }

        // Whether a number prime or not
        // int p = 7;

        // int i;
        // for (i = 2; i < p; i++) {
        // if (p % i == 0) {
        // System.out.println("The number is not prime");
        // break;
        // }
        // }
        // if (i == p) {
        // System.out.println("The number is prime");
        // }

        // continue

        // for (int i = 1; i <= 10; i++) {
        // if (i % 2 == 0) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // break in nested loops
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");

        // if (j <= 5) {
        // continue;
        // }
        // }
        // System.out.println();
        // }

        // lebels

        outer: for (int i = 1; i <= 10; i++) {
            inner: for (int j = 1; j <= i; j++) {
                System.out.print("* ");

                if (j >= 5) {
                    break outer;
                }
            }
            System.out.println();
        }

    }

}

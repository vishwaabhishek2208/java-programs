public class conditional {
    public static void main(String[] args) {

        // Selection statements
        // Normal if
        int i = 7;
        if (i > 5) {
            System.out.println("i is greater than 5");

        } else {
            System.out.println("i is less than or equal to 5");
        }

        int j = 7;
        if (j % 2 == 0) {
            System.out.println("j is even");
        } else {
            System.out.println("j is odd");
        }

        // Nested ifs
        int k = 5;
        if (k < 5) {
            if (k > 5) {
                if (k == 5) {

                }
            } else {

            }
        } else {

        }

        // if-else-if ladder
        int age = 50;

        if (age > 80) {
            System.out.println("You are very old");
        } else if (age == 50) {
            System.out.println("You are mid age");

        } else if (age > 40) {
            System.out.println("You are becoming mid age ");
        } else {
            System.out.println("You are adult");
        }

    }

}

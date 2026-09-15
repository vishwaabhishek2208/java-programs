import java.util.Scanner;

public class great {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the greatest number ");
        } else if (b > a && b > c) {
            System.out.println("b i the greatest number ");
        } else {
            System.out.println("c is the greatest number ");
        }

        sc.close();
    }

}

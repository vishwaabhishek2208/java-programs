import java.util.Scanner;

public class Demo5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name :");
    String name = sc.nextLine();

    System.out.print("Enter your age :");
    int age = sc.nextInt();

    System.out.println("You are " + name + ", and you are " + age + "years old");
    sc.close();
  }
}

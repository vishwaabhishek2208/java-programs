public class calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int operator = 1;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        switch (operator) {
            case 1:
                System.out.println("summation is :" + sum);
                break;

            case 2:
                System.out.println("subtraction is :" + sub);
                break;

            case 3:
                System.out.println("multiplication is :" + mul);
                break;

            case 4:
                System.out.println("division is :" + div);
                break;

            default:
                System.out.println("Invalid input!");
        }
    }

}

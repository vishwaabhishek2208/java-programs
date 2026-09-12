package nestedclass;

public class statc {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner(outer);

        inner.fun();
    }
}

// Static nested class
class Outer {

    private static int x = 4;
    int y = 5;

    static class Inner {

        Outer outer;

        Inner(Outer outer) {
            this.outer = outer;
        }

        void fun() {
            System.out.println(x);
            System.out.println(outer.y);
        }

        static void fun2() {
            System.out.println("This is static method fun2()");
        }
    }
}

// Example of private static nested class
class BankAccount {

    private static class IntrestCalculator {

        static double calculateYearly(double balance, double rate) {
            return balance * rate;
        }
    }

    public double computeIntrest(double principal, double rate) {
        return IntrestCalculator.calculateYearly(principal, rate);
    }
}

// Use cases of static nested classes :
/*
 * 1. As helper class for any outer class.
 * 2. Builder Design pattern
 * 3. If you want to have static methods inside a nested class.
 * 4. Request/Response DTO
 * 
 */

package nestedclass;

public class in {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.fun();
        Outer.Inner.fun2();
    }

}

class Outer {

    int x = 10;

    class Inner {
        // int x = 20;

        // Outer outer;

        static int x = 10;

        void fun() {
            System.out.println(x);
            System.out.println(Outer.this.x);

        }

        static void fun2() {
            System.out.println("Hello");
        }
    }

}

public class Demo3 {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
        c.fun2();
    }

}

// Multiple inheritance

interface A {
    void fun();

}

interface B {
    void fun2();

}

class C implements A, B {
    @Override
    public void fun() {
        System.out.println("Hello sir!");
    }

    @Override
    public void fun2() {
        System.out.println("Hello madam!");
    }
}

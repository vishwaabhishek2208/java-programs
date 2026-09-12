package nestedclass;

public class lc {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }

}

// Effective final variable

class Outer {
    void greet() {
        int y = 5;
        y++;

        class Local {
            void sayHello() {
                System.out.println("Hello");
            }
        }

        Local local = new Local();
        local.sayHello();
    }
}

/*
Contructor
Method
If
Loop
Static block
*/

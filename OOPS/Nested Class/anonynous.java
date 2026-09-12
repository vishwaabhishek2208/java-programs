package nestedclass;

public class anyms {
    public static void main(String[] args) {
        String name = "Abhishek";

        // Instantiating Person with an anonymous inner class override
        Person p2 = new Person() {
            @Override
            void introduce() {
                greet();
                System.out.println("Hi, I am " + name);
            }

            void greet() {
                System.out.println("Hello");
            }
        };

        // Call the method on the overridden instance
        p2.introduce();
    }
}

class Person {
    Person() {

    }

    void introduce() {
        System.out.println("Hi, I am a person");
    }
}
// class Guest extends Person {
//     @Override
//     void introduce() {
//         System.out.println("Hi, I am a Guest");
//     }
// }

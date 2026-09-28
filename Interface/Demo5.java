public class Demo5 {
    public static void main(String[] args) {
        Vehicle v = new Cae();
        v.drive();
    }
}

// After Java 8 --> Default Methods, Static methods
// From Java 9 -> Private methods

// List Interface --> methods

// interface List {
// default void pushBack() {

// }
// }

interface Vehicle {
    default void drive() {
        System.out.println("Vehicle is driving");
        accelerate();
    }

    static void brake() {
        System.out.println("Vehicle is applying brake");
    }

    private void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
}

class Cae implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

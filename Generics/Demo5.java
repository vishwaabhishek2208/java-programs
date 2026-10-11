public class Demo5 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.value = 10;
        b1.printDoubleI();
    }
}

// Generics --> T can be anything
// Bounds in Generics
// Upper bound --> T is atleast Number or its subtype

class Box<T extends Number> {
    T value;

    public void printDoubleI() {
        System.out.println(value.doubleValue());
    }
}

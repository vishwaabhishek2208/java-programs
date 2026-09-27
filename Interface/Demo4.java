public class Demo4 {
    public static void main(String[] args) {
        StreetDog s = new StreetDog();
        s.eat();
        s.bark();
    }

}

// Interface Inheritance

interface Animal {
    void eat();

}

interface Dog extends Animal {
    void bark();

}

class StreetDog implements Dog {
    @Override
    public void eat() {
        System.out.println("The Dogs are Eating");
    }

    @Override
    public void bark() {
        System.out.println("The Dogs are barking");
    }
}

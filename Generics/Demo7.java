public class Demo7 {
    public static void main(String[] args) {
        Box<Fish> b = new Box<>();
        System.out.println(b);
    }
}

class Box<T extends Animal & Swimmable> {
    T value;
}

class Animal {
    void display() {
        System.out.println("Displaying Animal");
    }
}

interface Swimmable {
    void swim();
}

class Dog extends Animal {
    void show() {
        System.out.println("Dog is Barking");
    }
}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is Swimming");
    }
}

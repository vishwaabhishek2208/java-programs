import java.util.ArrayList;
import java.util.List;

public class Demo10 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        fun(dogs);
    }

    public static void fun(List<? extends Animal> values) {
        for (Animal a : values) {
            a.eat();
        }

        // values.add(new Dog());
    }
}

class Animal {
    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meowing");
    }
}

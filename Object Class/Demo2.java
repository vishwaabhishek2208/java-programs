public class Demo2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Animal();

        System.out.println(a.getClass().getName());
        System.out.println(d.getClass().getName());

        System.out.println(a instanceof Dog);
        System.out.println(d instanceof Animal);
    }

}

class Animal {

}

class Dog extends Animal {

}

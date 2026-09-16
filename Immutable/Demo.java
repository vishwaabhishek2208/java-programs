public class Demo {
    public static void main(String[] args) {
        Student s = new Student("Abhishek", 20, 06, "LNCTS");
        System.out.println("Name :" + s.getName());
        System.out.println("Age : " + s.getAge());
        System.out.println("Roll Number : " + s.getrollNumber());
        System.out.println("College : " + s.getCollege());

    }
}

final class Student {
    private final String name;
    private final int age;
    private final int rollNumber;
    private final String college;

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getrollNumber() {
        return this.rollNumber;
    }

    public String getCollege() {
        return this.college;
    }

}

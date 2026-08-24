public class overcons {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Abhishek");
        Student s3 = new Student("Aniket", 21);
        Student s4 = new Student("Rohan", 22, 101);
        Student s5 = new Student("Aditya", 28, 102, "IITG");

        System.out.println(s1.name);
        System.out.println(s2.age);
        System.out.println(s3.name);
        System.out.println(s4.rollNum);
        System.out.println(s5.college);
    }

}

class Student {
    String name;
    int age;
    int rollNum;
    String college;

    Student() {
        this("Unknown");
    }

    Student(String name) {
        this(name, 0);
    }

    Student(String name, int age) {
        this(name, age, 0);
    }

    Student(String name, int age, int rollNum) {
        this(name, age, rollNum, "LNCTS");
    }

    Student(String name, int age, int rollNum, String college) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
    }

    void markAttendence() {
        System.out.println("Attendemce marked by student " + name);
    };
}

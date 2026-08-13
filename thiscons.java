public class thiscons {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek", 20, 240, "LNCTS");
        Student s2 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNum);
        System.out.println(s2.college);
    }

}

class Student {
    String name;
    int age;
    int rollNum;
    String college;

    Student() {

    }

    Student(String name, int age, int rollNum, String college) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
    }
}

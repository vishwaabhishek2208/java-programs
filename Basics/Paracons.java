public class Pconstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek", 20, 240, "NCTS");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

    }

}

class Student {
    String name;
    int age;
    int rollNum;
    String college;

    Student(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNum = rn;
        college = c;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
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

    Student() {
        name = "Abhishek";
        age = 20;
        rollNum = 240;
        college = "LNCTS";
    }
}

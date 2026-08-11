public class oops1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Abhishek";
        s1.age = 20;
        s1.rollNumber = 240;
        s1.college = "LNCTS";

        s2.name = "Aniket";
        s2.age = 21;
        s2.rollNumber = 240;
        s2.college = "LNCTS";

        s1.markAttendence();
        s2.markAttendence();

        s1.print();
        s2.print();

    }

}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendence() {
        System.out.println("Attendence marked by " + name);
    }

    void print() {
        System.out.println(name + " ," + age + " , " + rollNumber + " , " + college);
    }
}

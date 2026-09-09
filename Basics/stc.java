public class stc {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 20;
        s1.rollNum = 240;

        System.out.println(
                s1.name + " , " + s1.age + " , " + s1.rollNum + " , " + Student.college + " , " + Student.grade);

        Random r1 = new Random(3.14);
        System.out.println(r1.PI);
    }

}

class Student {
    String name;
    int age;
    int rollNum;
    static String college;
    static int grade;

    static {
        college = "LNCTS";
        grade = 9;
    }
}

class Random {
    final double PI;

    Random(final double PI) {
        this.PI = PI;
    }
}
public class inhertn {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent("Abhishek", 20, 240, "LNCTS");
        es.print();

    }
}

class St {
    String name;
    int age;
    int rollNumber;
    String college;

    St() {
    }

    St(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;

    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNumber);
    }
}

class EngineeringStudent extends St {
    String college;

    EngineeringStudent(String name, int age, int rollNumber, String college) {
        super(name, age, rollNumber, college);
        this.college = college;
    }

    void print() {
        super.print();
        System.out.println(college);
    }

}

//types of inheritence
// 1. Simple inheritence
// 2. multilevel inheritence
// 3. hierarchical inheritence
// multiple inheritence (not supported in java)

public class inh {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.name = "Abhishek";
        es.age = 20;
        es.college = "LNCTS";

        es.attendLab();
        es.markAttendance();
        System.out.println(es.name + " , " + es.age + " , " + es.rollNumber + " , " + es.college);

    }

}

// 1.Simple inheritence

class Student {
    String name;
    int age;
    String college;

    void markAttendance() {
        System.out.println("Attendence marked");
    }

}

class EngineeringStudent extends Student {
    void attendLab() {
        System.out.println("Lab Attended");
    }

}

/*
 * 2.Multi-level
 * 
 * Student
 * |
 * EngineeringStudent
 * |
 * CSEEngineeringStudent
 */

/*
 * 3.Hierrarchy
 * A
 * / \
 * B C
 * 
 */

/*
 * Multiple
 * A B
 * \ / --> not possible
 * C
 */

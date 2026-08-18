//types of inheritence
// 1. Simple inheritence
// 2. multilevel inheritence
// 3. hierarchical inheritence
// multiple inheritence (not supported in java)

public class inhert2 {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.name = "Abhishek";
        es.age = 20;
        es.rollNumber = 240;
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
    int rollNumber;
    String college;

    // Student(String name, int age, int rollNumber, String college) {
    // this.name = name;
    // this.age = age;
    // this.rollNumber = rollNumber;
    // this.college = college;
    // }

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
2.Multi-level

Student 
|
EngineeringStudent
|
CSEEngineeringStudent
*/

/*
3.Hierrarchy 
        A
      /   \
     B     C 

*/

/*
Multiple 
        A   B
         \ / --> not possible
          C
*/ 

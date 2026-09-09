public class parc {
    public static void main(String[] args) {
        Std s1 = new Std("Abhishek", 20, 240, "NCTS");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

    }

}

class Std {
    String name;
    int age;
    int rollNum;
    String college;

    Std(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNum = rn;
        college = c;
    }
}

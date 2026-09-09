public class construct {
    public static void main(String[] args) {
        Bachelor s1 = new Bachelor();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);
    }

}

class Bachelor {
    String name;
    int age;
    int rollNum;
    String college;

    Bachelor() {
        name = "Abhishek";
        age = 20;
        rollNum = 240;
        college = "LNCTS";
    }
}

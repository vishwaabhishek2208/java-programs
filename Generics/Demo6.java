public class Demo6 {
    public static void main(String[] args) {
        Integer i = getResult(25);
        System.out.println(i);

        printPair("Abhishek", 20);
    }

    public static <T> T getResult(T x) { // <T> Type Parameter
        return x;
    }

    public static <T, U> void printPair(T first, U second) {
        System.out.println(first + " , " + second);
    }

}

// Generic Methods
// <T> returnType methodName(T parameter) {}

public class Demo2 {
    public static void main(String[] args) {
        // int status = PaymentStaus2.SUCCESS;

        // System.out.println(status);

        PaymentStatus status = PaymentStatus.FAILED;

        System.out.println(status.name());
    }

}

// Enum --> Enumerations ( Enumerated type)
// Enum --> Predefined set of constants.

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}

class PaymentStaus2 {
    public static final int SUCCESS = 1;
    public static final int FAILED = 1;
    public static final int PENDING = 1;

}

package java_intermediate_study.polymorphism_abstarct.payment;

public class PaymentTest {
    public static void main(String[] args) {

        Payment[] payments = {
                new CardPayment(50000, "1234-5678-9012-3456"),
                new CardPayment(15000, "010-8534-7305")
        };

        System.out.println("=== 결제 처리 시스템 ===");

        for (Payment payment : payments) {
            System.out.println("=== 결제 처리 ---");
            if (payment.process()) {
                payment.printReceipt();
            }
            System.out.println();
        }
    }
}

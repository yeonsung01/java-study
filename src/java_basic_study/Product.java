package java_basic_study;

public class Product {
    public static void main(String[] args) {

        // ===== 상수 =====
        final double TAX_RATE = 0.1;  // 세금 10%

        // ===== 상품 정보 =====
        String productName = "노트북";
        int price = 1500000;
        int quantity = 2;
        boolean isAvailable = true;
        char category = 'E';  // E: 전자제품

        // ===== 계산 =====
        int totalPrice = price * quantity;
        double tax = totalPrice * TAX_RATE;
        double finalPrice = totalPrice + tax;

        // ===== 출력 =====
        System.out.println("=== 상품 정보 ===");
        System.out.println("상품명: " + productName);
        System.out.println("단가: " + price + "원");
        System.out.println("수량: " + quantity + "개");
        System.out.println("카테고리: " + category);
        System.out.println("재고 여부: " + isAvailable);

        System.out.println("\n=== 결제 정보 ===");
        System.out.println("상품 금액: " + totalPrice + "원");
        System.out.println("세금 (10%): " + (int)tax + "원");
        System.out.println("최종 금액: " + (int)finalPrice + "원");
    }
}
package java_basic_study_Operator;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 7;

        System.out.println("=== 기본 계산기 ===");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        // ─────────────────────────────────────────────────────
        // 실수 나눗셈
        // ─────────────────────────────────────────────────────
        System.out.println("\n=== 실수 나눗셈 ===");
        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));

        // ─────────────────────────────────────────────────────
        // 증감 연산자
        // ─────────────────────────────────────────────────────
        System.out.println("\n=== 증감 연산자 ===");
        int x = 10;
        System.out.println("초기값: " + x);
        System.out.println("x++: " + x++);  // 10 출력 후 증가
        System.out.println("현재 x: " + x); // 11
        System.out.println("++x: " + ++x);  // 증가 후 12 출력
    }
}

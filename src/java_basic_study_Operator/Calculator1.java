package java_basic_study_Operator;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        double num1 = scanner.nextDouble();

        System.out.print("연산자 (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("두 번째 숫자: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();
    }
}
package day20260117;

public class Problem2 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;

        int result1 = x / y; //3
        double result2 = x / y; //3.0
        double result3 = (double) x / y; //3.5

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}

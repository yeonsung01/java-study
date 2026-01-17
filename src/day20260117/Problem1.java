package day20260117;

public class Problem1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        int c = ++a;

        System.out.println("a = " + a);// 5
        System.out.println("b = " + b);// 5
        System.out.println("c = " + c);// 6
    }
}

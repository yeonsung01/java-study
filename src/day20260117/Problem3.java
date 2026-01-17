package day20260117;

public class Problem3 {
    public static void main(String[] args) {
        int n = 5;
        if ( n > 3 || ++n > 10) {
            System.out.println("조건 만족");
        }
        System.out.println("n = " + n); //5

        int m = 5;

        if (m < 3 || ++m > 10) {
            System.out.println("조건 만족");
        }
        System.out.println("m = " + m); //6
        }
    }

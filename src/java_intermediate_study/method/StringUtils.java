package java_intermediate_study.method;

public class StringUtils {
    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println("=== 문자열 유틸리티 ===");
        System.out.println("원본: " + text);
        System.out.println("대문자: " + toUpperCase(text));
        System.out.println("소문자: " + toLowerCase(text));
        System.out.println("길이: " + length(text));
        System.out.println("뒤집기: " + reverse(text));
        System.out.println("공백 개수: " + countSpaces(text));
        System.out.println("'o' 개수: " + countChar(text, 'o'));
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static String toLowerCase(String s) { // string → String 오타 수정
        return s.toLowerCase();
    }

    public static int length(String s) {
        return s.length();
    }

    public static String reverse(String s) { // 중복 메서드 제거, 리턴타입 수정
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static int countSpaces(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') count++; // '' → ' ' 공백 추가
        }
        return count;
    }

    public static int countChar(String s, char target) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == target) count++;
        }
        return count;
    }
}
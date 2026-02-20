package java_basic_study;

public class VariablePractice {
    public static void main(String[] args) {

        // ===== 학생 정보 저장 =====
        String name = "홍길동";
        int age = 25;
        double height = 175.5;
        boolean isStudent = true;
        char grade = 'A';

        // ===== 정보 출력 =====
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");
        System.out.println("키: " + height + "cm");
        System.out.println("학생 여부: " + isStudent);
        System.out.println("학점: " + grade);

        // ===== 값 변경 =====
        age = 26;
        grade = 'B';

        System.out.println("\n=== 1년 후 ===");
        System.out.println("나이: " + age + "살");
        System.out.println("학점: " + grade);
    }
}
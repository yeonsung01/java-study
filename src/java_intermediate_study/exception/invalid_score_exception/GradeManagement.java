package java_intermediate_study.exception.invalid_score_exception;

public class GradeManagement {
    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("홍길동");

        try {
            student.setScores(0, 85);
            student.setScores(1, 90);
            student.setScores(2, 150); // 예외 발생
        } catch (InvalidScoreException e) {
            System.out.println("성적 입력 오류:" + e.getMessage());
        }

        student.printReport();
    }
}

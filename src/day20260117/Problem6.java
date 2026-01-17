package day20260117;

public class Problem6 {
    public static void main(String[] args) {

        // 1) 점수 데이터 (5명 x 3과목)
        int[][] scores = {
                {85, 90, 78},
                {92, 88, 95},
                {76, 65, 70},
                {88, 82, 90},
                {55, 60, 58}
        };

        double maxAvg = -1;
        double minAvg = 101;

        System.out.println("=== 학생별 성적 ===");

        // 2) 학생별 계산
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            // 3) 과목 합계
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }

            double avg = sum / 3.0;

            // 4) 등급
            char grade;
            if (avg >= 90) grade = 'A';
            else if (avg >= 80) grade = 'B';
            else if (avg >= 70) grade = 'C';
            else if (avg >= 60) grade = 'D';
            else grade = 'F';

            // 5) 최고/최저 평균 갱신
            if (avg > maxAvg) maxAvg = avg;
            if (avg < minAvg) minAvg = avg;

            // 6) 출력
            System.out.printf("%d번: 총점=%d, 평균=%.2f, 등급=%c%n", (i + 1), sum, avg, grade);
        }

        System.out.println("\n=== 전체 통계 ===");
        System.out.printf("최고 평균: %.2f%n", maxAvg);
        System.out.printf("최저 평균: %.2f%n", minAvg);
    }
}

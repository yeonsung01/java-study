package java_basic_comprehensiv_exrcises;

public class GradeManagementSystem {
        public static void main(String[] args) {
            // 1. 2차원 배열에 점수 저장 [학생][과목]
            int[][] scores = {
                    {85, 90, 78},   // 1번 학생
                    {92, 88, 95},   // 2번 학생
                    {76, 65, 70},   // 3번 학생
                    {88, 82, 90},   // 4번 학생
                    {55, 60, 58}    // 5번 학생
            };

            int studentCount = scores.length;      // 학생 수: 5
            int subjectCount = scores[0].length;   // 과목 수: 3

            // 각 학생의 평균을 저장할 배열
            double[] averages = new double[studentCount];

            // 최고/최저 평균 초기화
            double maxAvg = 0;
            double minAvg = 100;

            System.out.println("===== 성적 관리 시스템 =====");
            System.out.println();
            System.out.println("[학생별 성적]");

            // 2. 각 학생별 총점, 평균, 등급 계산
            for (int i = 0; i < studentCount; i++) {
                // 총점 계산
                int sum = 0;
                for (int j = 0; j < subjectCount; j++) {
                    sum += scores[i][j];
                }

                // 평균 계산 (실수 나눗셈 주의!)
                double avg = (double) sum / subjectCount;
                averages[i] = avg;

                // 3. 등급 판정
                char grade;
                if (avg >= 90) {
                    grade = 'A';
                } else if (avg >= 80) {
                    grade = 'B';
                } else if (avg >= 70) {
                    grade = 'C';
                } else if (avg >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }

                // 출력 (소수점 둘째자리까지)
                System.out.printf("%d번 학생: 총점 = %d, 평균 = %.2f, 등급 = %c%n",
                        i + 1, sum, avg, grade);

                // 4. 최고/최저 평균 갱신
                if (avg > maxAvg) {
                    maxAvg = avg;
                }
                if (avg < minAvg) {
                    minAvg = avg;
                }
            }

            // 전체 통계 출력
            System.out.println();
            System.out.println("[전체 통계]");
            System.out.printf("최고 평균: %.2f점%n", maxAvg);
            System.out.printf("최저 평균: %.2f점%n", minAvg);
        }
    }

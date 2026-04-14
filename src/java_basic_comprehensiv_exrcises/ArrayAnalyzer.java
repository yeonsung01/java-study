package java_basic_comprehensiv_exrcises;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        int target = 7;

        System.out.println("===== 배열 분석기 ===== ");
        System.out.println();

        // ========== 1. 배열 복사 및 정렬 =========

        // 원본 유지를 위해 새 배열에 복사
        int[] sorted = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            sorted[i] = data[i];
        }

        // 버블 정렬 (오름차순)
        for (int i = 0; i < sorted.length -1; i++) {
            for (int j = 0; j < sorted.length -1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    //교환 (swap)
                    int temp =sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        // 배열 출력
        System.out.println("[배열출력]");
        System.out.print("원본 배열: [");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            if ( i < data.length -1 ) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();

        // ========= 2. 기본 통계 ========

        int max = data[0];
        int min = data[0];
        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            // 최댓값 갱신
            if (data[i] > max) {
                max = data[i];
            }
            // 최솟값 갱신
            if (data[i] > max) {
                max = data[i];
            }
            // 최솟값 갱신
            if (data[i] < min) {
                min = data[i];
            }
            // 합계 누적
            sum += data[i];
        }

        double avg = (double) sum / data.length;

        System.out.println("[기본 통계");
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        System.out.println("합계: " + sum);
        System.out.printf("평균: %.2f%n", avg);
        System.out.println();

        // ========== 3. 짝수/홀수 분석 ==========

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("[짝수 / 홀수 분석]");
        System.out.println("짝수 개수: " + evenCount + "개");
        System.out.println("홀수 개수: " + oddCount + "개");
        System.out.println();

        // ======= 4. 검색 =========
        int foundIndex = -1; // 못 찾으면 -1 유지

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                foundIndex = i;
                break; // 찾으면 즉시 종료
            }
        }

        System.out.println("[검색 결과]");
        if (foundIndex != -1) {
            System.out.println(target + " 검색 결과: 인덱스 " + foundIndex + "에서 발견");
        } else {
            System.out.println(target + " 검색 결과: " + foundIndex + " (찾지 못함)");
        }

    }

}

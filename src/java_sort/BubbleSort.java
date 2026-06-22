package java_sort;

import java.util.Arrays;

/**
 * 버블 정렬 (Bubble Sort)
 *
 * 핵심: 인접한 두 원소를 비교하며 정렬
 * 시간 복잡도: 최선 O(n), 평균/최악 O(n²)
 * 공간 복잡도: O(1)
 * 안정 정렬: ✅ Yes
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // 외부 루프: n-1번의 패스 수행
        // 각 패스마다 가장 큰 원소가 맨 뒤로 이동 ("버블링")
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;  // 최적화: 교환 발생 여부 체크

            // 내부 루프: 정렬되지 않은 영역에서 인접 원소 비교
            // n-i-1: 뒤쪽 i개는 이미 정렬됨
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 순서가 잘못되면 교환
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // 최적화: 한 번도 교환이 없었다면 이미 정렬 완료
            // → 최선의 경우 O(n)으로 종료
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("정렬 전: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("정렬 후: " + Arrays.toString(arr));
        // 출력: [11, 12, 22, 25, 34, 64, 90]
    }
}
package day20260117;

import java.util.Random;
import java.util.Arrays;

public class LottoGereator {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random random = new Random();

        int count = 0;

        //종목 없이 6개 번호 생성
        while (count < 6) {
            int num = random.nextInt(45) + 1; // 1~45

            //중복 체크
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (lotto[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            //중복이 아니면 추가
            if (!isDuplicate) {
                lotto[count] = num;
                count++;
            }
        }

        //정렬 (버블 정렬)
        for (int i = 0; i < lotto.length -1; i++) {
            for (int j = 0; j < lotto.length - 1 - i; j++) {
                if (lotto[j] > lotto[j +1]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j+1] = temp;
                }

            }
        }

        //출력
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║      🎱 로또 번호 생성기       ║");
        System.out.println("╠═══════════════════════════════╣");
        System.out.print("║    ");

        for (int num : lotto) {
            System.out.printf("%2d ", num);
        }

        System.out.println("      ║");
        System.out.println("╚═══════════════════════════════╝");

        // Arrays 클래스 사용 버전
        System.out.println("\n(Arrays.toString 사용)");
        System.out.println("번호: " + Arrays.toString(lotto));
    }
}

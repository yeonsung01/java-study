package java_basic_study_Loop;

public class MultiplicationTable {
    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────
        // 특정 단 출력
        // ─────────────────────────────────────────────────────
        int dan = 7;

        System.out.println("╔═══════════════════╗");
        System.out.println("║     " + dan + "단          ║");
        System.out.println("╠═══════════════════╣");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("║  %d × %d = %2d     ║%n", dan, i, dan * i);
        }
        System.out.println("╚═══════════════════╝");

        // ─────────────────────────────────────────────────────
        // 전체 구구단 (중첩 반복문)
        // ─────────────────────────────────────────────────────
        System.out.println("\n=== 전체 구구단 ===\n");

        for (int i = 2; i <= 9; i++) {
            System.out.println("[ " + i + "단 ]");

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

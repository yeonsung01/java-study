public class PrintPractice {
    public static void main(String[] args) {
        // println: 출력 후 줄바꿈
        System.out.println("Hello, Java!");
        System.out.println("안녕하세요!");
        System.out.println("Java를 배워봅시다!");

        // println: 출력 후 줄바꿈 없음
        System.out.print("Hello");
        System.out.print("World");
        System.out.println("!");

        //빈 줄 출력
        System.out.println();

        // 특수 문자 (이스케이프 시퀀스)
        System.out.println("줄바꿈\n테스트");
        System.out.println("탭\t탭\t탭");
        System.out.println("따옴표 출력:\"java\"");
        System.out.println("역슬래시:\\");

    }

}
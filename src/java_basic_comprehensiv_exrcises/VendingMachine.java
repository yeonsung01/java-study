package java_basic_comprehensiv_exrcises;

public class VendingMachine {
    public static void main(String[] args) {
        // 음료 정보 저장
        String[] names = {"코라", "사이다", "커피", "물"};
        int[] prices = {1100, 1000, 1500, 800};

        // 테스트 데이터
        int money = 2000;    // 투입 금액
        int choice = 3;      // 선택 번호 (1~4)

        System.out.println("===== 자판기 ======");
        System.out.println();

        //메뉴 출력
        System.out.println("[메뉴]");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + prices[i] + "원");
        }
        System.out.println();

        // 주문 정보 출력
        System.out.println("[주문 정보]");
        System.out.println("투입 금액: " + money + "원");
        System.out.println("선택: " + choice + "번");
        System.out.println();

        // 결과 처리
        System.out.println("[결과]");

        // 1. 유효한 번호인지 확인 (1~4)
        if (choice < 1 || choice > names.length) {
            System.out.println("잘못된 번호입니다. 1~" + names.length + "중에서 선택하세요.");
        } else {
            // 배열 인덱스로 변환 ( 1->0, 2->1, 3->2, 4->3)
            int index = choice -1;

            String selectedName = names[index];
            int selectedPrice = prices[index];

            //2. 금액 비교
            if (money >= selectedPrice) {
                // 구매 성공
                int change = money - selectedPrice;
                System.out.println(selectedName + "를 구매헀습니다.");
                System.out.println("거스름돈: " + change + "원");
            } else {
                // 금액 부족
                int shortage = selectedPrice - money;
                System.out.println("금액이 부족합니다.");
                System.out.println("부족한 금액: " + shortage + "원");
            }
        }
    }
}

package class_object1;

public class CarTest {
    public static void main(String[] args) {

        //====================
        // 1. 객체 생성
        //====================
        Car myCar = new Car("현대", "소나타");
        Car yourCar = new Car("기아", "k5");

        //====================
        // 2. myCar 테스트
        //====================
        myCar.info();           //초기 상태 확인
        myCar.accelerate(50);   // 0  -> 50
        myCar.accelerate(30);   // 50 -> 80
        myCar.brake(20);        // 80 -> 60

        System.out.println();

        //====================
        // 3. yourCar 테스트
        //====================
        yourCar.accelerate(100); // 0 -> 100
        yourCar.info();          // 상태 확인
    }
}

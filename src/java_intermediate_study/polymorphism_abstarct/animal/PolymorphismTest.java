package java_intermediate_study.polymorphism_abstarct.animal;

public class PolymorphismTest {
    public  static void main(String[] args){

        // 다형성: 부모 타입 배열에 자식 객체
        Animal[] animals = {
                new Dog("바둑이"),
                new Cat("나비"),
                new Bird("쨱쨱이"),
                new Dog("멍멍이")
        };

        System.out.println("== 모든 동물 소리 내기 ==");
        for (Animal animals1 : animals){
            animals1.speak(); // 동적 바인딩
        }

        System.out.println("\n=== 타입별 특수 동작 ===");
        for (Animal animal : animals){
            animal.showInfo();
        }
    }
}

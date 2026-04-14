package class_object1;

public class PersonTest {
    public static void main(String[] args) {
        //====================
        // 1. 기본 생성자로 객체 생성
        //====================
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 25;

        //====================
        // 2. 매개변수 생성자로 객체 생성
        //====================
        Person p2 = new Person("김영희", 30);
        Person p3 = new Person("유연성", 34, "개발자");

        //====================
        // 3. 메서드 호출
        //====================
        System.out.println("=== 자기소개 ===");
        p1.introduce();
        System.out.println();
        p2.introduce();
        System.out.println();
        p3.introduce();

        System.out.println("\n=== 인사하기 ===");
        p1.greet(p2.name);
    }
}

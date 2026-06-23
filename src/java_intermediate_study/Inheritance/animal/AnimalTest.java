package java_intermediate_study.Inheritance.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("바둑이", 3,  "진돗개");
        Cat cat = new Cat("나비", 2, true);

        System.out.println("=====================");
        System.out.println("       강아지 정보      ");
        dog.showInfo();
        System.out.println("=====================");

        dog.eat();
        dog.speak();
        dog.fetch();

        System.out.println("\n===================");
        System.out.println("      고양이 정보       ");
        System.out.println("=====================");

        cat.showInfo();
        System.out.println("                     ");
        cat.eat();
        cat.speak();
        cat.scratch();
        System.out.println("=====================");
    }

}

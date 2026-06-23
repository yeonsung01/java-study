package java_intermediate_study.polymorphism_abstarct.animal;

public abstract class Animal {
    protected  String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이(가) 먹습니다");
    }

    public abstract void speak();

    public void showInfo(){
        System.out.println("이름:" +name);
    }
}

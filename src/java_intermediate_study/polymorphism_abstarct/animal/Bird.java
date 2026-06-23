package java_intermediate_study.polymorphism_abstarct.animal;

public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(name + ": 쨱쨱!");
    }

    public void fly(){
        System.out.println(name + "이(가) 날아갑니다.");
    }
}

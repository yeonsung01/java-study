package java_intermediate_study.polymorphism_abstarct.animal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(name + ": 야옹~");
    }

    public void scratch(){
        System.out.println(name + "이(가) 긁습니다.");
    }
}

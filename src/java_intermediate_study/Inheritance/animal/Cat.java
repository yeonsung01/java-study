package java_intermediate_study.Inheritance.animal;

public class Cat extends Animal{
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void speak() {
        System.out.println(name + ": 야옹~");
    }

    @Override
    public void showInfo() {
        System.out.println("실내 고양이: " + (isIndoor? "예" : "아니오"));
    }

    public void scratch() {
        System.out.println(name + "이(가) 스크래치를 긁습니다.");
    }
}

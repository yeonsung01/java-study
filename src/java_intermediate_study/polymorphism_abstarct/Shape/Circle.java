package java_intermediate_study.polymorphism_abstarct.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super("원");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

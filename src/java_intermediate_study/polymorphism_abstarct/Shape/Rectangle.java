package java_intermediate_study.polymorphism_abstarct.Shape;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        super("직사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}



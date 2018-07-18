package imooc.java.two.abstracts;

public class Rectangle extends Shape {
    double width;
    double height;

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}

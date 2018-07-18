package imooc.java.two.abstracts;

public class Inital {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 6;

        System.out.println("长方形的周长为：" + rectangle.perimeter());
        System.out.println("长方形的面积为：" + rectangle.area());

        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("圆形的周长为：" + circle.perimeter());
        System.out.println("圆形的面积为：" + circle.area());
    }
}

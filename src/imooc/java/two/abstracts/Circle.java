package imooc.java.two.abstracts;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circle extends Shape {
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

}

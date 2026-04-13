package Figures;

public class Rectangle extends Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        System.out.println("прямоугольник со сторонами: " +  a + " , " +  b);
    }

    @Override
    double area() {
        return a * b;
    }

    @Override
    double perimeter() {
        return 2 * (a + b);
    }
}
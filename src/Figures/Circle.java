package Figures;

public class Circle extends Figure {
    double r;

    public Circle(double r) {
        this.r = r;
        System.out.println("круг c радусом " + r);
    }

    @Override
    double area() {
        double Pi = 3.14;
        return Pi * r * r;
    }

    @Override
    double perimeter() {
        double Pi = 3.14;
        return 2 * Pi * r;
    }
}

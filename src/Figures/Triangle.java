package Figures;

public class Triangle extends Figure {
    double[] sides = new double[3];


    public Triangle(double a, double b, double c) {
            sides = new double[]{a, b, c};
        System.out.println("треугольник со сторонами: "+ a + " , " + b + " , " + c);
    }

    @Override
    double area() {
            return (this.sides[0] + this.sides[1]) / 2 ;
    }

    @Override
    double perimeter() {
            return this.sides[0] + this.sides[1] + this.sides[2];
    }
}
package Figures;
/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(7);
        figures[1] = new Triangle(3, 4 , 5);
        figures[2] = new Triangle(6, 8, 10);
        figures[3] = new Rectangle(5, 10);
        figures[4] = new Rectangle(10,20);
        double perimeterSum = 0;
        double areaSum = 0;
        for (int i = 0; i < figures.length; i++) {
            perimeterSum += figures[i].perimeter();
            areaSum += figures[i].area();
        }
        System.out.println("Сумма периметров всех фигур: " + perimeterSum);
        System.out.println("Сумма площадей всех фигур: " + areaSum);

    }
}

package Domashka02;
//Задача 3:
//Составьте программу, выводящую на экран квадраты чисел от 10 до 20
//включительно.
public class Domashka02_3 {
    public static void main(String[] args) {
        for (int i = 10; i < 21; i +=1) {
            int b = i * i;
            System.out.println("Квадрат числа " + i +" равен " +b);
        }
    }
}

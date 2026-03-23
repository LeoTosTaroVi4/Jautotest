package Domashka02;

import java.util.Scanner;
//Задача 1
//Напишите программу, которая будет принимать на вход число из консоли и на
//выход будет выводить сообщение четное число или нет. Для определения
//четности числа используйте операцию получения остатка от деления (операция
//выглядит так: '% 2').
public class Domashka02_1 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        System.out.println("Введите число " );
        int a = scannern.nextInt();
        int b = a % 2;
        if (a == 0){
            System.out.println("Число Ноль" );
        }else if (b == 1){
            System.out.println("Число нечетное" );
        }else if (b == 0){
            System.out.println("Число четное" );
        }
    }
}
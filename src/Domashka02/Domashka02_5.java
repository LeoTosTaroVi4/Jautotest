package Domashka02;

import java.util.Scanner;

//Задача *:
//Напишите программу, где пользователь вводит любое целое положительное
//число.
//
//А программа суммирует все числа от 1 до введенного пользователем числа. Для
//ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
//пользователь не мог ввести некорректные данные
public class Domashka02_5 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число " );
        double a = scannern.nextDouble();
        int b = 0;
        if (a <= 0 ) {
            System.out.println("Число не положительное " );
        }
        else if ( a % 1 != 0){
            System.out.println("Число не Целое " );
        } else {
            for (int i = 0; i <= a; i++ ){
               b += i;
            }
            System.out.println("Сумма всех чисел до числа " + a + " равна " + b);
        }
    }
}

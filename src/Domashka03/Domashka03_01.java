package Domashka03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Для всех задач исходные условия следующие: пользователь с клавиатуры
//вводит размер массива (просто целое число). После того, как размер массива
//задан, заполнить его одним из двух способов: используя Math.random(), или
//каждый элемент массива вводится пользователем вручную. Попробовать оба
//варианта. После заполнения массива данными, решить для него следующие
//задачи:
//Задача 1:
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
public class Domashka03_01 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива (Количество ячеек)" );
        int a = scannern.nextInt();                                             // Выбор размера Массива
        int[] numbers = new int[a];
        System.out.println("Если хотите заполнить массив случайными числами, введите 1" );
        int b = scannern.nextInt();                                             // Выбор способа заполнения.
        if (b != 1) {                                                           // Ручное заполнение
            for (int i1 = 0; i1 < a; i1++) {
                System.out.println("Введите число для ячейки номер " + i1 );
                numbers[i1] = scannern.nextInt();
            }
            System.out.println("Вывод значений в прямом порядке");
            for (int number : numbers) {
                System.out.println(number);                                     // Вывод значений в прямом порядке
            }
            System.out.println("Вывод значений в Обратном порядке");
            for (int i = numbers.length - 1; i > -1; i--){
                System.out.println("num[" + i + "] = " + numbers[i] );          // Вывод значений в обратном порядке Не разобрался как  for each обратно сделать
            }
        } else {                                                                // Автоматическое заполнение
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }
            System.out.println("Вывод значений в прямом порядке");
            for (int number : numbers) {
                System.out.println(number);                                     // Вывод значений в прямом порядке
            }
            for (int i = numbers.length - 1; i > -1; i--){
                System.out.println("num[" + i + "] = " + numbers[i] );          // Вывод значений в обратном порядке Не разобрался как  for each обратно сделать
            }
        }
    }
}

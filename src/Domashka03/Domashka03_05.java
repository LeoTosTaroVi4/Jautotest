package Domashka03;

import java.util.Random;
import java.util.Scanner;

//Для всех задач исходные условия следующие: пользователь с клавиатуры
//вводит размер массива (просто целое число). После того, как размер массива
//задан, заполнить его одним из двух способов: используя Math.random(), или
//каждый элемент массива вводится пользователем вручную. Попробовать оба
//варианта. После заполнения массива данными, решить для него следующие
//задачи:
//Задача 5:
//Пройти по массиву и поменять местами элементы первый и последний, второй
//и предпоследний и т.д.
public class Domashka03_05 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива (Количество ячеек) но больше 4" );
        int a = scannern.nextInt();                                             // Выбор размера Массива
        int[] numbers = new int[a];
        for (int i1 = 0; i1 < a; i1++) {
            System.out.println("Введите число для ячейки номер " + i1);
            numbers[i1] = scannern.nextInt();
        }
            System.out.println("Вывод значений в прямом порядке");
        for (int number : numbers) {
            System.out.print(number + " ");                                     // Вывод значений в прямом порядке
        }
        System.out.println();
        int tmp = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = tmp;
        tmp = numbers[1];
        numbers[1] = numbers[numbers.length-2];
        numbers[numbers.length-2] = tmp;
        System.out.println("Вывод значений в прямом порядке после перемены");
        for (int number : numbers) {
            System.out.print(number + " ");                                     // Вывод значений в прямом порядке
        }
    }
}
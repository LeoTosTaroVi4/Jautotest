package Domashka03;

import java.util.Random;
import java.util.Scanner;

//Для всех задач исходные условия следующие: пользователь с клавиатуры
//вводит размер массива (просто целое число). После того, как размер массива
//задан, заполнить его одним из двух способов: используя Math.random(), или
//каждый элемент массива вводится пользователем вручную. Попробовать оба
//варианта. После заполнения массива данными, решить для него следующие
//задачи:
//Задача 6:
//Проверить, является ли массив возрастающей последовательностью (каждое
// следующее число больше предыдущего).
public class Domashka03_06 {
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
        int x = 0;
        for (int i = 0; i < numbers.length-1; i++) {                              //не придумал как binarySearch сюда вкрутить
            if (numbers[i] > numbers[i+1]) {
                x++;
                break;
            }
        }
        if (x == 0) {
            System.out.println("Массив возрастающицй");
        } else {
            System.out.println("Массив НЕ возрастающицй");
        }
    }
}
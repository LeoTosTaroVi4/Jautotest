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
//Задача 4:
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
//        вывести сообщение, что их нет.
public class Domashka03_04 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива (Количество ячеек)");
        int a = scannern.nextInt();                                             // Выбор размера Массива
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        for (int number : numbers) {
            System.out.print(number + " ");                                     // Вывод значений в прямом порядке
        }
        System.out.println();
        int O = 0;
        for (int i = 0; i < numbers.length; i++) {                              //не придумал как binarySearch сюда вкрутить
            if (numbers[i] == 0) {
                O++;
            }
        }
            if (O == 0) {
                System.out.println("Количество нулевых отсутсвует");
            } else {
                System.out.println("Количество нулевых элементов: " + O);
            }
    }

}


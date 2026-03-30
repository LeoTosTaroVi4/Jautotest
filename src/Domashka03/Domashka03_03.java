package Domashka03;
//Для всех задач исходные условия следующие: пользователь с клавиатуры
//вводит размер массива (просто целое число). После того, как размер массива
//задан, заполнить его одним из двух способов: используя Math.random(), или
//каждый элемент массива вводится пользователем вручную. Попробовать оба
//варианта. После заполнения массива данными, решить для него следующие
//задачи:
//Задача 3:
//Найти индексы минимального и максимального элементов и вывести в консоль.

import java.util.Random;
import java.util.Scanner;

public class Domashka03_03 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива (Количество ячеек)" );
        int a = scannern.nextInt();                                             // Выбор размера Массива
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        int indMax = 0;
        int indMin = 0;
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > numbers[indMax])
            {
                indMax = i;
            }
            else if (numbers[i] < numbers[indMin])
            {
                indMin = i;
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");                                     // Вывод значений в прямом порядке
        }
        System.out.println();
        System.out.println(" Индекс Максимального значенийя - " + indMax + ". Индекс минимального значения - " + indMin +".");

    }
}
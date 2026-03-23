package Domashka03;

import java.util.Random;
import java.util.Scanner;

//Для всех задач исходные условия следующие: пользователь с клавиатуры
//вводит размер массива (просто целое число). После того, как размер массива
//задан, заполнить его одним из двух способов: используя Math.random(), или
//каждый элемент массива вводится пользователем вручную. Попробовать оба
//варианта. После заполнения массива данными, решить для него следующие
//задачи:
//Задача 2:
//Найти минимальный - максимальный элементы и вывести в консоль.
public class Domashka03_02 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива (Количество ячеек)" );
        int a = scannern.nextInt();                                             // Выбор размера Массива
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }
            boolean sorted = false;
            int temp;
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < numbers.length - 1; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        temp = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
            System.out.println("Максимальное значение - " + numbers[a-1] + " . Минимальное значение - " + numbers[0] );

    }
}



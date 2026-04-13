package Domashka08;
/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Domashka08_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> num = new LinkedHashSet<>();
        System.out.println("Размер коллекции");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число ");
            int input = scan.nextInt();
            num.add(input);
        }scan.close();
        System.out.println(num);
    }
}

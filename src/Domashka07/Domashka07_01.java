package Domashka07;

/*
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
*/

import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Domashka07_01 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите строку 1" );
        String text1 = scaner.nextLine();
        System.out.println("Введите строку 2" );
        String text2 = scaner.nextLine();
        System.out.println("Введите строку 3" );
        String text3 = scaner.nextLine();
        System.out.println(text1.length());
        System.out.println(text2.length());
        System.out.println(text3.length());
        int a = text1.length(), b = text2.length(), c = text3.length();
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);
        int min = array[0];
        int max = array[2];
        System.out.println("Минимум: ".concat(String.valueOf(min)).concat(", Максимум: ").concat(String.valueOf(max)));
    }
}

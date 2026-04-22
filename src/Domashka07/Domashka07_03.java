package Domashka07;
/*
Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */

import java.util.Scanner;

public class Domashka07_03 {
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
        String[] strings = new String[3];
        strings[0] = text1;
        strings[1] = text2;
        strings[2] = text3;
        int a = text1.length(), b = text2.length(), c = text3.length();
        double sum = 0;
        sum = a + b + c;
        double avg = sum / 3;
        System.out.println("Средняя длина = ".concat(String.valueOf(avg)));
        String t;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < avg) {
                System.out.printf("%s (%d) ", strings[i], strings[i].length());
            }
        }
    }
}

package Domashka07;
/*
Задача 2:
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Domashka07_02 {
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
            String t;
            for (int i = 0; i < strings.length - 1; i++) {
                for (int j = 0; j < strings.length - 1 - i; j++) {
                    if (strings[j].length() > strings[j + 1].length()) {
                        t = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = t;
                    }
                }
            }
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i].concat(" "));
            }
        }
}


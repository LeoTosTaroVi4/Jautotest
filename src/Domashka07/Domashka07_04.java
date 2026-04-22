package Domashka07;

import java.util.Scanner;

/*
Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */
public class Domashka07_04 {
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

        for (String word : strings) {
            boolean unique = true;
            for (int i = 0; i < word.length(); i++) {
                if (word.indexOf(word.charAt(i)) != word.lastIndexOf(word.charAt(i))) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(word);
                break;
            }
        }
    }
}

package Domashka07;
/*
5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */
import java.util.Scanner;

public class Domashka07_05 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите строку для дубликации символов" );
        String text1 = scaner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text1.length(); i++) {
            char c = text1.charAt(i);
            result.append(c).append(c);
        }
        System.out.println(result.toString());
    }
}


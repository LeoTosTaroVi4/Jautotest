package Domashka08;
/*
Задача 3:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */
import java.util.*;
import java.util.stream.Collectors;

public class Domashka08_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] symbols = new String[3];

        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = scan.nextLine();
        }
        Map<String, Boolean> res = Arrays.stream(symbols)
                .collect(Collectors.toMap(
                        str -> str,
                        str -> false,
                        (existing, replacement) -> true
                ));
        System.out.println(res);
    }
}

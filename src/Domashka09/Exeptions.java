package Domashka09;

/*
Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeptions {
    public void No1 (int a, int b) {
        try {
            int c = a / b;
            System.out.println("Частное от дления ".concat(String.valueOf(a)).concat(" на ").concat(String.valueOf(b)).concat(" = ").concat(String.valueOf(c)));
        } catch (ArithmeticException e) {
            System.out.println("не надо делить на 0 - " + e.getMessage());
        }
    }

    public void No2 (int[] array, int index) {
        try {
            System.out.println("Элемент с индексом " + index + ": " + array[index]);
            array.toString().length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс " + index + " выходит за границы массива! " +
                    "(размер массива: " + array.length + ")");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Массив не инициализирован (null)!");
        }
    }

    public void No3(int[] array, int i) {
        try {
            System.out.println("Элемент с индексом " + i + ": " + array[i]);
            array.toString().length();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }

    public void no4 () {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число а: ");
            int a = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Ошибка: " + "Введено не число");
        }finally {
            scanner.close();
        }
    }
}
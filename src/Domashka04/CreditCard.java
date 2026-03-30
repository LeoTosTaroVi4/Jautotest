package Domashka04;

import java.util.Scanner;

//Задача 1:
//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//        Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//        Добавьте метод, который выводит текущую информацию о карточке. Напишите
//программу, которая создает три объекта класса CreditCard у которых заданы
//номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и
//снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
public class CreditCard {
        String Account;
        int sum;
        public void  moneyadd(){
            Scanner scannern = new Scanner(System.in);
            System.out.println("текущий баланс  = " + sum );
            System.out.println("Введите сумму пополнения" );
            int a = scannern.nextInt();
            sum = sum + a;
            System.out.println("Новая сумма = " + sum );
        }
        public void  moneysubstract(){
            Scanner scannern = new Scanner(System.in);
            System.out.println("текущий баланс  = " + sum );
            System.out.println("Введите сумму Снятия" );
            int a = scannern.nextInt();
            sum = sum - a;
            System.out.println("Новая сумма = " + sum );
        }
}

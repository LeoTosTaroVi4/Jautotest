package Domashka02;

import java.util.Scanner;
//Задача 2:
//Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
//«Warm».
//Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
public class Domashka02_2 {
    public static void main(String[] args) {
        Scanner scannern = new Scanner(System.in);
        System.out.println("Введите температуру " );
        int t = scannern.nextInt();
        if (t >= -5){
            System.out.println("Warm" );
        }else if (t > -20){
            System.out.println("Normal" );
        }else if(t <= -20) {
            System.out.println("Cold");
        }
    }
}

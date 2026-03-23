package Domashka01;
//Задача 2:
//В переменной n хранится двузначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
//результате мы должны получить 8 (2 + 6).
public class Domashka01_2 {

    public static void main(String[] args) {
        int n=81;
        int sumNum=0;
        while(n > 0){
            sumNum = sumNum + n % 10;
            n = n / 10;
        }
        System.out.println(sumNum + " ");
    }
}

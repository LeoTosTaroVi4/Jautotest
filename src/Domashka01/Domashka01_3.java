package Domashka01;
//Задача 3:
//В переменной n хранится трёхзначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
//результате мы должны получить 9 (1+2+6).
public class Domashka01_3 {

    public static void main(String[] args) {
        int n=127;
        int sumNum=0;
        while(n > 0){
            sumNum = sumNum + n % 10;
            n = n / 10;
        }
        System.out.println(sumNum + " ");
    }
}

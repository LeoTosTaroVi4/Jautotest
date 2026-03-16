package Domashka01;

public class Domashka1_3 {

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

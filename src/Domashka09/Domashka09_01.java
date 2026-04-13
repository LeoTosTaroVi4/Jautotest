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

public class Domashka09_01 {
    public static void main(String[] args) {
        Exeptions exeptions1 = new Exeptions();                 // 1. try - catch
        exeptions1.No1(150,2);
        exeptions1.No1(33,0);
        System.out.println("___________________________________________________");
        Exeptions exeptions2 = new Exeptions();
        int[] num = {1,2,3,4,5};
        exeptions2.No2(num,2);
        exeptions2.No2(num,10);
        exeptions2.No2(null,10);
        System.out.println("___________________________________________________");
        Exeptions exeptions3 = new Exeptions();
        int[] num1 = {1,2,3,4,5};
        exeptions3.No3(num1,2);
        exeptions3.No3(num1,10);
        exeptions3.No3(null,10);
        System.out.println("___________________________________________________");
        Exeptions exeptions4 =  new Exeptions();
        exeptions3.no4();
    }
}

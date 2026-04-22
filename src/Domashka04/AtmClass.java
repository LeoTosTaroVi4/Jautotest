package Domashka04;
//Задача 2:
//        Создать класс, описывающий банкомат. Набор купюр, находящихся в
//банкомате, должен задаваться тремя свойствами: количеством купюр
//номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
//        Сделать функцию, снимающую деньги, которая принимает сумму денег, а
//возвращает булевое значение - успешность выполнения операции. При
//        снятии денег, функция должна распечатывать каким количеством купюр
//какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
//-количеством купюр каждого номинала
public class AtmClass {
    private static int bil100 = 10;
    private static int bill50 = 10;
    private static int bill20 = 10;
    public AtmClass( int bil100, int bill50, int bill20) {
        this.bil100 = bil100;
        this.bill50 = bill50;
        this.bill20 = bill20;
    }

    public static void addMoney(int addbill20, int addbill50, int addbill100) {
        int allMoney = bill20 * 20 + bill50 * 50 + bil100 * 100;
        System.out.println("текущий баланс  = " + allMoney);
        System.out.println(" Номинал 100 - " + bil100 + "   Номинал 50 - " + bill50 + "   Номинал 20 - " + bill20);
        bill20 += addbill20;
        bill50 += addbill50;
        bil100 += addbill100;
        int allAddCons = addbill20 * 20 + addbill50 * 50 + addbill100 * 100;
        allMoney = bill20 * 20 + bill50 * 50 + bil100 * 100;
        System.out.println("текущий баланс после добавления = " + allMoney);
        System.out.println(" Номинал 100 - " + bil100 + "   Номинал 50 - " + bill50 + "   Номинал 20 - " + bill20);
    }

    public static boolean askMoney(int requestCash) {
        if (requestCash % 10 != 0) {
            System.out.println("Wrong sum, pleas enter correct sum");
            return false;
        } else {
            boolean firstAnswer;
            if (bil100 * 100 + bill50 * 50 + bill20 * 20 >= requestCash) {
                int[] nom = {20, 50, 100};                  //массив c имеющимися купюрами
                int[] count = new int[nom.length];          //кол-во купюр выдать
                int index = nom.length - 1;

                while (index != -1) {                       //подсчет купюр через деление от большего к меньшему номиналу.
                    count[index] = requestCash / nom[index];
                    requestCash %= nom[index];
                    index--;
                }
                for (int i = 0; i < count.length; i++) {                //какаято черная магия с %d которую я не понимаю, но она работает.
                    System.out.printf("Номинал в %d руб. = %d шт.\n", nom[i], count[i]);
                }
                return true;
            } else {
                System.out.println("not enough money");
                return false;
            }
        }
    }
}


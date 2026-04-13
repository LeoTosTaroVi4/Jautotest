package Domashka04;

public class CCMain {
    public static void main(String[] args) {                    //КРЕДИТКИ
        CreditCard cc1 = new CreditCard(10000, "00000001");                      //Первая карта
        System.out.println("Пополнение карты - " + cc1.Account);
        cc1.moneyadd();
        CreditCard cc2 = new CreditCard(56900, "12345678");                      //Вторая карта
        System.out.println("Пополнение карты - " + cc2.Account);
        cc2.moneyadd();
        CreditCard cc3 = new CreditCard(88552, "95621475");                      //Третья карта
        System.out.println("Снятие с карты - " + cc3.Account);
        cc3.moneysubstract();
        System.out.println("Номер счета - " + cc1.Account + "   Сумма на счёте = " + cc1.sum );
        System.out.println("Номер счета - " + cc2.Account + "   Сумма на счёте = " + cc2.sum );
        System.out.println("Номер счета - " + cc3.Account + "   Сумма на счёте = " + cc3.sum );
    }
}

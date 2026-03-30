package Domashka04;

public class CCMain {
    public static void main(String[] args) {                    //КРЕДИТКИ
        CreditCard cc1 = new CreditCard();                      //Первая карта
        cc1.Account = "00000001";
        cc1.sum = 10000;
        System.out.println("Пополнение карты - " + cc1.Account);
        cc1.moneyadd();
        CreditCard cc2 = new CreditCard();                      //Вторая карта
        cc2.Account = "12345678";
        cc2.sum = 56900;
        System.out.println("Пополнение карты - " + cc2.Account);
        cc2.moneyadd();
        CreditCard cc3 = new CreditCard();                      //Третья карта
        cc3.Account = "95621475";
        cc3.sum = 88552;
        System.out.println("Снятие с карты - " + cc3.Account);
        cc3.moneysubstract();
        System.out.println("Номер счета - " + cc1.Account + "   Сумма на счёте = " + cc1.sum );
        System.out.println("Номер счета - " + cc2.Account + "   Сумма на счёте = " + cc2.sum );
        System.out.println("Номер счета - " + cc3.Account + "   Сумма на счёте = " + cc3.sum );
    }
}

package Hospital;
/*
Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод
лечить.
*/

public class main {
    public static void main(String[] args) {
        Surg surg = new Surg();
        Dant dant = new Dant();
        Ther ther = new Ther();
        Patient pat1 = new Patient(1);
        Patient pat2 = new Patient(2);
        Patient pat3 = new Patient(3);
        ther.assignDoc(pat1, surg, dant);
        ther.assignDoc(pat2, surg, dant);
        ther.assignDoc(pat3, surg, dant);
        pat1.startTreatment();
        pat2.startTreatment();
        pat3.startTreatment();
    }
}

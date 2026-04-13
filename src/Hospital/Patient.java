package Hospital;

public class Patient {
    public Object startTreatment;
    int plan;
    Doc doc;

    public Patient(int plan) {
        this.plan = plan;
    }

    void startTreatment() {
        if (this.doc != null) {
            System.out.println("Пациент c планом лечения " + this.plan);
            doc.treatment();
        }else {
            System.out.println("к терапевту");
        }


    }
}

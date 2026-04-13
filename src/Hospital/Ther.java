package Hospital;

public class Ther extends Doc {
    @Override
    void treatment() {
        System.out.println("Работа Терапевта");
    }

    void assignDoc (Patient patient, Surg surgeon, Dant dentist){
        if (patient.plan == 1) {
            patient.doc = surgeon;
        } else if (patient.plan == 2){
            patient.doc = dentist;
        } else {
            patient.doc = this;
        }
    }
}

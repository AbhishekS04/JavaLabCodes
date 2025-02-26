package patient;

import doctor.doctorDetails;

public class Main {
    public static void main(String[] args) {
        doctorDetails doctor = new doctorDetails("Dr. Smith", "Cardiology");
        patientDetails patient = new patientDetails(101, "John Doe");

        doctor.show();
        patient.show();
    }
}
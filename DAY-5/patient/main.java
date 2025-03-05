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

//! output

//! Doctor Name: Dr. Smith
//! Doctor Specialization: Cardiology
//! Patient ID: 101
//! Patient Name: John Doe

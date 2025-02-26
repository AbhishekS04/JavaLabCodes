public class PatientDetails {
    private int patientId;
    private String patientName;

    public PatientDetails(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public void show() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
    }
}

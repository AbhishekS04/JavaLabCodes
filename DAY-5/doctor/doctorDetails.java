
public class DoctorDetails {
    private String doctorName;
    private String specialty;

    public DoctorDetails(String doctorName, String specialty) {
        this.doctorName = doctorName;
        this.specialty = specialty;
    }

    public void show() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialty: " + specialty);
    }
}

public class quTwo {
    private String name;
    private String department;
    private String rollNumber;

    public quTwo(String name, String department, String rollNumber) {
        this.name = name;
        this.department = department;
        this.rollNumber = rollNumber;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        quTwo student = new quTwo("Abhishek Singh", "Computer Science and Engineering", "UG/02/BTCSE/2023/011");
        student.printDetails();
    }
}

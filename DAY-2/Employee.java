public class Employee {
    int empId;
    String empName;
    double salary;
    String designation;

    public Employee(int empId, String empName, double salary, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
    }

    void display() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Salary: " + salary + ", Designation: " + designation);
    }

    static void compare(Employee e1, Employee e2) {
        if (e1.salary > e2.salary) {
            System.out.println("\nHighest Paid: " + e1.empName + " - " + e1.designation);
        } else if (e2.salary > e1.salary) {
            System.out.println("\nHighest Paid: " + e2.empName + " - " + e2.designation);
        } else {
            System.out.println("\nBoth have the same salary.");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", 65000, "Manager");
        Employee e2 = new Employee(102, "Bob", 50000, "Developer");

        e1.display();
        e2.display();
        compare(e1, e2);
    }
}
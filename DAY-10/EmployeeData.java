import java.sql.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeData {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/abhishek";
        String user = "root";
        String password = "Bristi23@04";
        
        // SQL Query
        String query = "SELECT * FROM empJavatest";
        
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            
            // Create statement
            Statement stmt = conn.createStatement();
            
            // Execute query
            ResultSet rs = stmt.executeQuery(query);
            
            // Display results
            System.out.println("Employee Records:");
            while (rs.next()) {
                int empId = rs.getInt("emp_id");
                String empName = rs.getString("emp_name");
                int empAge = rs.getInt("emp_age");
                String empDepartment = rs.getString("emp_department");
                double empSalary = rs.getDouble("emp_salary");
                Date empJoinDate = rs.getDate("emp_join_date");
                
                System.out.println("ID: " + empId + ", Name: " + empName + ", Age: " + empAge + 
                                   ", Department: " + empDepartment + ", Salary: " + empSalary + 
                                   ", Join Date: " + empJoinDate);
            }
            
            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

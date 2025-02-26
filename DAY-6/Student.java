//! Write a Java program to define a student class with variables studentName, studentProgram, and studentSemester. Define a getData method to take input the record of a student from the user using BufferedReader to take inputs from the user. Handle the exceptions that occur here using IOException. Handle the exception using the throw keyword. Define a show method to print the record of three students.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Student {
    String studentName;
    String studentProgram;
    String studentSemester;

    public void getData() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Student Name: ");
        studentName = bufferedReader.readLine();
        System.out.print("Enter the Student Program: ");
        studentProgram = bufferedReader.readLine();
        System.out.print("Enter the Student Semester: ");
        studentSemester = bufferedReader.readLine();
    }

    public void show() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Program: " + studentProgram);
        System.out.println("Student Semester: " + studentSemester);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        try {
            student1.getData();
            student2.getData();
            student3.getData();
        } catch (IOException exc) {
            System.out.println("404 Error " + exc.getCause());
        }

        student1.show();
        student2.show();
        student3.show();
    }
}
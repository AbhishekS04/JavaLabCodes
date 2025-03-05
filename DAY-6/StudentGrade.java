//! 6)6.Write a java program to define a class StudentGrade with member variables stu_name, stu_grade, grade, marks. The methods are:
//!     a> getData() to input values for variables using the BufferedReader class (use throws). if the marks enter is not within range (0-100), then throw an exception called WrongMark and print the alert message. If the grade not in O, A+, A, B+, B, C, P, F
//!     then call exception "InvalidGrade" and print the alert message.
//!     b> matchGrade() to match marks and grade as given in the following table. If it does not match then throw exception "GradeMismatch" : marks | grade
//!                     90-100      O
//!                     80-89       A+
//!                     70-79       A
//!                     60-69       B+
//!                     50-59       B
//!                     40-49       C
//!                     30-39       P
//!                     20-29       F
//!     c> showData() to display the record of student.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class WrongMarkException extends Exception {
    public WrongMarkException(String message) {
        super(message);
    }
}

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

class GradeMismatchException extends Exception {
    public GradeMismatchException(String message) {
        super(message);
    }
}


public class StudentGrade {
    String stu_name;
    String stu_grade;
    int marks;

    public void getData() throws IOException, WrongMarkException, InvalidGradeException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Student Name: ");
        stu_name = bufferedReader.readLine();
        
        System.out.print("Enter Student Grade: ");
        stu_grade = bufferedReader.readLine();
        
        System.out.print("Enter Student Marks: ");
        marks = Integer.parseInt(bufferedReader.readLine());

        if (marks < 0 || marks > 100) {
            throw new WrongMarkException("Marks must be between 0 and 100.");
        }

        if (!stu_grade.matches("O|A\\+|A|B\\+|B|C|P|F")) {
            throw new InvalidGradeException("Grade must be one of O, A+, A, B+, B, C, P, F.");
        }
    }

    public void matchGrade() throws GradeMismatchException {
        String expectedGrade;
        if (marks >= 90) {
            expectedGrade = "O";
        } else if (marks >= 80) {
            expectedGrade = "A+";
        } else if (marks >= 70) {
            expectedGrade = "A";
        } else if (marks >= 60) {
            expectedGrade = "B+";
        } else if (marks >= 50) {
            expectedGrade = "B";
        } else if (marks >= 40) {
            expectedGrade = "C";
        } else if (marks >= 30) {
            expectedGrade = "P";
        } else {
            expectedGrade = "F";
        }

        if (!stu_grade.equals(expectedGrade)) {
            throw new GradeMismatchException("Grade does not match the marks.");
        }
    }

    public void showData() {
        System.out.println("Student Name: " + stu_name);
        System.out.println("Student Grade: " + stu_grade);
        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args) {
        StudentGrade student = new StudentGrade();
        try {
            student.getData();
            student.matchGrade();
            student.showData();
        } catch (IOException | WrongMarkException | InvalidGradeException | GradeMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


/*
 ? The StudentGrade class represents a student's grade information.
 ? It includes the student's name, grade, and marks.
 ? The class provides methods to get data from the user, validate the data,
 ? match the grade with the marks, and display the student's information.
 ? 
 ? Exceptions:
 ? - WrongMarkException: Thrown when the marks are not between 0 and 100.
 ? - InvalidGradeException: Thrown when the grade is not one of O, A+, A, B+, B, C, P, F.
 ? - GradeMismatchException: Thrown when the grade does not match the marks.
 ? 
 ? Methods:
 ? - getData(): Reads student data from the user and validates it.
 ? - matchGrade(): Matches the student's grade with the marks and validates it.
 ? - showData(): Displays the student's information.
 ? 
 ? Usage:
 ? The main method creates an instance of StudentGrade, gets data from the user,
 ? matches the grade with the marks, and displays the student's information.
 ? If any exception occurs during the process, it is caught and an error message is displayed.
 */
//!wap a java to define a student class with variables stu name, stu_program, stu_semester. Define getData() method to take input the records of a student from user.Use BufferedReader to take input from user. The exception occurs here is IOException, handle the exception using throws keywords. Define show() method to print the record of 3 student.
import java.io.*;

class Student {
    String stu_name, stu_program, stu_semester;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the student: ");
        stu_name = br.readLine();
        System.out.println("Enter the program of the student: ");
        stu_program = br.readLine();
        System.out.println("Enter the semester of the student: ");
        stu_semester = br.readLine();
    }

    void show() {
        System.out.println("Name of the student: " + stu_name);
        System.out.println("Program of the student: " + stu_program);
        System.out.println("Semester of the student: " + stu_semester);
    }

    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.getData();
        s2.getData();
        s3.getData();

        s1.show();
        s2.show();
        s3.show();
    }
}
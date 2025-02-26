//! Write a java program to define a class Division with two member variables dividend, divisor. Define a method getInput() with Scanner class to take input the values in member variables. Write a method doDivision() to perform division operation. If the divisor is taken as zero, then an exception will be thrown "ArithmeticException", else it will print the result of the operation. Handle exception using try..catch..finally.

import java.util.Scanner;

public class Division {
    float dividend;
    float divisor;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Dividend: ");
        dividend = scanner.nextFloat();
        System.out.print("Enter the Divisor: ");
        divisor = scanner.nextFloat();
        scanner.close();
    }

    public void doDivision() {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Divisor can not be zero");
            }
            System.out.println("Result of division: " + dividend / divisor);
        } catch (Exception exc) {
            System.out.println("404 Error " + exc.getLocalizedMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getInput();
        division.doDivision();
    }
}
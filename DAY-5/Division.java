//! wap in java to define a class division with two member variables dividend, divisor.Define a method getInput() to take input the values in member variables. Write a method doDivision() to perform division operator. If the divisor is taken as zero then an exception will be thrown "ArithmeticException", else it will print the result of operation handle exception using try..catch..finally..

import java.util.Scanner;

class Division {
    int dividend, divisor;

    void getInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the dividend: ");
            dividend = sc.nextInt();
            System.out.println("Enter the divisor: ");
            divisor = sc.nextInt();
        }
    }

    void doDivision() {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("ArithmeticException");
            } else {
                System.out.println("Division is: " + (dividend / divisor));
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("congratulations buddy");
        }
    }

    public static void main(String[] args) {
        Division obj = new Division();
        obj.getInput();
        obj.doDivision();
    }
}
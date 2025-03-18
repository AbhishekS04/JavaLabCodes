//! Wap in java to define the classes add, sub, division, mod are child classes of the thread class. All the classes have two member variables which are initialized using constructor of respective classes. Priority of each class has to be set based on user choice. Depending on the priority the run method of each classes will be invoked and print the respective result of operation.

import java.util.Scanner;

class MathThread extends Thread {
    int a, b;
    String operation;

    MathThread(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void run() {
        switch (operation) {
            case "Add": System.out.println("Addition: " + (a + b)); break;
            case "Sub": System.out.println("Subtraction: " + (a - b)); break;
            case "Div": System.out.println("Division: " + (a / b)); break;
            case "Mod": System.out.println("Modulus: " + (a % b)); break;
        }
    }
}

public class MainY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get input numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Create threads
        MathThread add = new MathThread(a, b, "Add");
        MathThread sub = new MathThread(a, b, "Sub");
        MathThread div = new MathThread(a, b, "Div");
        MathThread mod = new MathThread(a, b, "Mod");

        // Set priorities
        System.out.println("\nSet priorities (1-10):");
        System.out.print("Addition priority: ");
        add.setPriority(sc.nextInt());
        System.out.print("Subtraction priority: ");
        sub.setPriority(sc.nextInt());
        System.out.print("Division priority: ");
        div.setPriority(sc.nextInt());
        System.out.print("Modulus priority: ");
        mod.setPriority(sc.nextInt());

        // Start threads
        System.out.println("\nResults (based on priority):");
        add.start();
        sub.start();
        div.start();
        mod.start();
    }
}
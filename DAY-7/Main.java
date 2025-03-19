//! Wap in JAVA to implement two threads named 1st thread and 2nd thread in each class. Initialize the variable with constructor. Override method to execute a loop from 0 to 10.

class FirstThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("First: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Second: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        t1.start();
        t2.start();
    }
}
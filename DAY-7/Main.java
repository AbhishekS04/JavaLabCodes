//! Wap in JAVA to implement two threads named 1st thread and 2nd thread in each class. Initialize the variable with constructor. Override method to execute a loop from 0 to 10.

class FirstThread extends Thread {
    FirstThread() {
        super("First Thread");
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("First Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("First Thread interrupted");
            }
        }
    }
}

class SecondThread extends Thread {
    SecondThread() {
        super("Second Thread");
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Second Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Second Thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread();
        
        ft.start();
        st.start();
    }
}
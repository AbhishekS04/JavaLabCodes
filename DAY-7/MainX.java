//! Wap in java to define two classes which implements runnable interface. Print the sum series in the run method of AP class and print the multiple series in the run method of GP class. Create objects of both the classes in main method and display the series.

class AP implements Runnable {
    int n;

    AP(int n) {
        this.n = n;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of Arithmetic series up to " + n + " terms: " + sum);
    }
}

class GP implements Runnable {
    int n;
    int r;

    GP(int n, int r) {
        this.n = n;
        this.r = r;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(r, i);
        }
        System.out.println("Sum of Geometric series up to " + n + " terms: " + sum);
    }
}

public class mainX {
    public static void main(String[] args) {
        AP ap = new AP(5);
        GP gp = new GP(5, 2);

        Thread t1 = new Thread(ap);
        Thread t2 = new Thread(gp);

        t1.start();
        t2.start();
    }
}
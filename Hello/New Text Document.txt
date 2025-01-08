// 4. write a java prog to define a class arithmatic wih 2 member variable and following methods 1) add( ): to do sum of 2 numbers and print 2)sub(): to do subtraction of 2 numbers and print 3)multiply():to do multipu 4)divition(): "" 5)get(int,int) 

class Arithmatic {
    int a, b;
    void get(int x, int y) {
        a = x;
        b = y;
    }
    void add() {
        System.out.println("Sum of the number is: " + (a + b));
    }
    void sub() {
        System.out.println("Sub of the number is: " + (a - b));
    }
    void multiply() {
        System.out.println("Multiply of the number is: " + (a * b));
    }
    void division() {
        System.out.println("Division of the number is: " + (a / b));
    }
    public static void main(String[] args) {
        Arithmatic obj = new Arithmatic();
        obj.get(10, 5);
        obj.add();
        obj.sub();
        obj.multiply();
        obj.division();
    }
}
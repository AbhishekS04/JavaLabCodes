public class JavaMethods {
    // static void myMethod() {
    // System.out.println("I am Abhishek singh!");

    // }
    // public static void main(String[] args)
    // {
    // myMethod();
    // }

    // ! A method can also be called multiple times

    // static void MyMethod(){
    // System.out.println("Hi i will exicute three times");
    // }
    // public static void main(String[] args){
    // MyMethod();
    // MyMethod();
    // MyMethod();
    // }
    // ! Java Method Parameters

    // static void MyMethod(String fname) {
    // System.out.println(fname + " is the best car in the world");
    // }

    // public static void main(String[] args) {
    // MyMethod("Bugatti");
    // MyMethod("Lamborghini");
    // MyMethod("Ferrari");

    // }

    // ! Multiple Parameters example

    // static void MyMethod(String fname,int age) {
    // System.out.println("The age of "+fname + " is " +age);
    // }

    // public static void main(String[] args) {
    // MyMethod("Bristi", 19);
    // MyMethod("Abhishek", 21);
    // MyMethod("Snehasish", 20);
    // MyMethod("Tushar", 20);
    // }

    // ! A Method with If...Else

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are not eligible for vote");
        } else {
            System.out.println("You are eligible for vote");
        }
    }

    public static void main(String[] args) {
        checkAge(18);
    }

}
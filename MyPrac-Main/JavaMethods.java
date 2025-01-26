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

    static void MyMethod(String frame) {
        System.out.println(frame + " is the best car in the world");
    }

    public static void main(String[] args) {
        MyMethod("Bugatti");
        MyMethod("Lamborghini");
        MyMethod("Ferrari");

    }

}
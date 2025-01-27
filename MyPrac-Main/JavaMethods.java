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

    // static void checkAge(int age) {
    // if (age < 18) {
    // System.out.println("You are not eligible for vote");
    // } else {
    // System.out.println("You are eligible for vote");
    // }
    // }

    // public static void main(String[] args) {
    // checkAge(18);
    // }

    // ! Java Return

    // static int MyMethod(int x){
    // return 5+x;
    // }

    // public static void main(String[] args) {
    // System.out.println(MyMethod(3));
    // }

    // ! another example

    // static int MyMethod(int x, int y){
    // return x+y;
    // }

    // public static void main(String[] args) {
    // System.out.println("The sum of x and y is: "+MyMethod(3,3));
    // }

    // !You can also store the result in a variable (recommended, as it is easier to
    // read and maintain)

    // static int MyMethod(int x, int y) {
    // return x + y;
    // }
    // public static void main(String[] args) {
    // int z = (MyMethod(10, 5));
    // System.out.println("The sum of x and y is: "+ z);
    // }

    // ! Java Method Overloading

    // ! Method Overloading

    // static int plusMethodInt(int x, int y) {
    // return x + y;
    // }

    // static double plusMethodDouble(double x, double y) {
    // return x + y;
    // }
    // public static void main(String [ ] args) {
    // int myNum1=plusMethodInt(8, 5 ) ;

    // System.out.println("int: "+myNum1);
    // System.out.println("double: "+myNum2);

    // }

    // ! Method Overloading another example

    // static int plusMethod(int x, int y) {
    // return x + y;
    // }
    // static double plusMethod(double x, double y) {
    // return x + y;
    // }
    // public static void main(String[] args) {
    // int myNum1=plusMethod(8, 5);
    // double myNum2=plusMethod(4.5, 4.5);
    // System.out.println("int: "+myNum1);
    // System.out.println("double: "+myNum2);
    // }

    // ! Java Scope

    /*
     * Method Scope
     * Variables declared directly inside a method are available anywhere in the
     * method following the line of code in which they were declared:
     */

    // public static void main(String[] args) {
    // int x = 100;

    // System.out.println(x);
    // }

    // ! Example

    // public static void main(String[] args) {
    // {
    // int x = 100;
    // System.out.println(x);
    // }

    // ? The block ends here

    // {
    // //! Code here CANNOT use x
    // }
    // }

    // ! Java Recursion

    // public static void main(String[] args) {
    // int result = sum(10);
    // System.out.println(result);
    // }

    // public static int sum(int k) {
    // if (k > 0) {
    // return k + sum(k - 1);
    // } else {
    // return 0;
    // }
    // }

    // ! halting condition

    /*
     * Just as loops can run into the problem of infinite looping, recursive
     * functions can run into the problem of infinite recursion. Infinite recursion
     * is when the function never stops calling itself. Every recursive function
     * should have a halting condition, which is the condition where the function
     * stops calling itself. In the previous example, the halting condition is when
     * the parameter k becomes 0
     * It is helpful to see a variety of different examples to better understand the
     * concept. In this example, the function adds a range of numbers between a
     * start and an end. The halting condition for this recursive function is when
     * end is not greater than start:
     */

    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println("The result is: "+result);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
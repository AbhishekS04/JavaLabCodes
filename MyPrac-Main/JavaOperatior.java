//!  Java Operators
// Operators are used to perform operations on variables and values.In the example below, we use the + operator to add together two values:

// public class JavaOperatior {
//     public static void main(String[] args) {
//         int x = 100 + 100;
//         System.out.println("the x is: " + x);
//     }
// }

public class JavaOperatior {
    // public static void main(String[] args) {
    // int sum1 =100;
    // int sum2 =sum1+250;
    // int sum3=sum2+sum2;
    // System.out.println("The sum of the 3rd variable is: "+sum3);
    // }

    // !The addition assignment operator (+=) adds a value to a variable
    public static void main(String[] args) {
        // int x1 = 10;
        // int x2 = 10;
        // int x3 = 10;
        // int x4 = 10;
        // int x5 = 10;
        // int x6 = 10;
        // int x7 = 10;
        // int x8 = 10;
        // int x9 = 10;
        // int x0 = 10;
        // x1 += 5;
        // x2 -= 5;
        // x3 *= 5;
        // x4 /= 5;
        // x5 %= 5;
        // x6 &= 5;
        // x7 |= 5;
        // x8 ^= 5;
        // x9 >>= 5;
        // x0 <<= 5;
        // System.out.println("The value of x1 is: " + x1);
        // System.out.println("The value of x2 is: " + x2);
        // System.out.println("The value of x3 is: " + x3);
        // System.out.println("The value of x4 is: " + x4);
        // System.out.println("The value of x5 is: " + x5);
        // System.out.println("The value of x6 is: " + x6);
        // System.out.println("The value of x7 is: " + x7);
        // System.out.println("The value of x8 is: " + x8);
        // System.out.println("The value of x9 is: " + x9);
        // System.out.println("The value of x0 is: " + x0);

        // ! compariosn operator

        int x = 5;
        int y = 10;

        // System.out.println(x < y);
        // System.out.println(x > y);
        // if (x > y) {
        // System.out.println("x is greater than y");
        // } else {
        // System.out.println("x is not greater than y");

        // }

        // ! Java Comparison Operators

        System.out.println("The result of Equal to is: " + (x == y));
        System.out.println("The value of Not equal is:" + (x != y));
        System.out.println("The value of Greater than equal: " + (x >= y));
        System.out.println("The value of less than equal: " + (x <= y));
        System.out.println("The value of Logical and: " + (x < 10 && y > 5)); // ! Logical and Returns true if both
                                                                              // statements are true

        System.out.println("The value of Logical or: " + (x < 10 || y > 5)); // ! Logical or Returns true if one of the
                                                                             // statements is true

        System.out.println("The value of Logical not: " + !(x < 10 && y > 5)); // ! Logical not Reverse the result,
                                                                               // returns false if the result is true

    }
}
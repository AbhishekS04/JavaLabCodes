//!Widening Casting (automatically) - converting a smaller type to a larger type size


// public class TypeCasting {
//     public static void  main(String[] args) {
//        int myInt=10;
//        double myDouble = myInt;
//          System.out.println("MyInt is: "+myInt);
//             System.out.println("MyDouble is: "+myDouble);
//     }
// }

//! Narrowing Casting 

// public class TypeCasting {
//     public static void  main(String[] args) {
//        double MyDouble=9.78d;
//        int MyInt = (int) MyDouble; 
//          System.out.println("MyDouble is: "+MyDouble);
//             System.out.println("MyInt is: "+MyInt);
//     }
// }

//! Real Life example of Type Casting

public class TypeCasting{
    public static void main(String[] args) {
        int maxScore=100;
        int userScore=80;
        float percentage =(float) userScore/maxScore*100;
        System.out.println("The percentage is: "+percentage);
    }
}
public class JavaMethodoverloday {
    
    // ! Method Overloading
    

    // static int plusMethodInt(int x, int y) {
    //     return x + y;
    // }

    // static double plusMethodDouble(double x, double y) {
    //     return x +   y;
    // }  
    // public static void main(String [ ] args) {
    //     int myNum1=plusMethodInt(8, 5 ) ;

    //     System.out.println("int: "+myNum1);
    //     System.out.println("double: "+myNum2);
        
    // }
    
    //! Method Overloading another example
    
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int myNum1=plusMethod(8, 5);
        double myNum2=plusMethod(4.5, 4.5);
        System.out.println("int: "+myNum1);
        System.out.println("double: "+myNum2);
        
    }
}

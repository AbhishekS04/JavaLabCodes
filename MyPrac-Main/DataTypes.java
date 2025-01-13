// ! Java Data Types

/*
 * (byte) Stores whole numbers from -128 to 127
 * (short) Stores whole numbers from -32,768 to 32,767
 * (int) Stores whole numbers from -2,147,483,648 to 2,147,483,647
 * (long) Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * (float) Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 * (double) Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
 * (boolean) Stores true or false values
 * (char) Stores a single character/letter or ASCII values
 */

public class DataTypes {

    public static void main(String args[]) {

        // byte myByte = 100;
        // System.out.println("The byte is: " + myByte);
        // short myShort = 5000;
        // System.out.println("The Short is: " + myShort);
        // int myInt = 100;
        // System.out.println("The Int is: " + myInt);
        // long myLong = 100;
        // System.out.println("The Long is: " + myLong);
        // float myFloat = 200.00f;
        // System.out.println("The float is: " + myFloat);
        // double myDouble = 100.99d;
        // System.out.println("The double is: " + myDouble);
        // char myChar = 'A';
        // System.out.println("The char is: " + myChar);
        // String myString = "Abhishek Singh";
        // System.out.println("The string is: " + myString);

        // ! examples

        // float f1=15.99f;
        // System.out.println("The Float Value Is: "+f1);

        // ! the value is 120000.0 because the E4 is a scientific notation and it is
        // equal to 10^4

        // double d1=12E4d;
        // System.out.println("The Float Value Is: "+d1);

        // ! More examples

        // boolean isJavaFun =true;
        // boolean isFishTasty = false;
        // System.out.println("Java is fun: "+isJavaFun);
        // System.out.println("Java is fun: "+isFishTasty);

        // ! More examples

        // char myGrade ='a';
        // System.out.println(myGrade);

        // ? another type of char example

        // * The ASCII value of A is 65, B is 66, and C is 67

        // char myVal1= 65, myVal2= 66, myVal3= 67;
        // System.out.println("The First Value is: " + myVal1);
        // System.out.println("The Second Value is: " + myVal2);
        // System.out.println("The Third Value is: " + myVal3);

        // ! string example

        // String msg = "Hello my name is Abhishek singh";
        // System.out.println("The message is: " + msg);

        // ! Real-Life example

        int items = 20;
        float costPerItems = 10.99f;
        float totalCost = items * costPerItems;
        char currency = '$';
        System.out.println("The number of items are: " + items);
        System.out.println("the cost per item is: " + currency + costPerItems );
        System.out.println("Total cost: "+  currency + totalCost );
    }
}
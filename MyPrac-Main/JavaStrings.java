//! Java Strings

public class JavaStrings {

    public static void main(String[] args) {

        // String txt = "Hello World";
        /*
         * String txt = "Please locate where 'locate' occurs!";
         * 
         * // ? .length() method returns the length of a string (number of characters).
         * 
         * System.out.println("The length of the txt string is: " + txt.length());
         * 
         * // ? .toUpperCase() method converts a string to upper case letters.
         * System.out.println("The Upper case of the txt string is: " +
         * txt.toUpperCase());
         * 
         * // ? .toLowerCase() method converts a string to lower case letters.
         * System.out.println("The Lower case of the txt string is: " +
         * txt.toLowerCase());
         * 
         * // ? The indexOf() method returns the index of (the position of) the first
         * System.out.println("The index of word locate is: " + txt.indexOf("locate"));
         */

        // String FirstName = "Abhishek";
        // String LastName = "Singh";

        // String FullName =FirstName+ " " +LastName;
        // System.out.println("The full name is: "+FullName);

        // ! The concat() method can be used to concatenate two strings.

        // System.out.println("The raw version of concat is:
        // "+FirstName.concat(LastName));
        // System.out.println("The modified Space Beteen the texts: "+FirstName.concat("
        // ").concat(LastName));

        // ! Note Warning: String Concatenation (+) and Addition (+)
        // ! Java uses the + operator for both addition and concatenation.
        // ! Numbers are added. Strings are concatenated.

        // ? When nubers are present the + oparator will add the numbers.
        // int x = 10;
        // int y = 20;
        // int z = x + y;
        // System.out.println("The vale of addition is: " + z);

        // ? When strings are present the + oparator will add the strings.
        // String x1 = "10";
        // String y1 = "20";
        // String z1 = x1 + y1;
        // System.out.println("The value of two strings addition is: " + z1);

        // ? If you add a number and a string, the result will be a string concatenation
        // String X = "10";
        // int Y = 20;
        // String Z = X + Y;
        // System.out.println("The value of string and number addition is: " + Z);

        String txt = "My name is abhishek and \'Singh\' is my surname";
        String txt1 = "My name is abhishek and \"Singh\" is my surname";
        String txt2 = "My name is abhishek and \\Singh\\ is my surname";
        System.out.print(txt);
        System.out.print("\n" + txt1);
        System.out.print("\n" + txt2);

        //! \n New Line: It is used to move the cursor to the next line.
        //! \r Carriage Return: It is used to move the cursor to the beginning of the current line.
        //! \t Tab: It is used to move the cursor to the next tab stop.
        //! \b Backspace: It is used to move the cursor one position back.
        //! \f Form Feed: It is used to advance the paper to the next page or to the next form feed position.


    

    }
}
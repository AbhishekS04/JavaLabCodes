public class JavaArray {

    public static void main(String[] args) {

        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // cars[1]="Bugatti";
        // System.out.println(cars[1]);

        // int[] MyNum={1,2,3,4,5};
        // System.out.println(MyNum[2]);

        // ! Array length

        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // cars[1] = "Bugatti";
        // System.out.println(cars[1]);
        // System.out.println(cars.length);

        // ! loops in array

        // String[] myCars = { "Volvo", "BMW", "Ford", "Mazda" };
        // for (int i = 0; i < myCars.length; i++) {
        // System.out.println(myCars[i]);
        // }

        // ! For-Each Loop

        // String[] myCars = { "Volvo", "BMW", "Ford", "Mazda" };
        // for (String i : myCars) {
        // System.out.println(i);
        // }

        // ! Real life example

        // int ages[] = { 20, 25, 38, 15, 10, 11, 12, 33, 66, 80 };
        // float avg, sum = 0;
        // int length = ages.length;
        // for (int age : ages) {
        // sum += age;
        // }
        // avg = sum / length;
        // System.out.println("Average age is: " + avg);

        // ! Another real life example

        // int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        // int length = ages.length;

        // int lowestAge = ages[0];

        // for (int age : ages) {
        // if (lowestAge > age) {
        // lowestAge = age;
        // }
        // }

        // System.out.println("The lowest age in the array is: " + lowestAge);

        // ! Java Multidimensional Array

        int[][] myNum = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
        myNum[1][2]=10;
        System.out.println(myNum[1][2]);

    }
}

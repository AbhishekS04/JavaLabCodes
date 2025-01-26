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
        //     System.out.println(myCars[i]);
        // }

        //! For-Each Loop

        String[] myCars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : myCars) {
            System.out.println(i);
        }
    }
}

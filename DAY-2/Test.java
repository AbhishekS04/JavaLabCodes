//! calculate the area of circle and square using method overloading

// ...existing code...

import java.util.Scanner;

class Test {
    float radius;
    int side;

    float calArea(float radius) {
        return 3.14f * radius * radius;
    }

    int calArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();

        Test test = new Test();
        System.out.println("The area of the circle is: " + test.calArea(radius));
        System.out.println("The area of the square is: " + test.calArea(side));
    }
}
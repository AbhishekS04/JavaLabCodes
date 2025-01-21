//! calculate the area of circle and square using method overloading


import java.util.Scanner;

class Area {
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
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();

        Area test = new Area();
        System.out.println("The area of the circle is: " + test.calArea(radius));
        System.out.print("The area of the square is: " + test.calArea(side));
    }
}
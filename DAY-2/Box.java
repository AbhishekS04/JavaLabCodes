// Define a class Box with member variable length, breadth, and height. Define constructor to create object of cube and cuboid. Define method to calculate volume of both cube and cuboid. Define display method to show the volume of the cube and cuboid. In main method, create objects of Box class where one object is cube type and another is cuboid. Find volume of both.

public class Box {
    private double length;
    private double breadth;
    private double height;

    // Constructor for cuboid
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Constructor for cube
    public Box(double side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    // Method to calculate volume
    public double calcVolume() {
        return length * breadth * height;
    }

    // Method to display dimensions and volume
    public void display() {
        System.out.println("Dimensions: " + length + " x " + breadth + " x " + height);
        System.out.println("Volume: " + calcVolume());
    }

    public static void main(String[] args) {
        // Create a cube with side length 5
        Box cube = new Box(5);

        // Create a cuboid with dimensions 4, 5, 6
        Box cuboid = new Box(4, 5, 6);

        System.out.println("Cube:");
        cube.display();

        System.out.println("\nCuboid:");
        cuboid.display();
    }
}
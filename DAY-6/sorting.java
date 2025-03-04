//! Write a Java program to define a class Sort array with two member variables: an array of integers and an integer type size. Initialize the array and size in the constructor. Define a method sort to sort the array in ascending order. If the loop exceeds the size, an ArrayIndexOutOfBoundsException occurs as the sorting is done. Define a method show to display the sorted array.


import java.util.Arrays;

public class Sorting {
    int[] array;
    int size;

    public Sorting(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    public void sort() {
        try {
            Arrays.sort(array);
            // int invalidAccess = array[size];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public void show() {
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 2, 8, 1, 4 };
        Sorting sorting = new Sorting(array);

        sorting.sort();
        sorting.show();
    }
}
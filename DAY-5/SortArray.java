//!wap in java to define a class SortArrray with two member variables one array of integer type a and size in constructor. Define method sort() to sort the array in assending order. if the loop exceed the size then "arrayIndexOutOfBoundsException" occur. else the sorting is done. define a method show() to display the sorted array.

public class SortArray {
    int[] array;
    int size;

   public SortArray(int[] array) {
       this.array = array;
       this.size = array.length;
   }


   public void sort() {
       try {
           for (int i = 0; i < size; i++) {
               for (int j = 0; j < size - i - 1; j++) {
                   if (array[j] > array[j + 1]) {
                       int temp = array[j];
                       array[j] = array[j + 1];
                       array[j + 1] = temp;
                   }
               }
           }
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("ArrayIndexOutOfBoundsException occurred");
       }
   }


   public void show() {
       System.out.print("Sorted array: ");
       for (int i = 0; i < size; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }

   public static void main(String[] args) {
       int[] array = {5, 2, 8, 1, 3};
       SortArray sortArray = new SortArray(array);
       sortArray.sort();
       sortArray.show();
   }
}
//! Wap to enter java program define a class "Hotel" with member variable hotel list which is of Arraylist type & methods are 
//! 1)getItem() this is used to take the input name of the hotel from the user & insert  in the hotel list 
//! 2)throw-new-it shows the list of hotel
//! 3)insert-new-hotel input the name of a new hotel & add in the hotel list 
//! 4) change-list -change name of the hotel at 3rd index enter the new name 
//! 5)remove- list remove the name of hotel of 2nd index
//! In each method call the show.hotel() to show the updated hotel list

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    private ArrayList<String> hotelList;

    public Hotel() {    
        hotelList = new ArrayList<>();
    }

    public void getItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the hotel: ");                     
        String hotelName = scanner.nextLine();
        hotelList.add(hotelName);
        showHotel();
    }

    public void showHotel() {           
        System.out.println("Hotel List:");
        for (int i = 0; i < hotelList.size(); i++) {
            System.out.println((i + 1) + ". " + hotelList.get(i));
        }
    }

    public void insertNewHotel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the new hotel:");
        String hotelName = scanner.nextLine();
        hotelList.add(hotelName);
        showHotel();
    }

    public void changeList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the hotel to change:");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new name of the hotel:");
        String newName = scanner.nextLine();
        hotelList.set(index - 1, newName);
        showHotel();
    }

    public void removeList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the hotel to remove:");
        int index = scanner.nextInt();
        scanner.nextLine();
        hotelList.remove(index - 1);
        showHotel();
    }

    public static void main(String[] args) {    
        Hotel hotel = new Hotel();
        hotel.getItem();
        hotel.insertNewHotel();
        hotel.changeList();
        hotel.removeList();
    }
}


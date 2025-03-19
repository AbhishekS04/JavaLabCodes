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
    private ArrayList<String> hotels = new ArrayList<>();

    public void addHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hotel name: ");
        hotels.add(sc.nextLine());
        showHotels();
    }

    public void showHotels() {
        System.out.println("\nHotels:");
        for (int i = 0; i < hotels.size(); i++) {
            System.out.println((i + 1) + ". " + hotels.get(i));
        }
    }

    public void changeHotel() {
        if (hotels.size() >= 3) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter new name for 3rd hotel: ");
            hotels.set(2, sc.nextLine());
            showHotels();
        } else {
            System.out.println("Need at least 3 hotels!");
        }
    }

    public void removeHotel() {
        if (hotels.size() >= 2) {
            hotels.remove(1);
            showHotels();
        } else {
            System.out.println("Need at least 2 hotels!");
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Hotel");
            System.out.println("2. Show Hotels");
            System.out.println("3. Change 3rd Hotel");
            System.out.println("4. Remove 2nd Hotel");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            switch (choice) {
                case 1: hotel.addHotel(); break;
                case 2: hotel.showHotels(); break;
                case 3: hotel.changeHotel(); break;
                case 4: hotel.removeHotel(); break;
                case 5: 
                    System.out.println("Bye!");
                    sc.close();
                    return;
                default: System.out.println("Wrong choice!");
            }
        }
    }
}
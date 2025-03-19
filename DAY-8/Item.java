//! Wap to enter java program to define a class "Item" with member variables name, quantity, price as string, int, double variables. Define a method getData() to take input using the Buffer reader in all the variables. Define a method showData() to display the record of the item. Define a method calPrice() to find the total price of three items taken input from user

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Item {
    private String name;
    private int quantity;
    private double price;

    public void getData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter item name: ");
        name = reader.readLine();

        System.out.print("Enter quantity: ");
        quantity = Integer.parseInt(reader.readLine());

        System.out.print("Enter price: ");
        price = Double.parseDouble(reader.readLine());
    }   

    public void showData() {
        System.out.println("Item Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public void calPrice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double totalPrice = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter quantity for item " + (i + 1) + ": ");
            int quantity = Integer.parseInt(reader.readLine());

            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = Double.parseDouble(reader.readLine());

            totalPrice += quantity * price;
        }       

        System.out.println("Total price of three items: " + totalPrice);
    }

    public static void main(String[] args) {
        Item item = new Item();     
        try {
            item.getData();
            item.showData();
            item.calPrice();
        } catch (IOException e) {
            e.printStackTrace();    
        }
    }
}   

//output

// Enter item name: Apple
// Enter quantity: 10
// Enter price: 1.5
// Item Name: Apple
// Quantity: 10
// Price: 1.5
// Enter quantity for item 1: 2
// Enter price for item 1: 3.0
// Enter quantity for item 2: 3
// Enter price for item 2: 2.0
// Enter quantity for item 3: 1
// Enter price for item 3: 1.0
// Total price of three items: 11.0
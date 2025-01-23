//! Write a Java program to define a fruit with member variable name and member methods get name show name define a child class orange of fruit class with member variablesseason and prize and member methods get data and display create object of orange class and display the records


class Fruit {
    String name;
    
    void getName(String n) {
        name = n;
    }
    
    void showName() {
        System.out.println("Name: " + name);
    }
}

class Orange extends Fruit {
    String season;
    int prize;
    
    void getData(String s, int p) {
        season = s;
        prize = p;
    }
    
    void display() {
        System.out.println("Season: " + season);
        System.out.println("Prize: " + prize);
    }
}

public class fruit {
    public static void main(String[] args) {
        Orange obj = new Orange();
        obj.getName("Orange");
        obj.showName();
        obj.getData("Winter", 50);
        obj.display();
    }
}
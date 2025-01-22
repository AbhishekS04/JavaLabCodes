//! Write a Java program to define a fruit with member variable name and member methods get name show name define a child class orange of fruit class with member variablesseason and prize and member methods get data and display create object of orange class and display the records

class fruit {
    String name;

    void getName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("The name of the fruit is: " + name);
    }
}

class Orange extends fruit {
    String season;
    int prize;

    void getData(String season, int prize) {
        this.season = season;
        this.prize = prize;
    }

    void display() {
        System.out.println("The season of the fruit is: " + season);
        System.out.println("The prize of the fruit is: " + prize);
    }
}

public class frute {
    public static void main(String[] args) {
        Orange obj = new Orange();

        obj.getName("Orange");
        obj.showName();

        obj.getData("Winter", 50);
        obj.display();
    }
}
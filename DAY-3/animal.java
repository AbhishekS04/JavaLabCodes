//! P.S:5 Define a base class Animal, with type as member variable that imply domestic or wild animal. Initialize the variable with get() method. Define a derived class Cat which has two member variables breed and colour. Initialize the variables with set() method. Define show() method in Cat class that show the attributes of a Cat. Define a Main class and create two objects of the Cat class

class animalk {
    String type;

    void get(String type) {
        this.type = type;
    }
}

class Cat extends animalk {
    String breed;
    String colour;

    void set(String breed, String colour) {
        this.breed = breed;
        this.colour = colour;
    }

    void show() {
        System.out.println(" Breed: " + breed + ", Colour: " + colour);
    }
}

public class animal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        
        cat1.set("Persian", "White");
        
        cat2.set("Siamese", "Black");

        cat1.show();
        cat2.show();
    }
}

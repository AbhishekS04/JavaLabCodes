//!Define a class animal with a single variable type and a parameterized constructor to inherit the variable define a class dog which is a child class of animal with two variable breed and name write a parameterized constructor in the dog class to initialize the object define display method to showthe recordcreate two objects of dog class and show the record


class animalTwoo {
    String type;

    animalTwoo(String type) {
        this.type = type;
    }
}

class Dog extends

animalTwoo {
    String breed;
    String name;

    Dog(String type, String breed, String name) {
        super(type);
        this.breed = breed;
        this.name = name;
    }

    void display() {
        System.out.println("Type: " + type + ", Breed: " + breed + ", Name: " + name);
    }
}

public class animalTwo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Domestic", "Labrador", "Bruno");
        Dog dog2 = new Dog("Wild", "Husky", "Max");

        dog1.display();
        dog2.display();
    }
}
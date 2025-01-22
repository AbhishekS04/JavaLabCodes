//! Define a class vehicle with one member variable type initialize the variable with constructor define a class car with the number variable model and price initialize thevariable with constructor define a method display() in car class to show the record of a car

class vehicle {
    String type;

    vehicle(String type) {
        this.type = type;
    }
}

class Car extends vehicle {
    String model;
    int price;

    Car(String type, String model, int price) {
        super(type);
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Vehicle Type: " + (type));
        System.out.println("Car Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car c = new Car("Fortuner", "Toyota", 250000);
        c.display();
    }
}

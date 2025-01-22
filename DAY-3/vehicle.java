//! Define a class vehicle with one member variable type initialize the variable with constructor define a class car with the number variable model and price initialize thevariable with constructor define a method display() in car class to show the record of a car

class vehicle {
    String type;

    vehicle(String type) {
        this.type = type;
    }
}

class Car extends
        vehicle {
    String model;
    int price;

    Car(String type, String model, int price) {
        super(type);
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("The type of the vehicle is: " + type);
        System.out.println("The model of the vehicle is: " + model);
        System.out.println("The price of the vehicle is: " + price);
    }
}

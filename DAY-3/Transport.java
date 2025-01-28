//! Define a class transport with variable transport and name define the class road transport water transport air transport that are the children of class transportwhich distinct single variablein the each class define the show method in each of the child classes to displaythe record of each type of transport

class transport {
    String transport;
    String name;

    transport(String transport, String name) {
        this.transport = transport;
        this.name = name;
    }
}

class road extends transport {
    road(String transport, String name) {
        super(transport, name);
    }

    void show() {
        System.out.println("Transport: " + transport + ", Name: " + name);
    }
}

class water extends transport {
    water(String transport, String name) {
        super(transport, name);
    }

    void show() {
        System.out.println("Transport: " + transport + ", Name: " + name);
    }
}

class air extends

        transport {
    air(String transport, String name) {
        super(transport, name);
    }

    void show() {
        System.out.println("Transport: " + transport + ", Name: " + name);
    }
}

public class Transport {
    public static void main(String[] args) {
        road road1 = new road("Road", "Car");
        water water1 = new water("Water", "Boat");
        air air1 = new air("Air", "Aeroplane");

        road1.show();
        water1.show();
        air1.show();
    }
}
//! write a java prog to implement a single interface in three child class


// Define the interface

interface MyInterface {
    void display();
}

// First child class
class ChildClass1 implements MyInterface {
    public void display() {
        System.out.println("Display method in ChildClass1");
    }
}

// Second child class
class ChildClass2 implements MyInterface {
    public void display() {
        System.out.println("Display method in ChildClass2");
    }
}

// Third child class
class ChildClass3 implements MyInterface {
    public void display() {
        System.out.println("Display method in ChildClass3");
    }
}

// Main class to test the implementation
public class InterfaceTest {
    public static void main(String[] args) {
        MyInterface obj1 = new ChildClass1();
        MyInterface obj2 = new ChildClass2();
        MyInterface obj3 = new ChildClass3();

        obj1.display();
        obj2.display();
        obj3.display();
    }
}




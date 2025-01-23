
//! Define the 3 classes named Add, Sub, Div with two member variables each and get methods to initialize the  variables and add(), sub() and div() methods in respective classes. All the classes have show() method to display the result of addition, substruction, division respectively. Define Main class that have main() method. In main() method create objects of 3 classes and perform arithmetic operations.

//! The variables are initialized with 12 and 6 respectively.

class Operation {
    int a, b;

    void get(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Add extends Operation {
    void show() {
        System.out.println("The sum is: " + (a + b));
    }
}

class Sub extends Operation {
    void show() {
        System.out.println("The difference is: " + (a - b));
    }
}

class Div extends Operation {
    void show() {
        System.out.println("The division is: " + (a / b));
    }
}

public class Arithmatic {
    public static void main(String[] args) {
        Add obj1 = new Add();
        Sub obj2 = new Sub();
        Div obj3 = new Div();

        obj1.get(12, 6);
        obj2.get(12, 6);
        obj3.get(12, 6);

        obj1.show();
        obj2.show();
        obj3.show();
    }
}

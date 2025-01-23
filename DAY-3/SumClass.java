//! Write a Java program with multiple classes A, B, and C respectively. All the classes have a single member variable. Class A and Class B have methods to initialize the member variable. Class C has a method for the addition of two variables of the classes A and B respectively, and a show method to display the sum. Define the main method in class C.

class A {
    int a;
}

class B {
    int b;
}

class C {
    void add(A obj1, B obj2) {
        System.out.println("The sum is: " + (obj1.a + obj2.b));
    }
}

public class SumClass {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.a = 10;
        obj2.b = 20;

        obj3.add(obj1, obj2);
    }
}

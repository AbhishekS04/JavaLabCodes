//! Define a class numb with a single variable and a parameterized constructor to initialize the variable define a class denote with which is a child of name class with single variable and a parameterized constructor defined a class for which is a child class of denote that has a parameterized constructor it has a display method to show the function created two objects of frack class and display the function in the main class


class numb {
    int number;

    numb(int number) {
        this.number = number;
    }
}

class denote extends numb {
    int num;

    denote(int number, int num) {
        super(number);
        this.num = num;
    }
}

class frack extends denote {
    frack(int number, int num) {
        super(number, num);
    }

    void display() {
        System.out.println("Number: " + number + ", Num: " + num);
    }
}

public class Deno {
    public static void main(String[] args) {
        frack frack1 = new frack(10, 20);
        frack frack2 = new frack(30, 40);

        frack1.display();
        frack2.display();
    }
}
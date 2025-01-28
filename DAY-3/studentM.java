//!  Define a class student with membervariable name , roll ,  reg , define to child class ug student and pg student with a single variable in each class use constructor to initialize all the variable use display method in ug & pg studentclass to display the record of student

class Student {
    String name;
    int roll;
    int reg;

    Student(String name, int roll, int reg) {
        this.name = name;
        this.roll = roll;
        this.reg = reg;
    }
}

class ug extends Student {
    ug(String name, int roll, int reg) {
        super(name, roll, reg);
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Reg: " + reg);
    }
}

class pg extends Student {
    pg(String name, int roll, int reg) {
        super(name, roll, reg);
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Reg: " + reg);
    }
}

public class studentM {
    public static void main(String[] args) {
        ug ug1 = new ug("UG Student", 1, 101);
        pg pg1 = new pg("PG Student", 2, 102);

        ug1.display();
        pg1.display();
    }
}
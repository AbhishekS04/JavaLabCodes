interface Addition {
    int add(int a, int b);
}

interface Subtraction {
    int subtract(int a, int b);
}

interface Multiplication {
    int multiply(int a, int b);
}

interface Division {
    int divide(int a, int b);
}

// Implement the interfaces in a single class
class Calculator implements Addition, Subtraction, Multiplication, Division {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

// Main class to test the Calculator
public class ArithmeticOp {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();

        // Perform arithmetic operations using calc1
        System.out.println("Calc1 Add: " + calc1.add(10, 5));
        System.out.println("Calc1 Subtract: " + calc1.subtract(10, 5));
        System.out.println("Calc1 Multiply: " + calc1.multiply(10, 5));
        System.out.println("Calc1 Divide: " + calc1.divide(10, 5));

        // Perform arithmetic operations using calc2
        System.out.println("Calc2 Add: " + calc2.add(20, 10));
    }
}

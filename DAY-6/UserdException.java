//! Write a program to implement user defined exception in Java.

class MyException extends Exception {
    String msg;

    MyException(String s) {
        msg = s;
    }

    public String toString() {
        return msg;
    }
}

class UserDException {
    public static void main(String s[]) {
        int a = 10;
        try {
            if (a > 10) {
                throw new MyException("Exception occurred");
            } else {
                System.out.println("The value of a is: " + a);

            }
        } catch (MyException ob) {
            System.out.println(ob);
        }
    }
}

// 2. Write a java prog to define a class Num with a single variable and the following methods 1) getMethod(initialize the variable) 2)show()  3)main ()

class Num {
    int num;
    void getMethod(int n) {
        num = n;
    }
    void show() {
        System.out.println("The number is: " + num);
    }
    public static void main(String[] args) {
        Num obj = new Num();
        obj.getMethod(10);
        obj.show();
    }
}
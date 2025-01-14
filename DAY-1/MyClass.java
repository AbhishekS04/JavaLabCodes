
// class MyClass {
//     public static void main(String args[] ) {
//         System.out.println("Abhishek Singh");
//         System.out.println("Department: Computer Science and Engineering");
//         System.out.println("Roll Number: UG/02/BTCSE/2023/011");
//         System.out.println("Sec: A");
//     }
// }

class MyClass {
    public static void main(String args[]) {

        System.out.println("Name:" + args[0]);
        System.out.println("Roll:" + args[1]);
        System.out.println("Sec:" + args[2]);

    }
}

// ! output

// ? javac MyClass.java
// ? java MyClass "Abhishek" "011" "A"
/*

 * ? Name:Abhishek singh
 * ? Roll:011
 * ? Sec:A
  
 */
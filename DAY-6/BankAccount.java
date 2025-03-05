
/* 
!5.Write a java program to define a class BankAccount with member variables cus_name, cus_acc, balance. The methods are:
!a. getData() to initialize the variables
!b. showData() to show record of the customer.
!c. deposit() to deposit the amount and update the balance, if amount <= 0, then throw an exception named "WrongAmount" and print the alert message.
!d. withdraw() to withdraw amount and update balance, if amount > balance, throw an exception named "InsufficientBalance" and print the alert message.
!Write the main class to define main() method where create an object of BankAccount class and call the methods.
*/ 

//TODO: this is a scanner class to take input from the user

// import java.util.Scanner;
//  class BankAccount {
//     String cus_name;
//     int cus_acc;
//     double balance;

//     void getData(String name, int acc, double bal) {
//         cus_name = name;
//         cus_acc = acc;
//         balance = bal;
//     }

//     void showData() {
//         System.out.println("Customer Name: " + cus_name);
//         System.out.println("Customer Account Number: " + cus_acc);
//         System.out.println("Customer Balance: " + balance);
//     }

//     void deposit(double amount) {
//         if (amount <= 0) {
//             try {
//                 throw new WrongAmount("Amount is less than or equal to 0");
//             } catch (WrongAmount e) {
//                 System.out.println(e);
//             }
//         } else {
//             balance += amount;
//             System.out.println("Amount deposited successfully");
//         }
//     }

//     void withdraw(double amount) {
//         if (amount > balance) {
//             try {
//                 throw new InsufficientBalance("Insufficient Balance");
//             } catch (InsufficientBalance e) {
//                 System.out.println(e);
//             }
//         } else {
//             balance -= amount;
//             System.out.println("Amount withdrawn successfully");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         BankAccount account = new BankAccount();

//         System.out.print("Enter customer name: ");
//         String name = scanner.nextLine();
//         System.out.print("Enter customer account number: ");
//         int acc = scanner.nextInt();
//         System.out.print("Enter initial balance: ");
//         double bal = scanner.nextDouble();

//         account.getData(name, acc, bal);
//         account.showData();

//         System.out.print("Enter amount to deposit: ");
//         double depositAmount = scanner.nextDouble();
//         account.deposit(depositAmount);
//         account.showData();

//         System.out.print("Enter amount to withdraw: ");
//         double withdrawAmount = scanner.nextDouble();
//         account.withdraw(withdrawAmount);
//         account.showData();

//         scanner.close();
//     }
// }

// class WrongAmount extends Exception {
//     public WrongAmount(String message) {
//         super(message);
//     }
// }

// class InsufficientBalance extends Exception {
//     public InsufficientBalance(String message) {
//         super(message);
//     }
// }


//! this is a parameterized

class BankAccount {
    String cus_name;
    int cus_acc;
    double balance;

    BankAccount(String name, int acc, double bal) {
        cus_name = name;
        cus_acc = acc;
        balance = bal;
    }

    void showData() {
        System.out.println("Customer Name: " + cus_name);
        System.out.println("Customer Account Number: " + cus_acc);
        System.out.println("Customer Balance: " + balance);
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount is less than or equal to 0");
        } else {
            balance += amount;
            System.out.println("Amount deposited successfully");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Abhishek Singh", 232004, 10000.0);
        account.showData();

        account.deposit(500.0);
        account.showData();

        account.withdraw(200.0);
        account.showData();
    }
}

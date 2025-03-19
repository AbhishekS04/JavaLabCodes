    //! write a java program to define a class To-Do-List that consists of a member variable task in a vector type. the methods are 1:- addTask() to get input from user and add to the task vector. 2:- showTask() to show each task in a tabular format with serial number. 3:- insertTask() to insert a new task at given index by the user. 4:- delTask() to delete the specific task given by the user.after insertTask and delTask call showTask .

import java.util.*;

class ToDoList {
    private Vector<String> tasks = new Vector<>();

    void addTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter task: ");
        tasks.add(sc.nextLine());
    }

    void showTask() {
        for (int i = 0; i < tasks.size(); i++)
            System.out.println((i + 1) + ". " + tasks.get(i));
    }

    void insertTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter task: ");
        tasks.add(index - 1, sc.nextLine());
        showTask();
    }

    void delTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter task number to delete: ");
        tasks.remove(sc.nextInt() - 1);
        showTask();
    }
}

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList list = new ToDoList();
        while (true) {
            System.out.println("1. Add Task 2. Show Tasks 3. Insert Task 4. Delete Task 5. Exit");
            switch (sc.nextInt()) {
                case 1: list.addTask(); break;
                case 2: list.showTask(); break;
                case 3: list.insertTask(); break;
                case 4: list.delTask(); break;
                case 5: return;
            }
        }
    }
}

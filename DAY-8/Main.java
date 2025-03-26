    //! write a java program to define a class To-Do-List that consists of a member variable task in a vector type. the methods are 1:- addTask() to get input from user and add to the task vector. 2:- showTask() to show each task in a tabular format with serial number. 3:- insertTask() to insert a new task at given index by the user. 4:- delTask() to delete the specific task given by the user.after insertTask and delTask call showTask .
    
    import java.util.*;

    class ToDoList {
        private Vector<String> tasks = new Vector<>();
        private Scanner scanner = new Scanner(System.in);
    
        void addTask() {
            System.out.print("Enter task: ");
            tasks.add(scanner.nextLine());
        }
    
        void showTask() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks available.");
                return;
            }
            for (int i = 0; i < tasks.size(); i++)
                System.out.println((i + 1) + ". " + tasks.get(i));
        }
    
        void insertTask() {
            System.out.print("Enter position: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();
            if (index < 0 || index > tasks.size()) return;
            System.out.print("Enter task: ");
            tasks.add(index, scanner.nextLine());
            showTask();
        }
    
        void delTask() {
            System.out.print("Enter position: ");
            int index = scanner.nextInt() - 1;
            if (index < 0 || index >= tasks.size()) return;
            tasks.remove(index);
            showTask();
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            ToDoList todo = new ToDoList();
            Scanner scanner = new Scanner(System.in);
            int choice;
    
            do {
                System.out.println("1. Add Task\n2. Show Tasks\n3. Insert Task\n4. Delete Task\n5. Exit");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> todo.addTask();
                    case 2 -> todo.showTask();
                    case 3 -> todo.insertTask();
                    case 4 -> todo.delTask();
                    case 5 -> System.out.println("Goodbye!");
                }
            } while (choice != 5);
        }
    }
    
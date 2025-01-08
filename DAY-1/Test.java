public class Test {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("No name argument provided.");
        }

        if (args.length > 1) {
            System.out.println(args[1]);
        } else {
            System.out.println("No second argument provided.");
        }
    }
}
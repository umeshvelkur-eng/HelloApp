public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Join all names using String.join()
        String names = String.join(", ", args);

        // Print output
        System.out.println("Hello, " + names + "!");
    }
}
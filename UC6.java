public class HelloApp {
    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", " using substring
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print final output
        System.out.println("Hello, " + names + "!");
    }
}
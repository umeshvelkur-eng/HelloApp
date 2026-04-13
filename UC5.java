public class UC5 {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            names.append("World");
        } else {
            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove trailing comma and space
            names.setLength(names.length() - 2);
        }

        // Print the greeting
        System.out.println("Hello, " + names + "!");
    }
}
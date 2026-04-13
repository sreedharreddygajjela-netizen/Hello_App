public class uc6 {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // Create StringBuilder
            StringBuilder nameBuilder = new StringBuilder();

            // Append all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                nameBuilder.setLength(nameBuilder.length() - 2);
                // OR you can use:
                // String result = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Print final greeting
            System.out.println("Hello, " + nameBuilder.toString());
        }
    }
}
public class exception {  // Renamed to follow Java naming conventions
    public static void main(String[] args) {
        int valid = 0;    // Counter for valid integers
        int invalid = 0;  // Counter for invalid integers

        // Loop through all command-line arguments
        for (int i = 0; i < args.length; i++) {
            try {
                int x = Integer.parseInt(args[i]);  // Try to parse argument to an integer
                System.out.println("Integer: " + x);
                valid++;  // Increment valid count
            } catch (NumberFormatException e) {  // More specific exception for parsing
                invalid++;  // Increment invalid count
                System.out.println("Not an integer: " + args[i]);
            }
        }

        // Display the total counts of valid and invalid integers
        System.out.println("Total valid integers: " + valid);
        System.out.println("Total invalid integers: " + invalid);
    }
}

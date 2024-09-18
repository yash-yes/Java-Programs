import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        int i;  // Loop variable
        Scanner r = new Scanner(System.in);  // Create a Scanner object for input
        int[] a = new int[5];  // Declare an array of size 5

        // Taking input from the user
        System.out.println("Enter the elements in array:");
        for (i = 0; i < a.length; i++) {
            a[i] = r.nextInt();  // Store user input in the array
        }

        // Displaying the elements in original order
        System.out.println("Elements in array are:");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Displaying the elements in reverse order
        System.out.println("Reverse elements are:");
        for (i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        r.close();  // Close the Scanner to avoid resource leaks
    }
}

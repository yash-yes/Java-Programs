public class acendingarray{
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 7, 9, 2};  // Initialize the array with sample values
        
        // Bubble sort algorithm for ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {  // Compare and swap if needed
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Printing the sorted array
        System.out.println("Array in ascending order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");  // Print each element followed by a space
        }
    }
}

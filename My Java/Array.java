public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
         System.out.println("Array elements using for each loop");
         for(int x:arr)
            System.out.println(x);

            System.out.println("Array elements printing by using for loop  and reverse  are");
            for(int i=arr.length-1;i>=0;i--)
            System.out.println(   "arr " +i+ "  "  +arr[i]);

    }
}

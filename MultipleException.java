
import java.util.Scanner;
public class MultipleException {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner r =  new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)
        {
            try{
                System.err.println("Enter elements in array");
                arr[i] = Integer.parseInt(r.nextLine());

            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index Out Of Bound Exception" + e);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Number Format Exception " + e);
            }
        }
    
        System.out.println("Array elements are");
        for(int i=0 ; i<arr.length;i++)
        {
        System.out.println(arr[i]);
        }
    }
}

package exceptionpratice;

public class Multihandle {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int j=0;
        for(int i =0; i<args.length;i++)
        {
            try {
                arr[i] = Integer.parseInt(args[i]);
                
            } 
            catch (NumberFormatException  | ArrayIndexOutOfBoundsException e)
             {
                System.out.println("Exception Caught"  + e);
            }
        }
            System.out.println("Elements in Array are ");
            for(int i = 0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
    }
}

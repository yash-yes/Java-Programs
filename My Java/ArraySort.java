public class ArraySort {
    
private int []arr;
    ArraySort(int A[])
    {
        arr = new  int[A.length];
        arr = A;
    }

    void display()
    {
       
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        }
    }

    void Short()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                int temp;
                if(arr[j]< arr[i])
                {
                   temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}

class SortTest{
    public static void main(String[] args) {
    
        int A[] = {6,2,7,5,1,32};
        ArraySort ob1 = new ArraySort(A);
        System.out.println("Without Short");
        ob1.display();
        System.out.println("After Short");
        ob1.Short();
        ob1.display();


    }
}
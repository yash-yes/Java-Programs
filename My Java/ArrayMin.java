class ArrayMin {

    private int arr[];
    ArrayMin(int A[])
    {
        arr = new int[A.length];
        arr=A;

    }

    int minArray()
    {
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
           return min; 
    }
}

class Test{
    public static void main(String[] args) {
        int A[] = {42,5,8,2,9,6};
    ArrayMin ob1 = new ArrayMin(A);
    int min = ob1.minArray();
    System.out.println("Minimum array is "+ min);
    }
}
public class ArrayRev {
    private int []arr;

    ArrayRev(int A[]) {

        arr = new int[A.length];
        arr = A;
    }
    void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }  
    void reverse(){

        int temp;
        for(int i=0;i<arr.length/2;i++)
        {
            temp = arr[i];
            arr[i]= arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }
    }
}

class Test2{
    public static void main(String[] args) {

        int A[]= {4,6,8,9,3};
        ArrayRev ob1 = new ArrayRev(A);
        System.out.println("Elements in array are ");
        ob1.display();
        ob1.reverse();
        System.out.println("Reverse array is  ");
        ob1.display();
    }
}
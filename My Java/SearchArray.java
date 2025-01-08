class SearchArray{

    private int []arr;
    SearchArray(int A[])
{
    arr = new int[A.length];
    arr = A;
}
void mysearch(int item)
{
    boolean found = false;
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]==item)
        {
            found = true;
            System.out.println("Element found at " + (i+1)+ " position");
        }
     }
        if(found==false)
        System.out.println("Item not found");

        
}



}
class Search{
    public static void main(String[] args) {
        int A[] = {9,23,45,7,4};
        SearchArray ob1 = new SearchArray(A);
        int item = 7;
        ob1.mysearch(item);
    }
    
}
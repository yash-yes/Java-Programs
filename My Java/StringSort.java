public class StringSort {

    private String names[];
    StringSort(String arr[])
    {
        names = new String[arr.length];
        names = arr;
    }

    void display()
    {
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }

    void nameSort()
    {
        String  temp;
        for(int i=0;i<names.length-1;i++)
        {
            for(int j=i+1;j<names.length;j++)
            {
                if(names[j].compareTo(names[i])<0)
                {
                    temp = names[j];
                    names[j] = names[i];
                    names[i]= temp;

                }
            }
        }
    }
    
}

class StringTest{
    public static void main(String[] args) {
        String arr[] = {"Amay" , "Ujjwal", "Athrav","Ankita","Sheetal"};
        StringSort ob1 = new StringSort(arr);
        System.out.println("Names before sorting");
        ob1.display();
        System.out.println("Name after sorting ");
        ob1.nameSort();
        ob1.display();
    }
}

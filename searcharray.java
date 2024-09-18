import java.util.Scanner;
public class searcharray {
    public static void main (String[] args){
        int[] a = new int [5];
        int i,n , count=0;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter the elements in array");
        for(i=0;i<a.length;i++)
        {
            a[i] =r.nextInt();
        }
        System.out.println("Enter no.want to search");
        n = r.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
            if(count>0)
            System.out.println("No.is found");
            else
            System.out.println(" Not found");

        r.close();

    }
}

import java.util.Scanner;
public class largearray {
    public static void main(String[] args) {
        int[] a = new int[5];
        int max , i;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter elements in array");
        for(i=0;i<a.length;i++)
        {
            a[i]= r.nextInt();
        }
        max = a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("maximum elemnet "+ max);
        r.close();
    }
}

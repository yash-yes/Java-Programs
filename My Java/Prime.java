import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int n;
        n = s.nextInt();
        if (n>1)
        {
            int i=2;
            boolean flag = true;
             while(i<n && flag == true)
             {
                if(n%i==0)
                flag = false;
                i++;
             }
             if(flag == true)
             System.out.println("Prime Number");
             else
             System.out.println("Not Prime");
        }

        s.close();
    }
    
}

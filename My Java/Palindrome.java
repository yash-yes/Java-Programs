import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        int m =n;
        int rev =0;
        while (n>0)
        {
            int r=n%10;
            rev = rev *10+r;
            n=n/10;
        
        }
        if (m==rev)
            System.out.println("No . is Palindrome "+ rev);
        else
            System.out.println("No. is not Palindrome");

        sc.close();
        
        
    }

}
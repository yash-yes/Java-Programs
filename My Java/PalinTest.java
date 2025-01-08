public class PalinTest {
    public static void main(String[] args) {
        
         int i=1;
         int n = 121 ;
         int m;
         int rev = 0 , r;
           m = n;
         while(n>0)
         {
            r = n%10;
            rev = rev * 10+r;
            n = n/10;
         }
         System.out.println(rev);
         if (m == rev)
        System.out.println("Palindrome ");
        else 
        System.out.println("Not Palindrome");
    }
    
}

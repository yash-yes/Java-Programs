public class palin {
    public static void main(String[] args) {
        int n =11; 
        int m = n;
        
        int r,rev=0;
        while(n>0)
        {
            r = n%10;
            rev = rev *10 +r;
            n=n/10;
        }
        if(m==rev)
        System.out.println("NO.is palindrome");
        else 
        System.out.println("Not palindrome");
    }
    
}



public class reversenumber {
    public static void main(String[] args) {
        int rev = 0;
        int n= 4678;
        while(n>0)
        {
            int r = n%10;
            rev = rev * 10 +r;
            n=n/10;
        }
          
System.out.println ("Reverse no . is " + rev);


    }
}

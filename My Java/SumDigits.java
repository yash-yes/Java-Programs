public class SumDigits {
    public static void main(String[] args) {
        int n = 123456789;
        int sum = 0;
        int i=1 ,r;
        while(n>0)
        {
            r = n%10;
           sum = sum+r;
            n = n/10;
        }
        System.out.println(sum);
    }
    
}

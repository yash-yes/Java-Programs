public class prime {
    public static void main(String[] args) {
        int n,i,temp ;
        n = 10;
        for(i=0;i<=n;i++)
        {
            temp = 0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    temp = temp +1;
                }
            }
            if(temp>=1)
            System.out.println("NOt prime " + i);
            else
            System.out.println("prime number" + i);

        }
    }
}

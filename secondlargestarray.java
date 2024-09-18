public class secondlargestarray {
    public static void main(String[] args) {
        int [] a = {5,8,3,7,4,9};
        for(int i=0; i<a.length;i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i] <a[j])
                {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest is "+ a[1]);
    }
}

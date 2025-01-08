import java.util.Scanner;
public  class Factsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int i=1;
        int prod = 1;
        int sum = 0 ;
        while(i<=n)
        {
            prod = prod * i;
            sum = sum + prod;
            i++;
        }
        System.out.println("sum of first "+n+ " Factorial is "+sum);
        sc.close();
    }
}
import java .util.Scanner;
public class GreaterThree {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter the 3 no.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c  )
        System.out.println("A is greater");
        else if (b>a && b>c)
        System.out.println(" B is Greater");
        else 
        System.out.println("C is grester");
        sc.close();
         
    }
}

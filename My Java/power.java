import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no and power ");
        int x,y;
        int i=0, prod =1;
        x = s.nextInt();
        y = s.nextInt();
        while(i<=y)
        {
            prod = prod*x;
            System.out.println(prod );
            i++;
        }

    }
}

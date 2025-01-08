package exceptionpratice;
public class NumFormat{
    public static void main(String[] args) {
        
    

    int valid = 0;
    int invalid = 0;
         for(int i=0; i<args.length;i++)
    {
        try{
                int x = Integer.parseInt(args[i]);
                System.out.println("Integer is " + x);
                valid++;
        }

        catch(NumberFormatException e)
        {
            invalid++;
            System.out.println("Not a Integer " + args[i]);
        }
    }
    System.out.println("Total valid " + valid );
    System.out.println("Total invalid " + invalid);
}
}
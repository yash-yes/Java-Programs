package pack1;

public class Area {
    protected  int l,b;
    
  public Area()
{

}

   public Area(int l1 , int b1)
    {
        l = l1;
        b = b1;
        System.out.println("From Pack 1 area Con");
    }

  public   int arefun()
    {
        return (l*b);
    }
}

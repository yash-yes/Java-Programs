
//USING STATIC METHOD  

interface Iface7{
    void display1();
   static int add(int a ,int b)
   {
   return (a+b);
   }
}
class MyTest2 implements Iface7
{
     public void display1()
    {
        System.out.println("Test Display 1  method");
    }
    int add(int a,int b)
    {
        return (a*b);
    }
}

public class Ifacetest6 {
    public static void main(String[] args) {
        MyTest2 t2 = new MyTest2();
        t2.display1();
       int m = t2.add(7, 8);
        System.out.println("Multiply is "+m );
        int s = Iface7.add(6, 4);
        System.out.println("Addition is "+ s );
    }
    
}

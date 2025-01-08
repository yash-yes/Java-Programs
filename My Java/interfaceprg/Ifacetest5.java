// USING DEFAULT METHOD

interface Iface5{
    void display1();
   default  int add(int a ,int b)
   {
   return (a+b);
   }
}

interface Iface6{
    void display2();
   default  int add(int a ,int b)
   {
   return (a*b);
   }
}

class MyTest1 implements Iface5,Iface6
{
     public void display1()
    {
        System.out.println("Test Display 1  method");
    }
    public void display2()
    {
        System.out.println("Test Display 2  method");
    }
    public int add(int a,int b)
    {
        int s = Iface6.super.add(a, b);
        return s;
    }
}

public class Ifacetest5 {
    public static void main(String[] args) {
        
        MyTest1 t1 = new MyTest1();
        t1.display1();
        t1.display2();
       int s =  t1.add(4, 6);
        System.out.println("Multipication is " +s);
    }
}

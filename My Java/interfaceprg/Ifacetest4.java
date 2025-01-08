 //package  interfaceprg;
interface Iface4{
    void display();
   default  int add(int a ,int b)
   {
   return (a+b);
   }
}

class MyTest implements Iface4
{
     public void display()
    {
        System.out.println("Test Display method");
    }

}


public class Ifacetest4{
    public static void main(String[] args) {
        
      Iface4 ref = new MyTest();
       ref.display();
       int s = ref.add(74, 74);
 
        System.out.println("Addition is "+s );
        

    }
}

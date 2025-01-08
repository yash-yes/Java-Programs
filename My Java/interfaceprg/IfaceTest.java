interface Iface
{
    public  void display();
}
class  Test implements Iface{

    public void display()
    {
        System.out.println("Interface Method");
    }
}

class  Test2 implements Iface{

    public void display()
    {
        System.out.println("Interface Method  from test 2");
    }
}


public class IfaceTest{
    public static void main(String[] args) {
        
      //  Test t1 = new Test();
        //t1.display();
        Iface ref = new Test();
        ref.display();

        Iface ref1 = new Test2();
        ref1.display();
    }
}
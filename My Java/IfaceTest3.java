class Test{
    void display()
    {
        System.out.println("Test Display method of class ");
    }
}
interface  Face
{
    void display1();
}
class  Test1 extends Test implements Face{

     public void display1()
     {
        System.out.println("Display 1 method");
     }
}

public class IfaceTest3 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.display();
        t1.display1();
    }
    
}

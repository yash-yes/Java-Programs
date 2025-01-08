interface Iface1{

     void display1();

}
 interface  Iface2{

         void display2();
 }

 interface Iface3 extends Iface1,Iface2{
        void display3();
 }

 class Itest implements Iface3{

    public void display1()
    {
        System.out.println("Method of interface 1");
    }

   public  void display2()
    {
        System.out.println("Method of Interface 2");
    }

    public  void display3()
    {
        System.out.println("Method of Interface 3");
    }
 }
public class IfaceTest2 {
    public static void main(String[] args) { 
        Itest ob1 = new Itest();
        ob1.display1();
        ob1.display2();
        ob1.display3();
    }
}

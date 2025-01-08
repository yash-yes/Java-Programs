class Areas{
    int l,b;
    Areas(int l1,int b1)
    {
        l =l1;
        b = b1;
        System.out.println("Area Constructor");
    }

    int areaFun()
    {
        return (l*b);
    }
}
class Volumes extends Areas{

    int h;

     Volumes(int l1,int b1, int h1)
      {
        super(l1,b1);
        h = h1;
        System.out.println("Volume constructor");
    }
    int volFun()
    {
        return (l*b*h);
    }
    

}

public class Mysuper{
    public static void main(String[] args) {

        Volumes ob1 = new Volumes (4,7,6);
        int v = ob1.volFun();
        System.out.println("Volume is "+ v);
        int ar = ob1.areaFun();
        System.out.println("Area is " + ar);


        Areas ob2 = new Areas(6,12);
        ar = ob2.areaFun();
        System.out.println("Area is "  + ar);

        
    }
}

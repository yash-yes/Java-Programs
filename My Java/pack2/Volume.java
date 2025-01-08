package pack2;

import pack1.Area;


   public  class Volume extends Area {

     protected int h;
     public Volume()
     {

     }
   public  Volume( int h1, int l1, int b1)
    {
        super(l1,b1);
        h = h1;
        System.out.println("From pack 2 volume con");
    }

     public int volFun()
    {
        return (l*b*h);
    }
} 
    


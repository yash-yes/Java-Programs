import  pack1.Area;

import  pack2.*;

 class SimpleInheritance {
    public static void main(String[] args) {
        
        Volume ob1 = new Volume(4,6,9);
       
        int v=ob1.volFun(); 
        System.out.println("Volume is " + v);
        int ar = ob1.arefun();
        System.out.println("Area is " + ar);


        
    }
}
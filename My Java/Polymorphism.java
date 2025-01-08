abstract class  Shape{
    double l,b;
    Shape (double l1,double b1)
    {
        l=l1;
        b=b1;
    }

    abstract  double area();
}
class Rectangle extends  Shape{

    Rectangle(double l1,double b1)
    {
        super(l1,b1);
        System.out.println("Rectangle Constructor");
    }
    double area()
    {
        return(l*b);
    }
}
class Triangle extends Shape{

    Triangle(double l1,double b1)
    {
        super(l1,b1);
        System.out.println("Triangle Constructor");
    }

    double area()
    {
        return (0.5*l*b);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Shape ref;
        Rectangle r1 = new Rectangle(6,7);
        ref = r1;
        double ar = ref.area();
        System.out.println("Area of Triangle " + ar);

        Triangle t1 = new Triangle(4,8);
        ref = t1;
        ar = ref.area();
        System.out.println("Area of Rectangle "+ ar);
    }
}

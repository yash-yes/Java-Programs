class DetailStudents{

    int rollNo;
    String name;
    int p, c, m, h, e;

    public DetailStudents(int rno, String  nm , int p1, int c1, int m1, int h1, int e1)
    {
        rollNo = rno;
        name = nm;
        p = p1;
        c = c1;
        m = m1;
        h = h1;
        e = e1;
    }
    void display()
    {
        System.out.print("rollNo is " + rollNo);
        System.out.print(" Name  is  " + name);
        System.out.print(" Physics " + p);
        System.out.print(" Chemistry  " +  c);
        System.out.print( " Maths  " + m);
        System.out.print(" Hindi  " + h);
        System.out.println(" English  " + e);
    }

    int totalMarks()
    {
        int total = p+c+m+h+e;
        return total;
    }
    double percentage()
    {
        int tot = totalMarks();
        double per = tot/5.0;
        return  per;

    }
    void division()
    {
        double per = percentage();
        if(per>=60)
        System.out.println("first division");

        else{

            if(per>=45)
            System.out.println("Second division");

            else {

                if(per>=33)
                System.out.println("Third division");

                else
                System.out.println("Fail");
            }
        }
    }
}
 public class Marks{
    public static void main(String[] args) {
        DetailStudents d1 = new DetailStudents(1001, "Ratan",85,77,56,87,79);
        d1.display();
       int tot = d1.totalMarks();
       System.out.println("Total is " + tot);
       double per =  d1.percentage();
       System.out.println("Per cent is "+ per);
        d1.division();
    }
}
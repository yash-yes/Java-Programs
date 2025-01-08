public class ToString {
    int rollNo;
    String name;
    ToString(int rno, String nm)
    {
        rollNo = rno;
        name = nm;
    }
    @Override
    public String toString()
    {
        String str = "RollNo = " + rollNo + "  and  Name = "+ name;
        return str;
    }
}
class ToStringTest{
    public static void main(String[] args) {
        
        ToString ob1 = new ToString(101, "Avani");
        System.out.println(ob1);
    }
}

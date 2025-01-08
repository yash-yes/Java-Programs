import pack1.*;
public class TestPackage {
    public static void main(String[] args) {
        First obj = new First();
        int s = obj.add(22,47);
        System.out.println("Add is " + s);

        Second obj2 = new Second();
        s = obj2.multi(49, 40);
        System.out.println("Multi is " + s);

    }
}

class ChildThreadOne extends Thread {

public void run()
{
    System.out.println("ChildThreadOne Started");
    for(int i =1;i<=10;i++)
    {
        System.out.println("ChildThreadOne " + i);
        System.out.println("ChildThreadOne Ended");
    }
}
}
class ChildThreadTwo extends Thread{

public void run()
{
    System.out.println("ChildThreadTwo Started");
    for(int i =1;i<=10;i++)
    {
        System.out.println("ChildThreadTwo " + i);
        System.out.println("ChildThreadTwo Ended");
    }
}
}


public class Multithreading {
    public static void main(String[] args) {
    
        System.out.println("Main Thread Started");
        ChildThreadOne t1 = new ChildThreadOne();
        ChildThreadTwo t2 = new ChildThreadTwo();
        t1.start();
        t2.start();
        System.out.println("Main Thread Ended");

    }
}

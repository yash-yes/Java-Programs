class ChildThreadOne implements Runnable
{
    public void run()
    {
        System.out.println("ChildThreadOne Started");
        try{
            for(int i =1;i<=5;i++)
            {
                System.out.println("ChildThreadOne" +i);
                Thread.sleep(1000);
            }
        }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            
            System.out.println("ChildThreadOne Ended");

        
    }
}
class ChildThreadTwo implements Runnable
{
    public void run()
    {
        System.out.println("ChildThreadTwo Started");
        try{
            for(int i =1;i<=5;i++)
            {
                System.out.println("ChildThreadTwo" +i);
                Thread.sleep(1000);
            }
        }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            
            System.out.println("ChildThreadTwo Ended");

        
    }
}
public class MultithreadiRun {
    public static void main(String[] args) {
        System.out.println("Main is started ");
        ChildThreadOne ob1 = new ChildThreadOne();
        ChildThreadTwo ob2 = new ChildThreadTwo();

       Thread t1 = new Thread(ob1);
       Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();

    }
    
}

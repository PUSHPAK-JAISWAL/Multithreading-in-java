// this is a to use and know the use of the intrupt() method in java

class Example implements Runnable
{
    public void run()
    {
        for(int i = 0;i<3;i++)
        {
            try
            {
                System.out.println("Focus is Important");
                Thread.sleep(2000);
            }
            catch(InterruptedException e1)
            {
                System.out.println("Thread is interrupted.");
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong.");
            }
        }
    }
}

public class mt11
{
    public static void main(String args[])
    {
        Example ex = new Example();

        Thread t1 = new Thread(ex);

        t1.start();
        t1.interrupt();

    }
}
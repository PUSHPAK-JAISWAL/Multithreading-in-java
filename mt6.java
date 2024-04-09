// this is a program to show the states of thread 

class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread Executing.");
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        System.out.println("Child Thread task completed.");
    }
}

public class mt6
{
    public static void main(String args[])
    {
        System.out.println("Main Thread");

        Demo d = new Demo();

        Thread t1= new Thread(d);
        t1.start();
    }
}
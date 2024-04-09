// this is a class for creation of own thread 

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child Thread.");

    }
}

public class mt2
{
    public static void main(String args[])
    {
        System.out.println("Main Thread.");
        MyThread t = new MyThread();
        t.start();
    }
}
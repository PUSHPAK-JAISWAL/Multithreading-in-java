// this is a program to check use of join and is alive method in java

class printing implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=0;i<2;i++)
            {
                System.out.println("Focus is important");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some thing went wrong.");
        }
    }
}

public class mt7
{
    public static void main(String args[])
    {
        try
        {
        System.out.println("Main Thread Started.");

        printing p = new printing();

        Thread t1= new Thread(p);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println("Main Thread has Ended.");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
    }
}
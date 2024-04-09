// this is the use of the Synchoronization in java


class Car implements Runnable
{
    synchronized public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " Has Entered The Parking lot.");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Got Into Car to drive.");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Started to drive the car.");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Came back and drive the car.");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("Some Problem.");
        }
    }
}

public class mt8
{
    public static void main(String args[])
    {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
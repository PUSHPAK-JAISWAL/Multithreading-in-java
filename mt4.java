// this is a class to create thread using implementing the runnable interface
import java.util.*;

class Calc implements Runnable
{
    public void run()
    {
        System.out.println("Calculations Task Started.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number.");
        int num1 = sc.nextInt();
        System.out.println("Please Enter Second Number.");
        int num2 = sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculations task ended.");

        System.out.println("......................................");
    }
}

class Message implements Runnable
{
    public void run()
    {
        System.out.println("Displaying important message task.");
        try{
        for(int i = 0;i<3;i++)
        {
            System.out.println("Focus is important to master skills.");
            Thread.sleep(2000);
        }
        System.out.println("Displaying inportant message task ended. ");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
    }
}

public class mt4
{
    public static void main(String args[])
    {
        System.out.println("Main Thread Started.");

        Calc c1 = new Calc();

        Message m1 = new Message();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);

        t1.start();
        t2.start();
    }
}
// this is a class to make a complete task within single run()
import java.util.*;

class MyThread1 extends Thread 
{
    public void run()
    {
       String name=Thread.currentThread().getName();
       if(name.equals("Calc"))
       {
            calc();
       }
       else 
       {
            importantMessage();
       }
    }
    public void calc()
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
    public void importantMessage()
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


public class mt5
{
    public static void main(String args[])
    {
        System.out.println("Main Thread Started.");

        MyThread1 mt1 = new MyThread1();
        MyThread1 mt2 = new MyThread1();

        mt1.setName("Calc");
        mt2.setName("Print");

        mt1.start();
        mt2.start();
    }
}
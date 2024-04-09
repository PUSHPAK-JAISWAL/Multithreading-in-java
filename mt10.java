// this is a program to check deadlock

class Library implements Runnable
{
    String res1 = new String("Java");
    String res2 = new String("Sql");
    String res3 = new String("DSA");

    public void run()
    {

        String name = Thread.currentThread().getName();

        if(name.equals("Student1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("Student 1 has acc "+res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("Student 1 had acc "+res2);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("Student 1 has acc "+res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("Some problem.");
            }
        }
        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("Student 2 has acc "+res3);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("Student 2 had acc "+res2);
                        Thread.sleep(3000);
                        synchronized(res1)
                        {
                            System.out.println("Student 2 has acc "+res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("Some problem.");
            }
        }

    }
}

public class mt10
{
    public static void main(String args[])
    {

        Library lib = new Library();

        Thread Student1 = new Thread(lib);
        Thread Student2 = new Thread(lib);

        Student1.setName("Student1");
        Student2.setName("Student2");

        Student1.start();
        Student2.start();

    }
}
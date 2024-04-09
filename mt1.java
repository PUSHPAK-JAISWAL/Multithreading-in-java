// this is class to show how to see the current treads in java

public class mt1
{
    public static void main(String args[])
    {
        System.out.println("Main Thread");

        System.out.println("Before Changing");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("After Changing");

        Thread t = Thread.currentThread();
        t.setName("PUSHPAK");
        t.setPriority(1);
        
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
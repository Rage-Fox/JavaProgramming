class Thread1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Good Morning!");
            try
            {
                //interrupted exceptions are a chance to generate errored thread executions.
                Thread.sleep(1000);//1000 milliseconds = 1 second
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread is interrupted");
            }
        }
    }
}
class Thread2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Hello");
            try
            {
                //interrupted exceptions are a chance to generate errored thread executions.
                Thread.sleep(2000);//2000 milliseconds = 2 second
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread is interrupted");
            }
        }
    }
}
class Thread3 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome!");
            try
            {
                //interrupted exceptions are a chance to generate errored thread executions.
                Thread.sleep(3000);//3000 milliseconds = 3 second
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread is interrupted");
            }
        }
    }
}
public class RunnableInterfaceThreadsCreation {
    public static void main(String args[])
    {
        //total 4 threads--> main thread, t1, t2, t3
        //here we need to create the objects directly for the Thread class itself
        /*
        DON'T DO IT LIKE THIS!!!!
        =========================
            MyThread1 t1=new MyThread1();
            MyThread2 t2=new MyThread2();
            MyThread3 t3=new MyThread3();
        */
        //main change is in creation of the objects through runnable interface
        //as it is an interface we need to use the keyword implements
        //Thread class is a child of Runnable Interface. Even Thread class is created from Runnable Interface.
        //It is more preferrable to choose runnable interface as it requires less memory and also allows a class to inherit any other class.
        //Using runnable interface, multiple threads share the same objects.
        //Also, using Thread class cannot implement Multiple Inheritance. So prefer to use Runnable Interface.
        Thread t1=new Thread(new Thread1());
        Thread t2=new Thread(new Thread2());
        Thread t3=new Thread(new Thread3());
        //all threads are having equal priorities. Hence we cannot decide which thread calls first.
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}
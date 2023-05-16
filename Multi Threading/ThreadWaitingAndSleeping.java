class MyThread1 extends Thread
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
class MyThread2 extends Thread
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
class MyThread3 extends Thread
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
public class ThreadWaitingAndSleeping {
    public static void main(String args[])
    {
        //total 4 threads--> main thread, t1, t2, t3
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();
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
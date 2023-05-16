/*
    Definition:
    Executing several tasks simultaneously where each individual task is a sub part of a same process is called Multi-Threading and each individual sub-task is called as Thread.
    Thread Life Cycle:
        New, Ready, Running, Blocked, Terminated
    Advantages:
        -> Improves the efficiency
        -> Sharing of memory
        -> Reduces the runtime
        -> Improves faster response
        -> Used in complex applications
    How to create threads:
        -> By using Thread Class:
            class MySampleThread extends Thread
            {
                public void run()
                {
                    //task need to be assigned here
                    //task of the child thread
                }
            }
            class Mainclass
            {
                public static void main(String args[])//Main Thread
                {
                    MySampleThread t1=new MySampleThread();//t1 is in new state
                    //total two threads are there in the thread selector queue which is main thread and t1 thread.
                    t1.start();//t1 enters ready state
                    //you can write the task of main thread
                }
            }
        -> By implementing Runnable Interface Concept
    Thread priorities:
    List the different methods of Thread Class:
        -> start()
        -> run()
        -> sleep()
        -> setName()
        -> getName()
        -> setPriority()
        -> getPriority()
        -> join()
        -> yield()
        -> currentThread()
        -> isAlive()
        -> setDaemon()
        -> isDaemon()
        -> etc....
    Thread Synchronization:
            If two or more threads are trying to access a common same resource, then those threads have to be in agreement and synchronize with each other, whether which thread have to wait and which thread has to execute is called as Thread Synchronization.
            Both threads trying to access one same resource is known as a Critical Section Problem.
            This problem can be solved by Thread Synchronization Technique.
            We can implement this technique using a method called synchronized(). So that the compiler will think of that resource as a locked resource. Until unless a thread is finished with that resource, other threads cannot access it.
    Inter Thread Communication [Producer and Consumer Problem]:
        One thread communicates with the other. In producer consumer problem, unless the producer produces a thing, the consumer won't consume it!
        We also have to use the keyword synchronized to make sure that the communication happens among several threads.
*/
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Kohli");
        }
    }
}
public class MultiThreadingInJava {
    public static void main(String args[])
    {
        MyThread t1=new MyThread();
        t1.start();
        //task of main thread
        for(int i=0;i<5;i++)
        {
            System.out.println("Dhoni");
        }
        //We will not know which will execute first so both will execute simultaneously and will produce different outputs everytime we execute.
    }
}
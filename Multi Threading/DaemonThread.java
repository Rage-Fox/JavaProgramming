public class DaemonThread extends Thread {
    //A thread that will be running in the background continuously until the program gets terminated is called as Daemon Thread.
    //Once, the execution completes, the thread goes back to dead state.
    public void run()
    {
        if(Thread.currentThread().isDaemon())//current thread means the thread through which start() function is called.
        {
            System.out.println("Daemon thread executing");
        }
        else
        {
            System.out.println("User(normal) thread executing");
        }
    }
    public static void main(String args[])
    {
        DaemonThread t1=new DaemonThread();
        DaemonThread t2=new DaemonThread();
        System.out.println(t1.isAlive());
        System.out.println(t1.isDaemon());
        t1.setDaemon(true);//thread t1 is set as a Daemon Thread.
        System.out.println(t1.isAlive());
        System.out.println(t1.isDaemon());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t1.isDaemon());
        System.out.println(t1.isAlive());
    }
}

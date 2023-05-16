class TicketCounter
{
    private int availableSeats=3;
    public synchronized void bookTicket(String name,int num_seats)//locked resource as synchronized keyword is used here
    {
        if(availableSeats>=num_seats&&num_seats>0)
        {
            System.out.println("Hi, "+name+" : "+num_seats+" seats booked successfully for you!");
            availableSeats-=num_seats;
        }
        else
        {
            System.out.println("We're so sorry "+name+", required seats are not available for you");
        }
    }
}
class TicketBookingThread extends Thread
{
    TicketCounter tc;
    String pname;
    int num_seats;
    public TicketBookingThread(TicketCounter tc,String pname,int num_seats)
    {
        this.tc=tc;
        this.pname=pname;
        this.num_seats=num_seats;
    }
    public void run()
    {
        tc.bookTicket(pname,num_seats);
    }
}
public class ThreadSynchronization {
    public static void main(String args[])//main thread
    {
        TicketCounter tc=new TicketCounter();//this is a common resource
        TicketBookingThread t1=new TicketBookingThread(tc,"Siva",2);
        TicketBookingThread t2=new TicketBookingThread(tc,"Ramesh",2);
        TicketBookingThread t3=new TicketBookingThread(tc,"Bhavani",1);
        t1.start();
        t2.start();
        t3.start();
    }
}

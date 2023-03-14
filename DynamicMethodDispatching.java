abstract class Vehicle
{
    public abstract int get_no_of_wheels();
    public abstract int seating_capacity();
}
class Bike extends Vehicle
{
    public int get_no_of_wheels()
    {
        return 2;
    }
    public int seating_capacity()
    {
        return 2;
    }
}
class Auto extends Vehicle
{
    public int get_no_of_wheels()
    {
        return 3;
    }
    public int seating_capacity()
    {
        return 4;
    }
}
class Car extends Vehicle
{
    public int get_no_of_wheels()
    {
        return 4;
    }
    public int seating_capacity()
    {
        return 5;
    }
}
public class DynamicMethodDispatching {
    /*
    DMD is the process in which single parent class object is overloaded with different child class instances at different times
    and execute the methods based on which child class instance currently stored in the object.
    */
    public static void main(String args[])
    {
        Vehicle v;
        int w,c;
        v=new Bike();
        System.out.println("========================");
        System.out.println("Bike");
        w=v.get_no_of_wheels();
        c=v.seating_capacity();
        System.out.println("No. of wheels: "+w);
        System.out.println("Seating capacity: "+c);
        System.out.println("========================");
        v=new Auto();
        System.out.println("========================");
        System.out.println("Auto");
        w=v.get_no_of_wheels();
        c=v.seating_capacity();
        System.out.println("No. of wheels: "+w);
        System.out.println("Seating capacity: "+c);
        System.out.println("========================");
        v=new Car();
        System.out.println("========================");
        System.out.println("Car");
        w=v.get_no_of_wheels();
        c=v.seating_capacity();
        System.out.println("No. of wheels: "+w);
        System.out.println("Seating capacity: "+c);
        System.out.println("========================");
    }
}
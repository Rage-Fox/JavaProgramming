interface VehicleDemo
{
    void changeGear(int g);
    void increaseSpeed(int s);
    void applyBrakes(int b);
}
class BikeDemo implements VehicleDemo
{
    int gear=2,spd=20;
    public void changeGear(int g)
    {
        gear=g;
    }
    public void increaseSpeed(int s)
    {
        spd+=s;
    }
    public void applyBrakes(int b)
    {
        spd-=b;
    }
    public void showVehicleStatus()
    {
        System.out.println("Bike is currently at speed "+spd+" and on gear "+gear);
    }
}
class CarDemo implements VehicleDemo
{
    int gear=3,spd=40;
    public void changeGear(int g)
    {
        gear=g;
    }
    public void increaseSpeed(int s)
    {
        spd+=s;
    }
    public void applyBrakes(int b)
    {
        spd-=b;
    }
    public void showVehicleStatus()
    {
        System.out.println("Car is currently at speed "+spd+" and on gear "+gear);
    }

}
public class VehiclesThroughInterfaces {
    public static void main(String args[])
    {
        BikeDemo b=new BikeDemo();
        b.changeGear(3);
        b.increaseSpeed(35);
        b.showVehicleStatus();
        b.applyBrakes(10);
        b.showVehicleStatus();
        CarDemo c=new CarDemo();
        c.changeGear(4);
        c.increaseSpeed(55);
        c.showVehicleStatus();
        c.applyBrakes(15);
        c.showVehicleStatus();
    }
}
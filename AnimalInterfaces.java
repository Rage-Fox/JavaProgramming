interface AnimalDemo
{
    void eat();//public abstract void eat();
    void sound();
    void running();
}
class DogDemo implements AnimalDemo
{
    public void eat()
    {
        System.out.println("Veg + Non-veg");
    }
    public void sound()
    {
        System.out.println("Bow bow");
    }
    public void running()
    {
        System.out.println("Running faster");
    }
}
class TigerDemo implements AnimalDemo
{
    public void eat()
    {
        System.out.println("Only non-veg");
    }
    public void sound()
    {
        System.out.println("Roaring");
    }
    public void running()
    {
        System.out.println("Running super fast");
    }
}
public class AnimalInterfaces
{
    public static void main(String args[])
    {
        AnimalDemo a;
        a=new DogDemo();
        a.eat();
        a.sound();
        a.running();
        a=new TigerDemo();
        a.eat();
        a.sound();
        a.running();
    }
}
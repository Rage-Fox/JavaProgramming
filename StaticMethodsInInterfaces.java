interface I1D
{
    void m1();
    void m2();
    static void m3()
    {
        System.out.println("Static method");
    }
}
class serviceProvider implements I1D
{
    public void m1()
    {
        System.out.println("m1 method");
    }
    public void m2()
    {
        System.out.println("m2 method");
    }
    //all the service providers can directly call the default method from the interfaces without giving the definition in this class.
    //if the method has no definition in this class but was called through main class, then the default method will get executed which is provided in the interface.
}
public class StaticMethodsInInterfaces {
    public static void main(String args[])
    {
        I1D i=new serviceProvider();
        i.m1();
        i.m2();
        I1D.m3();//static methods has to be accessed by only the interface name
        //hence by accessing the static methods through interface name, the ambiguity error will be gone.
    }
}

interface I1Demo
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("Default method");
    }
}
class serviceProvider1 implements I1Demo
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
class serviceProvider2 implements I1Demo
{
    public void m1()
    {
        System.out.println("m1 method");
    }
    public void m2()
    {
        System.out.println("m2 method");
    }
    public void m3()
    {
        System.out.println("My own definition");
    }
}
public class DefaultMethodsInInterfaces
{
    public static void main(String args[])
    {
        I1Demo i1=new serviceProvider1();
        i1.m1();
        i1.m2();
        i1.m3();
        I1Demo i2=new serviceProvider2();
        i2.m1();
        i2.m2();
        i2.m3();
    }
}
interface I1
{
    void m1();
    void m2();
}
interface I2
{
    void m2();
    void m3();
}
class SampleDemo implements I1,I2
{
    public void m1()
    {
        System.out.println("M1 method");
    }
    public void m2()
    {
        System.out.println("M2 method");
    }
    public void m3()
    {
        System.out.println("M3 method");
    }
}
public class InterfaceDemo {
    public static void main(String args[])
    {
        I1 i1=new SampleDemo();
        i1.m1();
        i1.m2();
        //i1.m3();--> NOT VALID as m3() is not mentioned in interface I1
        I2 i2=new SampleDemo();
        //i2.m1();--> NOT VALID as m1() is not mentioned in interface I2
        i2.m2();
        i2.m3();
    }
}

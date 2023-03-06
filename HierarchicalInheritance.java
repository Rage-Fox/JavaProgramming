class ParentH
{
    int x=10;
    public void displayX()
    {
        System.out.println(x);
    }
}
class Child1H extends ParentH
{
    int y=20;
    public void displayY()
    {
        System.out.println(y);
    }
}
class Child2H extends ParentH
{
    int z=30;
    public void displayZ()
    {
        System.out.println(z);
    }
}
public class HierarchicalInheritance {
    public static void main(String args[])
    {
        ParentH p=new ParentH();
        p.displayX();//cannot access displayY() and displayZ() present in child classes
        Child1H c1=new Child1H();
        c1.displayY();
        c1.displayX();//can access displayX() present in parent class
        Child2H c2=new Child2H();
        c2.displayZ();
        c2.displayX();//can access displayX() present in parent class
    }
}

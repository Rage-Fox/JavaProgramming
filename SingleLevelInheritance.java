class Parent
{
    int x=10;
    public void displayX()
    {
        System.out.println(x);
    }
}
class Child extends Parent
{
    int y=20;
    public void displayY()
    {
        System.out.println(y);
    }
}
public class SingleLevelInheritance {
    public static void main(String args[])
    {
        Parent p=new Parent();
        p.displayX();//cannot access displayY() present in child class
        Child c=new Child();
        c.displayY();
        c.displayX();//can access displayX() present in parent class
    }
}

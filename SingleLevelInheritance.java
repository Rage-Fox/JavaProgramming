class ParentS
{
    int x=10;
    public void displayX()
    {
        System.out.println(x);
    }
}
class ChildS extends ParentS
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
        ParentS p=new ParentS();
        p.displayX();//cannot access displayY() present in child class
        ChildS c=new ChildS();
        c.displayY();
        c.displayX();//can access displayX() present in parent class
    }
}

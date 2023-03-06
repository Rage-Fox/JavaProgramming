class ParentM
{
    int x=10;
    public void displayX()
    {
        System.out.println(x);
    }
}
class ChildM extends ParentM
{
    int y=20;
    public void displayY()
    {
        System.out.println(y);
    }
}
class SubchildM extends ChildM
{
    int z=30;
    public void displayZ()
    {
        System.out.println(z);
    }
}
public class MultiLevelInheritance {
    public static void main(String args[])
    {
        ParentM p=new ParentM();
        p.displayX();//cannot access displayY() present in child class
        ChildM c=new ChildM();
        c.displayY();
        c.displayX();//can access displayX() present in parent class
        SubchildM s=new SubchildM();
        s.displayZ();
        s.displayY();//can access displayY() present in child class
        s.displayX();//can access displayX() present in parent class
    }
}

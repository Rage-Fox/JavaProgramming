class SA
{
    int x=10;
    public void show()
    {
        System.out.println("A: "+x);
    }
}
class SB extends SA
{
    int x=20;
    public void display()
    {
        System.out.println("B: "+x);//refers x value from same class.
        System.out.println("A: "+super.x);//refers x value from the parent SA class.
    }
}
public class SuperKeyword {
    /*
    Super is a keyword which is used to access the immediate parent class members by using child methods,
    if both parent and child have the same name.
    Super is a keyword which is applicable for both variables and methods.
    super.variablename; --> It refers the immediate parent class member.
    super.methodname; --> It refers the immediate parent class method.
    */
    public static void main(String args[])
    {
        SB b=new SB();
        b.display();
    }
}

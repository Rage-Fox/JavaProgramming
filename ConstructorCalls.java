class CA
{
    public CA()//Default Constructor
    {
        //call to this() must be the first statement in the constructor.
        this("THUB");//it calls the parameterized constructor from same class.
        System.out.println("Welcome to Guest");
    }
    public CA(String name)//Parameterized Constructor
    {
        System.out.println("Welcome to "+name);
    }
}
class CB
{
    public CB()
    {
        System.out.println("Parent's Constructor");
    }
}
class CC extends CB
{
    public CC()
    {
        System.out.println("Child's Constructor");
    }
}
class TopParent
{
    public TopParent()
    {
        System.out.println("Hello....");//this will be called first as super() will be called automatically by the compiler.
    }
}
class CD extends TopParent
{
    int x;
    public CD(int x)
    {
        this.x=x;
    }
    public void displayX()
    {
        System.out.println("x = "+x);
    }
}
class CE extends CD
{
    int y;
    public CE(int x,int y)
    {
        super(x);//control checks for parent class constructor with one argument.
        this.y=y;
    }
    public void displayY()
    {
        System.out.println("y = "+y);
    }
}
class CF extends CE
{
    int z;
    public CF(int x,int y,int z)
    {
        super(x,y);//control checks for parent class constructor with two arguments.
        this.z=z;
    }
    public void displayZ()
    {
        System.out.println("z = "+z);
    }
}
public class ConstructorCalls {
    /*
    super() and this() are called as constructor calls.
    super()--> will refer the parent class constructor.
    this()--> will refer the same class constructor.
    */
    public static void main(String args[])
    {
        CA a=new CA();
        CC c=new CC();//it will call both parent's and child's class
        //even though super() isn't written, the compiler will automatically execute super() keyword.
        //NOTE: Without parent's object, child will not create it.
        CF f=new CF(10, 20, 30);
        f.displayX();
        f.displayY();
        f.displayZ();
    }
}

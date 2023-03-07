class ParentMO
{
    public void display()
    {
        System.out.println("Welcome to TSE 2025 Class");
    }
}
class ChildMO extends ParentMO
{
    public void display()
    {
        System.out.println("Hi! Good to see you here");
    }
}
public class MethodOverriding {
    //In the Inheritance, both parent and child having same method signature is called Method Overriding.
    //Same method signature means same method sames along with same arguments and same return type.
    //In this child class overrides the definition of parent.
    //And by using child class object, if we call the method, it will always execute child definition only.
    //It hides the implementation of parent and execute it's own behaviour.
    public static void main(String args[])
    {
        ParentMO p=new ParentMO();
        p.display();
        ChildMO c=new ChildMO();
        c.display();//If display() is not available in child, then it will look it for in parent class.
    }
}

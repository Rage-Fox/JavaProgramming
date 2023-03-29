interface Interface1
{
    void m1();
    void m2();
}
abstract class Developer1 implements Interface1
{
    public void m1()
    {
        System.out.println("Hello!");
    }
    //as we didn't create m2() here, it'll consider this class as abstract class. Hence, we have to make this class as asbtract class.
}
class Developer2 extends Developer1
{
    public void m2()
    {
        System.out.println("Good Morning folks..");
    }
}
public class InterfacesInJava {
    /*
    It is used mainly for fully abstraction.
    Interfaces will tell you what to do but not how to do.
    There are 3 main reasons to use interfaces:
    * It is used to achieve abstraction.
    * By interface, we can support the functionality of multiple inheritance.
    * It can be used to achieve loose coupling.
    Some points of interface:
    --> If you want to implement interfaces in java, we have to use the keyword "interface".
    --> The class which implements interface needs to give the definition for all the methods which are declared inside interface.
    --> If the implemented class doesn't give the definition for abstract method, make that class as abstract class.
    --> Interface contains only the following(can allow only the creation of below):
        --> Constants
        --> Abstract methods
    --> The constants declared inside the interface by default are public, static and final.
    --> The methods declared inside the interface by default is called public abstract.
    */
    /*
    Creation of an interface:
    Syntax: interface <interfacename>
            {
                contants;
                methods declaration;
            }
    Implementation of an interface:
    --> We have to use implements keyword for implmenting a class from an interface.
    --> We have to implement and give definition for all the abstract methods in the interface class from the child class.
    Syntax: class Developer implements interfacename
            {
                //we can also define it's own methods
                public void m1()
                {
                }
                public void m2()
                {
                }
            }
    */
    public static void main(String args[])
    {
        Developer2 d=new Developer2();
        d.m1();
        d.m2();
    }
}
package pack1;
public class PrivateDemo {
    void show()
    {
        System.out.println("Hello World!");
    }
}
class Sample
{
    public static void main(String args[])
    {
        PrivateDemo p=new PrivateDemo();
        p.show();
        //if show is either default or public, we can call it here
        //but if it is private, then the scope is only accessible to PrivateDemo class only. So we cannot call it in Sample class.
    }
}
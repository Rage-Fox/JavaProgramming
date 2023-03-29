interface Factorial
{
    int fact(int n);
}
class Dev1 implements Factorial
{
    public int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public void showWhoImplemented()//we can also define methods which are not there in interface class
    {
        System.out.println("Prabhas");
    }
}
class Dev2 implements Factorial
{
    public int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public void showWhoImplemented()//we can also define methods which are not there in interface class
    {
        System.out.println("Ram Charan");
    }
}
public class FactorialThroughInterfaces {
    public static void main(String args[])
    {
        Dev1 d1=new Dev1();
        System.out.println("Implemented through iteration: "+d1.fact(5));
        d1.showWhoImplemented();
        Dev2 d2=new Dev2();
        System.out.println("Implemented through recursion: "+d2.fact(6));
        d2.showWhoImplemented();
    }
}
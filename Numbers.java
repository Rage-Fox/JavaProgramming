package aec.edu.in;
public class Numbers
{
    public boolean isPrime(int n)
    {
        if(n<=1)    return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)  return false;
        }
        return true;
    }
    public boolean isPalindrome(int n)
    {
        int m=n,sum=0;
        while(n!=0)
        {
            sum=(sum*10)+(n%10);
            n/=10;
        }
        if(m==sum)  return true;
        return false;
    }
    public int reverse(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=(sum*10)+(n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Numbers n=new Numbers();
        System.out.println(n.isPrime(5));
        System.out.println(n.isPalindrome(12321));
        System.out.println(n.reverse(123));
    }
}
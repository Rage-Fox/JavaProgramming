import java.util.*;
public class SimpleCalculator {
    public static int add(int p,int q)
    {
        return p+q;
    }
    public static int sub(int p,int q)
    {
        return p-q;
    }
    public static int mul(int p,int q)
    {
        return p*q;
    }
    public static int div(int p,int q)
    {
        return p/q;
    }
    public static int mod(int p,int q)
    {
        return p%q;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch,x,y,res;
        while(true)
        {
            System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.MOD\n6.EXIT");
            System.out.print("Enter Your Choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: x=sc.nextInt();
                        y=sc.nextInt();
                        res=add(x,y);
                        System.out.println(res);
                        break;
                case 2: x=sc.nextInt();
                        y=sc.nextInt();
                        res=sub(x,y);
                        System.out.println(res);
                        break;
                case 3: x=sc.nextInt();
                        y=sc.nextInt();
                        res=mul(x,y);
                        System.out.println(res);
                        break;
                case 4: x=sc.nextInt();
                        y=sc.nextInt();
                        res=div(x,y);
                        System.out.println(res);
                        break;
                case 5: x=sc.nextInt();
                        y=sc.nextInt();
                        res=mod(x,y);
                        System.out.println(res);
                        break;
                case 6: sc.close();
                        System.exit(0);
            }
        }
    }
}

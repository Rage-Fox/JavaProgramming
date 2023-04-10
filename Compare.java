package aec.edu.in;
public class Compare {
    public int greaterValue(int x,int y,int z)
    {
        if(x>y)
        {
            if(x>z)
            {
                return x;
            }
            else
            {
                return z;
            }
        }
        else
        {
            if(y>z)
            {
                return y;
            }
            else
            {
                return z;
            }
        }
    }
    public int lesserValue(int x,int y,int z)
    {
        if(x<y)
        {
            if(x<z)
            {
                return x;
            }
            else
            {
                return z;
            }
        }
        else
        {
            if(y<z)
            {
                return y;
            }
            else
            {
                return z;
            }
        }
    }
    public static void main(String args[])
    {
        Compare c=new Compare();
        System.out.println(c.greaterValue(10,20,30));
        System.out.println(c.lesserValue(10,20,30));
    }
}

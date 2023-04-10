import java.util.Scanner;//pre-defined package importing
import aec.edu.in.Compare;//user-defined package importing
public class UserDefinedPackages
{
    //package is the first statement to create a user defined package
    //to see the steps following the execution of package program--> go to SamplePack.java code
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Compare c=new Compare();
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        System.out.println(c.greaterValue(x, y, z));
        System.out.println(c.lesserValue(x, y, z));
        sc.close();
    }
}
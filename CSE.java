package aec.edu.in;
public class CSE {
    public void PrintHODName()
    {
        System.out.println("Dr.A.Vanathi");
    }
    public int getStudentsCount()
    {
        return 720;
    }
    public static void main(String args[])
    {
        CSE c=new CSE();
        c.PrintHODName();
        System.out.println("Number of Students: "+c.getStudentsCount());
    }
}

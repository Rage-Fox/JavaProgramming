import java.util.*;
interface Internal
{
	void getInternalMarks();
    void showInternalMarks();
}
interface External
{
	void getExternalMarks();
    void showExternalMarks();
}
interface Marks extends Internal, External//implements multiple inheritance here
{
	void showTotalMarks();
}
class Result implements Marks
{
	// s1_i -> sub1 internal, s1_e ->sub1 external
	float s1_i,s1_e,s2_i,s2_e,s3_i,s3_e;
	Scanner sc=new Scanner(System.in);
	public void getInternalMarks()
    {
		System.out.println("Enter 3 subjects internal marks (0 - 40)");
		s1_i=sc.nextFloat();
		s2_i=sc.nextFloat();
		s3_i=sc.nextFloat();
	}
    public void showInternalMarks()
    {
        System.out.println("The internal marks are: "+s1_i+" "+s2_i+" "+s3_i);
    }
	public void getExternalMarks()
    {
		System.out.println("Enter 3 subjects External marks (0 - 60)");
		s1_e=sc.nextFloat();
		s2_e=sc.nextFloat();
		s3_e=sc.nextFloat();
	}
    public void showExternalMarks()
    {
        System.out.println("The external marks are: "+s1_e+" "+s2_e+" "+s3_e);
    }
    public void showTotalMarks()
    {
		System.out.println("Subject \t Internal\tExternal\tTotal_Marks");
		System.out.println("  Sub1 \t\t   "+s1_i+"\t\t"+s1_e+"\t\t"+(s1_i+s1_e));
		System.out.println("  Sub2 \t\t   "+s2_i+"\t\t"+s2_e+"\t\t"+(s2_i+s2_e));
		System.out.println("  Sub3 \t\t   "+s3_i+"\t\t"+s3_e+"\t\t"+(s3_i+s3_e));
        System.out.println("Overall marks are: "+(s1_i+s1_e+s2_i+s2_e+s3_i+s3_e));
	}
}
public class MultipleInheritanceThroughInterfaces
{
    public static void main(String args[])
    {
        Marks m=new Result();
		m.getInternalMarks();
        m.showInternalMarks();
		m.getExternalMarks();
        m.showExternalMarks();
		m.showTotalMarks();
    }
}
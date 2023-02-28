import java.util.Scanner;
/*
Types variable:
1) Instance Variables or Object Dependent variables
A variable that can be declared inside a class and outside of a constructor or a method or a block is called instance variables.
For every object it creates a separate block of memory for these variales.
Scope:  Object level

2) Static Variables or Class Variables or Object Independent Variables
A variable that can be declared inside a class and outside of a constructor or a method or a block with a static keyword is called as static variables.
It allocates only one copy of memory for these variable and it can be shared to all the objects.
Scope: class level.

3) Local Variables
A variable that can be declared inside a method or a block is called local variables.
Scope: block level

Array Of Objects:
=================
 Employee e1=new Employee();   => It allocates memory for e1.
 Employee e2=new Employee();
 .........
 Employee e100=new Employee();
 
 int x[]=new int[size];    => classname obj[]=new classname[size];
 Ex:
    Employee e[]=new Employee[10];
	Employee e[0],e[1],....,e[9];
	e[0]=new Employee();
	-------------------------------------------
	Employee e[]=new Employee[10];
	for(int i=0;i<10;i++)
	{
	    e[i]=new Employee();
	}
*/
public class ArrayOfObjects {
    int empid;
	String empname;
	double sal;
	static String org_name="Aditya Engineering College";
	static int count=0;
	static double total_sal=0;
	public ArrayOfObjects(int empid,String empname,double sal)
	{
		this.empid=empid;
		this.empname=empname;
		this.sal=sal;
		ArrayOfObjects.count++;
		ArrayOfObjects.total_sal+=sal;
	}
	public void showEmployeeInfo()
	{
		System.out.println("Emp Id: "+empid);
		System.out.println("Emp Name: "+empname);
		System.out.println("Salary: "+sal);
		System.out.println("Organization: "+ArrayOfObjects.org_name);
	}
	public static void showTotalInfo()
	{
		System.out.println("Total Objects created: "+ArrayOfObjects.count);
		System.out.println("Total Salaries Paid: "+ArrayOfObjects.total_sal);
	}
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		int eid;
		String ename;
		double sal;
		ArrayOfObjects e[]=new ArrayOfObjects[5];
		for(int i=0;i<5;i++)
		{
            System.out.println("Enter the Employee "+(i+1)+" Details");
			eid=sc.nextInt();
			sc.nextLine();
			ename=sc.nextLine();
			sal=sc.nextDouble();
			e[i]=new ArrayOfObjects(eid,ename,sal);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Employee "+(i+1)+" Details");
			e[i].showEmployeeInfo();
		}
        sc.close();
	}
}

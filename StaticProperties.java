public class StaticProperties {
    //whenever the object is created, then it allocates a seperate block of memory for the members of a class
    //such properties are called instance properties or object dependent properties.
    //in this, properties are common but their values are different from object to object.
    //but sometimes, the properties and their values are common for every object.
    //such properties are called as static properties or class properties or object independent properties.
    int empid;
    String empname;
    double salary;
    static int count=0;
    static double totalsalary=0;
    static String org_name="Aditya Engineering College";
    //all objects will share the same single block of memory of static variables rather than creating a new one for every object.
    //all objects will share the single copy of static variables memory block.
    public StaticProperties(int empid,String empname,double sal)
    {
        this.empid=empid;
        this.empname=empname;
        this.salary=sal;
        StaticProperties.count++;//denotes the number of objects created and initialized.
        //all the static member variableshas to be accessed by only using the class name.
        StaticProperties.totalsalary+=sal;
    }
    public void show_emp_info()//non-static method
    {
        System.out.println("EMP ID: "+empid);
        System.out.println("EMP NAME: "+empname);
        System.out.println("SALARY: "+salary);
        System.out.println("ORGANISATION NAME: "+StaticProperties.org_name);
        //all the static member variableshas to be accessed by only using the class name.
    }
    public static void show_total_info()//static method was created
    {
        System.out.println("Total objects created: "+StaticProperties.count);
        System.out.println("Total salaries paid: "+StaticProperties.totalsalary);
    }
    public static void main(String args[])
    {
        show_total_info();
        StaticProperties emp1=new StaticProperties(101, "Ramesh", 52000);
        emp1.show_emp_info();
        show_total_info();
        StaticProperties emp2=new StaticProperties(102, "Sivaram", 34000);
        emp2.show_emp_info();
        //we can directly call the static method from main method.
        show_total_info();
    }
}

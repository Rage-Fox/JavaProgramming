import java.util.*;
public class EmployeeDetails {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int empid;
        String ename,desg,company;
        float salary;
        char gender;
        empid=sc.nextInt();//after reading the integer, the control will still stay in the same line
        //so the ename will take the new line character '\n' entered after empid
        //to avoid this, we have to take the control to the next line to take the input from the next line
        //using nextLine(); without any variable will take the control to the next line for a new input
        sc.nextLine();
        ename=sc.nextLine();
        gender=sc.nextLine().charAt(0);
        desg=sc.nextLine();
        salary=sc.nextFloat();//after reading the float value, the control will still stay in the same line
        //so the company will take the new line character '\n' entered after salary
        //to avoid this, we have to take the control to the next line to take the input from the next line
        //using nextLine(); without any variable will take the control to the next line for a new input
        sc.nextLine();
        company=sc.nextLine();
        System.out.println(empid);
        System.out.println(ename);
        System.out.println(gender);
        System.out.println(desg);
        System.out.println(salary);
        System.out.println(company);
        sc.close();
    }
}
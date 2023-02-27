import java.util.*;
public class ThisPointer {
    /*
    this is a generic object which is used to do the following:
    1) It is used to identify the currently executing object's address.
    2) If local variables and member variables both are having same name then,
       you have to use "this" keyword before the member variable name.
    */
    int x;
    public ThisPointer(int x)
    {
        this.x=x;
        //x=x means the argument passed will be equal to itself but not the member variables.
        //then the member variables will be assigned the default 0 values.
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ThisPointer t1=new ThisPointer(5);
        System.out.println(t1.x);
        sc.close();
    }
}

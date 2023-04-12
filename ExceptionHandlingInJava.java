public class ExceptionHandlingInJava
{
    /*
    An error means a mistake or a fault in the programming and it makes the behaviour of the program as abnormal.
    Errors are classified into 3 types:
    1) Syntactical Errors
        Every programming language have their own syntaxes. If you violate the rules of the programming language, it creates syntax errors.
        Ex: forgot the semicolon, unclosed double quotes, etc....
    2) Logical Errors
        In this, the output what you're expected is not getting because of wrongly written logic. System will not generate any error.
    3) Runtime Errors [Exceptions]
        The system not in the position to execute some statements. Such type of errors will be called as Runtime Errors.
        Ex: i) Divide a number with 0
            ii) Trying to access an index of an array which is out of range of that array.
            iii) Memory insufficient for executing the program.
        Note: If a Runtime error or exception is raised in the program, then the program will be terminated abnormally.
    Exception Handling: It is a process of providing an alterative method to continue the rest of the program execution.
    The main advantage of Exception Handling is "graceful termination" of the program.
    */
    public static void main(String args[])
    {
        /*
        int x=10,y=2;
        System.out.println(x+" "+y);
        int z=x/y;
        System.out.println(z);
        System.out.println("Task Completed!");//The program will be terminated normally.
        */
        /*
        //Arithmetic Exception because of zero division.
        int x=10,y=0;
        System.out.println(x+" "+y);
        int z=x/y;//it will overcome an error so here it will terminate abnormally.
        //it will not show any error when compiled but it will only shows error while running the program.
        System.out.println(z);
        System.out.println("Task Completed!");
        */
        /*
        //Array index out of bounds exception.
        int x[]={10,20,30,40};
        for(int i=0;i<=x.length;i++)
            System.out.println(x[i]);
        System.out.println("Task Completed!");
        */
        /*
        //string index out of bounds exception.
        String name="aditya";
        System.out.println(name.charAt(10));//out of range index.
        System.out.println("Task Completed!");
        */
        /*
        //if the arguments is not passed, then it will show number format exception.
        int age=Integer.parseInt(args[0]);
        System.out.println("Your age: "+age);
        System.out.println("Task Completed!");
        */
        /*
        To handle exceptions in Java:
        1) try: Risky code
                The statements which chances to generate an exception need to write down in try block. If an exception is raised in the try block, immediately the control is transferred to catch block.
        2) catch: Handling code
                If an exception is raised in the try block, the associated handling code will execute in catch block. After that the control continue the program execution from next line followed by catch block.
        3) finally: Cleaning code
                The statements which are needed to execute irrespective of exception raised or not in the program we need to write down in finally block. Without executing finally block, the program never terminates.
        4) throw
        5) throws
        */
        int x=10,y=0,z=0;
        System.out.println(x+" "+y);
        try
        {
            z=x/y;
        }
        catch(Exception e)
        {
            z=x/2;
            System.out.println(e);
            System.out.println("Exception is handled here");
        }
        System.out.println(z);
        System.out.println("Task Completed!");
        int arr[]={10,20,30,40};
        try
        {
            for(int i=0;i<=arr.length;i++)
                System.out.println(arr[i]);
        }
        catch(Exception e)
        {
            System.out.println("Index value crosses it's range");
            System.out.println(e);
        }
        System.out.println("Task Completed!");
        String name="aditya";
        try
        {
            System.out.println(name.charAt(10));//out of range index.
        }
        catch(Exception e)
        {
            System.out.println("String index is out of range");
            System.out.println(e);
        }
        System.out.println("Task Completed!");
        try
        {
            int age=Integer.parseInt(args[0]);
            System.out.println("Your age: "+age);
        }
        catch(Exception e)
        {
            System.out.println("Argument not passed");
            System.out.println(e);
        }
        System.out.println("Task Completed!");
    }
}
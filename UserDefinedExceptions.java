import java.util.*;
class InvalidLoginDetailsException extends RuntimeException
{
    public InvalidLoginDetailsException()
    {
        super();
    }
    public InvalidLoginDetailsException(String message)
    {
        super(message);
    }
}
public class UserDefinedExceptions {
    /*
    Built-in exceptions:
        -> ArithmeticException
        -> NumberFormatException
        -> InterruptedException
        -> ArrayIndexOutOfBoundsException
        -> 
    Parent class for all the exceptions?
        Exception Class
    Difference between Exception and Error?
        Exceptions are recoverable but errors are irrecoverable.
    Keywords used to handle the exceptions?
        try(Risky Code), catch(Handling Code), finally(Cleaning Code), throw(Statement-level exception throwing or inside the method), throws(Method-level exception throwing or throwed in method signature)
    throws:
        public void methodname() throws ExceptionName
        {

        }
    throw:
        public void methodname()
        {
            //raised an exception
            throw new ExceptionName("Message");
        }
    */
    /*
    Syntax:
        class UserDefinedExceptionType extends Exception or RuntimeException
        {
            public UserDefinedExceptionType()
            {
                super();
            }
            public UserDefinedExceptionType(String msg)
            {
                super(msg);
            }
        }
    */
    public static void checkValidity(String user,String pwd)
    {
        if(user.equalsIgnoreCase("aditya")&&pwd.equalsIgnoreCase("Thub@123"))
            System.out.println("Login Success");
        else
        {
            try
            {
                throw new InvalidLoginDetailsException("Make sure to give the login details correctly");
            }
            catch(InvalidLoginDetailsException i)
            {
                System.out.println("Handled the exception in check validity method");
                throw i;//rethrowing into another method.
                //this throw will go into try block above and that try block will return the exception into the main method.
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine();
        String password=sc.nextLine();
        try
        {
            checkValidity(username,password);
        }
        catch(InvalidLoginDetailsException ie)
        {
            System.out.println(ie);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            sc.close();
        }
    }
}
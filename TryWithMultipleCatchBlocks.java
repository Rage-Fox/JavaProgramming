public class TryWithMultipleCatchBlocks {
    /*
    Try with multiple catch blocks syntax:
    try
    {
        //risky code
    }
    catch(Exception1 obj)
    {
        //handling code
    }
    catch(Exception2 obj)
    {
        //handling code
    }
    .
    .
    .
    .
    catch(Exception obj)
    {
        //handling code
    }
    */
    public static void main(String args[])
    {
        int x=10,y=0,z=0;
        try
        {
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            z=x/y;
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
            System.out.println("y value should not be 0");
            z=x/2;
        }
        catch(NumberFormatException nfe)
        {
            System.out.println(nfe);
            System.out.println("Please pass arguments of integer datatype only");
        }
        catch(ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println(aiobe);
            System.out.println("Minimum number of arguments should be 2");
        }
        catch(Exception e)
        {
            System.out.println("Other exceptions are occured");
            System.out.println(e);
        }
        System.out.println(z);
        System.out.println("Task Completed Successfully!");
    }
}

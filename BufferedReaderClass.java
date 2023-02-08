import java.io.*;
public class BufferedReaderClass {
    public static void main(String args[]) throws Exception
    {
        //For BufferedReader, it is mandatory to write throws exception for main class.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();//reads input as a String.
        System.out.println(name);
        int x=Integer.parseInt(br.readLine());//to convert String input into an integer we have to do Integer.parseInt();
        int y=Integer.parseInt(br.readLine());//we cannot give two inputs in the same line as we are using readLine();
        int z=x+y;
        System.out.println(z);
        //Float.parseFloat() --> used to convert String to float type.
        //Double.parseDouble() --> used to convert String to double type.
    }
}

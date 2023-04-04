import java.util.Stack;
import java.util.Arrays;
public class PackagesInJava {
    //Package is a collection of classes, interfaces and sub-packages.
    /*
    Points on Packages:
    The main advantage of packages are security and easy to access.
    If I want to create a package in java programming, we need to use the keyword called "package" as a first statement in your program.
    Types of Packages:
    1) Built-in packages: The packages which are created in your system as a part of jdk installation are called built-in packages or default packages.
        Ex: java.io--> contains classes and interfaces related to input and output functionalities.
            java.lang--> contains all the language fundamental classes.
            java.util--> contains all the utility classes and interfaces.
            java.awt--> contains classes working with GUI applications.
            java.net--> contains networking related classes.
        Note-1: Here, java will be called as main package and io, lang, util, etc.. are called as sub-packages.
        Note-2: Packagename should be smallcase letters only!
        How to work with built-in packages:
        ===================================
        Step-1: Import the package which is required for the program.
        Step-2: Create an object for the class.
        Step-3: Call the appropriate method as per your requirement.
    2) User-defined packages
    */
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        int x[]={10,40,20,37,2};
        int y[]={2,10,20,37,40};
        //sort the elements of the given array
        for(int i:x)    System.out.print(i+" ");
        System.out.println();
        Arrays.sort(x);//call using classname only as all the methods in arrays package are of static methods only.
        for(int i:x)    System.out.print(i+" ");
        System.out.println();
        System.out.println(Arrays.equals(x,y));
    }
}
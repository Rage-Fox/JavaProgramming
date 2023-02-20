import java.util.*;
public class Arrays {
    //An Array is a fixed ordered collection of homogeneous elements referred through a single name
    //It's size is fixed and ordered(maintains the order of elements using index), all elements are of same data type.
    /*
    Declaration of an array:
    datatype arrayname[];
    arrayname=new datatype[size];
    Ex: int x[]=new int[5];
    Note: new is the operator which is used to allocate the memmory for the array with specified size.
    int x[] and int[] x are both same..
    */
    /*
    Initialization of an array: Assigning values into an array

    Compiletime Initialization: Assigning values into an array at the time of compilation is called Compiletime Initialization.
    Ex: datatype arrayname[]={val1,val2,....};
    The size of the array will be taken based on the number of elements given.
    arrayname.length --> Gives the size of the array.
    If you know what values to store in advance, then compiletime initialization is preferrable.

    Runtime Initialization: Assigning values into an array by reading the input from the user at the time of program execution is called Runtime Initialization.
    Ex: for(int i=0;i<size;i++)
        {
            arrayname[i]=sc.nextInt();
        }
    */
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]++;
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]={10,20,30,40,50};
        System.out.println(x[0]);
        System.out.println(x[3]);
        System.out.println(x.length);
        /*
        We cannot insert any other values because at the time of compile time initialization, the array size was fixed.
        We cannot change it.
        x[5]=60;
        System.out.println(x[5]);
        java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        */
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        display(arr);
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
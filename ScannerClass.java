import java.util.*;
public class ScannerClass {
    public static void main(String args[])
    {
        //Available in a package called java.util;
        //It has different methods for different datatypes to read the input from the user.
        Scanner sc=new Scanner(System.in);
        /*
        byte--> nextByte();
        short--> nextShort();
        int--> nextInt();
        long--> nextLong();
        float--> nextFloat();
        double--> nextDouble();
        boolean--> nextBoolean();
        word--> next();
        line of text--> nextLine();
        char-->  nextLine().charAt(0);
        */
        //calculating the net salary of an employee
        int bs,hra,da,ta,pf,pt,gs,ns;
        bs=sc.nextInt();
        hra=sc.nextInt();
        da=sc.nextInt();
        ta=sc.nextInt();
        pf=sc.nextInt();
        pt=sc.nextInt();
        gs=bs+hra+da+ta;
        ns=gs-(pf+pt);//deducting taxes
        System.out.println(ns);
        sc.close();//it is compulsory to close the scanner reader at the end of our code
    }
}
/*
15000
2500
800
1200
1800
500
17200
*/
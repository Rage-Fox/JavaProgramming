import java.util.*;
public class VariableLengthArrays {
    public static void main(String args[]) {
        /*
        variable length arrays means for every row in a matrix, the array length changes however we want to.
        int x[][]=new int[size][];//the column size will be given as empty
        x[0]=new int[4];//column size for row 0 is 4
        x[1]=new int[3];//column size for row 1 is 3
        */
        Scanner sc=new Scanner(System.in);
        int x[][]=new int[3][];//column size need not to be specified for variable length arrays.
        x[0]=new int[4];
        x[1]=new int[2];
        x[2]=new int[3];
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i].length);
        }
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
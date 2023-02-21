import java.util.*;
public class MultiDimensionalArrays {
    //An array that contains more than one dimension is called Multi Dimensional Arrays.
    //Ex: 2D, 3D, etc..
    /*
    2D Arrays:
    1) Compiletime Initialization:
    int x[][]={{1,2,3},{4,5,6}};
    2) Runtime Initialization:
    for(int i=0;i<row;i++)
        for(int j=0;j<col;j++)
            x[i][j]=sc.nextInt();
    */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

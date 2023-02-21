import java.util.*;
public class TransposeOfAMatrix {
    public static void transpose(int arr[][],int r,int c)
    {
        for(int i=0;i<r/2;i++)//remaining half will be automatically settled when swapping.. so only half loop for rows is required.
        {
            for(int j=0;j<c;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
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
        transpose(arr,r,c);
        System.out.println("Transpose Of The Given Matrix is:");
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

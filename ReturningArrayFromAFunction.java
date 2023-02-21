import java.util.*;
public class ReturningArrayFromAFunction {
    public static int[] rowwisesum(int arr[][],int r,int c)
    {
        int temp[]=new int[r];
        int sum=0;
        for(int i=0;i<r;i++)
        {
            sum=0;
            for(int j=0;j<c;j++)
            {
                sum+=arr[i][j];
            }
            temp[i]=sum;
        }
        return temp;
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
        int result[]=rowwisesum(arr,r,c);
        for(int i=0;i<r;i++)
        {
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}

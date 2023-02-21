import java.util.*;
public class ReverseElementsOfAnArray {
    public static void reverse(int arr[],int n)
    {
        int i=0;
        while(i<n/2)
        {
            int x=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=x;
            i++;
        }
    }
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

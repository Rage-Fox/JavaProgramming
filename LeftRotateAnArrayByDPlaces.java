import java.util.*;
public class LeftRotateAnArrayByDPlaces {
    public static void reverse(int arr[],int l,int r)
    {
        while(l<r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
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
        int d=sc.nextInt();
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

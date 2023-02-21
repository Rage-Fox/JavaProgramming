import java.util.*;
public class SecondLargestElementInAnArray{
    public static int secondlargest(int arr[],int n)
    {
        int largest=0,res=-1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest])
            {
                if(res==-1||arr[i]>arr[res])
                {
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=secondlargest(arr,n);
        System.out.println(arr[res]);
        sc.close();
    }
}
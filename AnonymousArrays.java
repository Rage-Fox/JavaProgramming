public class AnonymousArrays {
    //A named less arrays in java is called anonymous arrays.
    //It is for instant use.
    //Syntax: new datatype[]{val1,val2,....};
    public static int sum(int arr[])
    {
        //even though we mentioned arr variable, once this method execution is done, arr will stop referring that memory.
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        return s;
    }
    public static void main(String args[])
    {
        System.out.println(sum(new int[]{10,20,30,40}));//block of memory will be created but it will not be referred by any variable.
        System.out.println(sum(new int[]{50,60,70,80}));
    }
}

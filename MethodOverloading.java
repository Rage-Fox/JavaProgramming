public class MethodOverloading {
    //A class that contains more than one method with same name with different type or number or order of arguments is called Method Overloading.
    //Also called as compiletime polymorphism or static polymorphism or early binding.
    public void swap(int x,int y)
    {
        System.out.println("Before Swapping: "+x+" "+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping: "+x+" "+y);
    }
    public void swap(char ch1,char ch2)
    {
        System.out.println("Before Swapping: "+ch1+" "+ch2);
        char temp=ch1;
        ch1=ch2;
        ch2=temp;
        System.out.println("After Swapping: "+ch1+" "+ch2);
    }
    public void swap(double d1,double d2)
    {
        System.out.println("Before Swapping: "+d1+" "+d2);
        double temp=d1;
        d1=d2;
        d2=temp;
        System.out.println("After Swapping: "+d1+" "+d2);
    }
    public static void main(String args[])
    {
        MethodOverloading m=new MethodOverloading();
        m.swap(10,20);//It calls the swap with integer arguments
        m.swap('A','B');//It calls the swap with character arguments
        m.swap(3.14,5.34);//It calls the swap with double arguments
    }
}
public class MethodLocalInnerClass {
    //declaring inner class inside a method of outer class
    public void methodOne()
    {
        class MethodInner{
            public void sum(int i,int j)
            {
                System.out.println(i+j);
            }
        }
        MethodInner i=new MethodInner();
        i.sum(2,3);
        i.sum(20,30);
    }
    public static void main(String args[])
    {
        new MethodLocalInnerClass().methodOne();
    }
}
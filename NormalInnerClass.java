public class NormalInnerClass {
    //declaring inner class in the first line of creation of outer class is normal inner class.
    class InnerClass{
        //cannot declare static methods and members inside inner class
        public void methodOne()
        {
            System.out.println("Inner Class Method");
        }
    }
    public static void main(String args[])
    {
        new NormalInnerClass().new InnerClass().methodOne();
    }
}

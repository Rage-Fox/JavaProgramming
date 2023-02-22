public class CreationOfAClass {
    int x,y;
    public void show()//a non-static method which can only be accessible with the help of an object
    {
        System.out.println("show x = "+x);
        System.out.println("show y = "+y);
    }
    public static void main(String args[])
    {
        CreationOfAClass obj1=new CreationOfAClass();
        System.out.println("x = "+obj1.x);
        System.out.println("y = "+obj1.y);
        obj1.x=40;
        obj1.y=20;
        obj1.show();
        obj1.x++;
        obj1.y++;
        obj1.show();
    }
}

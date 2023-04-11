package pack2;
import pack1.TestPack;
class SampleProg extends TestPack{//making SampleProg.java as a child class of TestPack.java
    public static void main(String args[])
    {
        TestPack t=new TestPack();
        t.show();
        //t.display() cannot be called here as it is a default method and can only be accessible upto that class only!
        //t.printing() also cannot be called here because protected can only be accessible to child class object only but not through parent class objects.
        //So, inorder to avoid this error, we have to make an child class object and call printing() method through it.
        SampleProg s=new SampleProg();
        s.printing();
    }
}
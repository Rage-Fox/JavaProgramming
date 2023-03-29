public class StringBuffers
{
    public static void main(String args[])
    {
        //If the content keeps on changing, then we go for string buffer.
        //It doesn't create new object even if we change the content.
        /*
        Creating a StringBuffer in java:
        StringBuffer sb=new StringBuffer();//16 characters capacity by default
        StringBuffer sb=new StringBuffer(int capacity);
        StringBuffer sb=new StringBuffer(String s);//capacity=s.length()+16
        */
        //we cannot compare string and stringbuffer as s1==sb1. The compiler will not allow it.
        //even though they have the same content and we compare it with s1.equals(sb1), it'll show as false.
        StringBuffer sb1=new StringBuffer("T Hub");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer("Programmer");
        System.out.println(sb2);
        sb2.setCharAt(2,'O');
        System.out.println(sb2);
        StringBuffer sb3=new StringBuffer("Aditya");
        sb3.append(" Engineering College");
        System.out.println(sb3);
        sb1.reverse();
        sb1.insert(1,"echnical");
        System.out.println(sb1);
    }
}
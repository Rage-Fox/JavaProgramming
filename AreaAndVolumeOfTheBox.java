import java.util.*;
public class AreaAndVolumeOfTheBox {
    double l,b,h,area,vol;
    public AreaAndVolumeOfTheBox()
    {
        l=b=h=1;
    }
    public AreaAndVolumeOfTheBox(double d)
    {
        l=b=h=d;
    }
    public AreaAndVolumeOfTheBox(double length,double breadth,double height)
    {
        l=length;
        b=breadth;
        h=height;
    }
    public double calArea()
    {
        return l*b;
    }
    public double calVolume()
    {
        return l*b*h;
    }
    public void showBoxInfo()
    {
        System.out.println(l+" "+b+" "+h);
        System.out.println("Area = "+calArea());
        System.out.println("Volume = "+calVolume());
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        AreaAndVolumeOfTheBox box1=new AreaAndVolumeOfTheBox();
        box1.showBoxInfo();
        AreaAndVolumeOfTheBox box2=new AreaAndVolumeOfTheBox(4);
        box2.showBoxInfo();
        AreaAndVolumeOfTheBox box3=new AreaAndVolumeOfTheBox(4,5,6);
        box3.showBoxInfo();
        sc.close();
    }
}
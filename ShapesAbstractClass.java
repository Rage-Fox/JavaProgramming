import java.util.*;
abstract class Shape{
	Scanner sc=new Scanner(System.in);//if scanner is created here, we can inherit scanner object to all child classes.
	float s1,s2,a;
	final float pi=3.14f;//constant
	public abstract void get_Input();
	public abstract void Cal_Area();
	public void show_Area(){
		System.out.println("Area is: "+a);
	}
}
class Rect extends Shape{
	public void get_Input(){
		System.out.println("Enter L and B values");
		s1=sc.nextFloat();
		s2=sc.nextFloat();
	}
	public void Cal_Area(){
		a=s1*s2;
	}
}
class Circle extends Shape{
	public void get_Input(){
		System.out.println("Enter radius of the Circle");
		s1=sc.nextFloat();
	}
	public void Cal_Area(){
		a=pi*s1*s1;
	}
}
public class ShapesAbstractClass {
    public static void main(String args[])throws Exception{
		Shape s;
		s=new Rect();
		System.out.println("Rectangle");
		s.get_Input();
		s.Cal_Area();
		s.show_Area();
		System.out.println("=============");
		s=new Circle();
		System.out.println("Circle");
		s.get_Input();
		s.Cal_Area();
		s.show_Area();
		System.out.println("=============");
	}
}
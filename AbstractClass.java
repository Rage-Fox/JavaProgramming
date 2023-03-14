abstract class AAnimal
{
    abstract public void makeSound();
    public void eat()
    {
        System.out.println("I'm eating");
    }
}
class Dog extends AAnimal
{
    public void makeSound()
    {
        System.out.println("Bow bow");
    }
}
class Cat extends AAnimal
{
    public void makeSound()
    {
        System.out.println("Meow meow");
    }
}
abstract class parent{
    public void m1()
    {
        System.out.println("m1 method from parent");
    }
    public void m2()
    {
        System.out.println("m2 method from parent");
    }
    abstract public void m3();
}
class child extends parent
{
    public void m2()
    {
        System.out.println("m2 method from child");
    }
    public void m3()
    {
        System.out.println("m3 method from child");
    }
}
public class AbstractClass{
    /*
    abstract method is a method without any definition.
    any class which contains atleast one abstract method is an abstract class.
    it is used when you know something and rely on others for what you don't know.
    ex: abstract class shape
        {
            public abstract void get_input();//method ending with a semi-colon is an abstract method
        }
    */
    //we cannot create instance to abstract class.
    //But we can create reference variable to the abstract class and it is able to store instance of it's child class.
    //a parent class object can store the instance of child class but reverse is not possible.
    //ex: parent p=new child();
    //compilation: it will check the method is available in the object specific class.
    //execution: it executes the methods based on the child class instance.
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.makeSound();
        d.eat();
        Cat c=new Cat();
        c.makeSound();
        c.eat();
        parent p=new child();
        p.m1();
        p.m2();
        p.m3();
    }
}
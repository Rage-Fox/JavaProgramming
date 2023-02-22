public class ConstructorsAndConstructorOverloading {
    int age;
    String name;
    //types: default, parameterized, copy constructors.
    //constructor overloading: a class that contains more than one constructor with different arguments is called constructor overloading.
    public ConstructorsAndConstructorOverloading()//default constructor
    {
        System.out.println("Default Constructor Executed!");
        age=18;
        name="Guest";
    }
    public ConstructorsAndConstructorOverloading(String cname)//parameterized constructor 
    {
        System.out.println("Parameterized Constructor Executed!");
        age=19;
        name=cname;
    }
    public ConstructorsAndConstructorOverloading(int cage,String cname)//parameterized constructor
    {
        System.out.println("Parameterized Constructor Executed!");
        age=cage;
        name=cname;
    }
    public void show()
    {
        System.out.println(name+" : "+age);
    }
    public static void main(String args[])
    {
        ConstructorsAndConstructorOverloading c1=new ConstructorsAndConstructorOverloading();
        ConstructorsAndConstructorOverloading c2=new ConstructorsAndConstructorOverloading("Harsha");
        ConstructorsAndConstructorOverloading c3=new ConstructorsAndConstructorOverloading(35,"Sudhir");
        c1.show();
        c2.show();
        c3.show();
    }
}

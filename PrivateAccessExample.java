class privatemethod
{
    private int age=20;
    private String name="Ramesh";
    double salary=20000;//default
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
public class PrivateAccessExample
{
    public static void main(String args[])
    {
        privatemethod p=new privatemethod();
        System.out.println(p.getAge());
        System.out.println(p.getName());
        System.out.println(p.salary);//using private variable in another class using that class's object
        p.setAge(22);
        System.out.println(p.getAge());
    }
}
package pack1;
public class TestPack {
    //if public is not mentioned in the above line, it'll become as default and then it is not accessible by SampleProg.java program.
    public void show()
    {
        System.out.println("Hello");
    }
    void display()
    {
        System.out.println("Default Hello!");
    }
    protected void printing()
    {
        System.out.println("Protected Hello!");
    }
}
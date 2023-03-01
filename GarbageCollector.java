public class GarbageCollector {
    //It is a process that runs in the background continuosly to identify the unused objects and destroy them to free up memory.
    /*
    The JVM identifies the unused objects based on the following scenarios:
    1) By assigning "null" to an object.
        Ex: Employee e1=new Employee();
            e1=null;
    2) Assigning object from one to another.
        Ex: Employee e1=new Employee();
            Employee e2=new Employee();
            e1=e2;
        Note: The block of memory is allocated for e1 initially becomes an unused object.
    3) By anonymous object creation.
        Ex: new Employee().methodOne();
    */
    //In the object destroying process, first it calls the method called finalize() for the purpose of cleaning process.
    protected void finalize()
    {
        System.out.println("Object destroy process is started.");
    }
    public static void main(String args[])
    {
        GarbageCollector g1=new GarbageCollector();
        GarbageCollector g2=new GarbageCollector();
        //when nullified the objects, automatically protected finalize() method will be called by JVM.
        System.out.println(g1);
        System.out.println(g2);
        g1=null;
        g2=null;
        //calling garbage collector manually--> System.gc();
        System.gc();
    }
}
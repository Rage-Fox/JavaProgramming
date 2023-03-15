public class StringHandling{
    /*
    A group of characters which are enclosed with double quotes.
    String is a class in java.lang package.
    String class contains different methods for handling the string.
    String is immutable object, i.e; once the string object is initialized with some values, we can't allow to change it's values.
    How many ways the strings are created in java?
    ===============================================
    1) by using string literal
        ex: String name="name";
    2) by using the new keyword
        ex: String s1=new String("name");
    */
    public static void main(String args[])
    {
        String s1="CSE";
        String s2="CSE";
        String s3=new String("CSE");
        String s4=new String("CSE");
        System.out.println(s1==s2);
        System.out.println(s1==s3);//here it shows false even though we have same values in both the strings.
        System.out.println(s3==s4);//this also shows false
        /*
        Because, in strings if you wan to compare:
        obj1==obj2 --> It compares the address of the objects.(all the "new" String objects in java will be allocated memory in "HEAP")
        obj1.equals(obj2) --> It compares the content of the objects.
        */
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        //SCP block of memory in heap is String Constant Pool stores normal String="name";
        System.out.println("Before concat: "+s1);
        s1.concat(" Department");//a new object will be created here but there will be no reference to it.
        System.out.println("After concat: "+s1);//the value will not change here as string is immutable object.
        //once we assigned a value to the string, we cannot change the value of it.
        //but we have to assign the concatenated value to s1 again to change the content of it.
        System.out.println("Before concat: "+s1);
        s1=s1.concat(" Department");//we have created an object and referred s1 to that newly created object.
        System.out.println("After concat: "+s1);
    }
}
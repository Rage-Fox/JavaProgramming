public class Inheritance{
    public static void main(String args[])
    {
        /*
        Inheritance is the process of creating a new class from existing one.
        or Acquiring the properties from parent to child class is called as Inheritance.
        The main advantage of inheritance is code reusability.
        In java, we can implement inheritance by using the keyword "extends".
        The parent class is also called as Super class or Base class.
        The inherited class is also called as Sub class or Derived class.
        */
        /*
        Types of Inheritance:
        =====================
        1) Single Level: A class which is inherited from single parent class. [Father->Child]
        2) Multi Level: A class which is derived from a parent class which is already derived from another parent class.
        [Grandfather->Father->Child]
        3) Multiple: A class which is inherited from more than one parent class. [Father,Mother->Child]
        4) Hierarchical Inheritance: More than one child class are inherited from a single parent class. [Father->Child1,Child2]
        5) Hybrid: It is a combination of two or more types of inheritance.
        */
        /*
        How can we implement Inheritance in Java:
        =========================================
        Syntax:
        class <parent>
        {
            ....
        }
        class <child> extends <parent>
        {
            ....
        }
        Note: In the inheritance, all the features which are declared inside the parent class are automatically inherited to it's child class.
        */
    }
}
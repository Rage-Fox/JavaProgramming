public class FinalKeyword {
    /*
    final is a keyword which is used in java for the following:
    1) to create constants in java
        ex: final float pi=3.14f;
    2) to avoid method overriding in java
        ex: class parent
            {
                public void m1()//non-final method
                {

                }
                public final void m2()//final method
                {

                }
            }
            class child extends parent
            {
                public void m2()//this is allowed for method overriding
                {

                }
                public void m2()//this is not allowed
                {
                    //compiler will generate error as "overridden method is final"
                }
            }
    3) to make a class as a terminal class.
        if you want to make that class as terminal class, i.e; it doesn't allow to create any child class to it.
        ex: final class parent
            {
                .....
            }
            class child extends parent//this cannot be created as parent class acts as a terminal class
            {
                .....
                //cannot be inherited from final parent
            }
    */
}
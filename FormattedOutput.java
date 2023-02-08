public class FormattedOutput {
    public static void main(String args[])
    {
        float pi=3.142568f;
        System.out.println("PI = "+pi);
        System.out.format("PI = %.2f",pi);
    }
}
/*
PI = 3.142568
PI = 3.14
*/
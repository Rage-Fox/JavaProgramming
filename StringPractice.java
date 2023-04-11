import java.util.*;
import aec.cse.StringsPackage;
public class StringPractice {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringsPackage sp=new StringsPackage();
        String s=sc.nextLine();
        System.out.println(sp.reverseString(s));
        System.out.println(sp.isPalindrome(s));
        System.out.println(sp.vowelString(s));
        sc.close();
    }
}

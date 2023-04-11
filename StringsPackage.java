package aec.cse;
public class StringsPackage {
    public String reverseString(String s)
    {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            str=c+str;
        }
        return str;
    }
    public boolean isPalindrome(String s)
    {
        int i=0,n=s.length();
        s=s.toLowerCase();
        while(i<n/2)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                break;
            }
            i++;
        }
        if(i!=n/2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public String vowelString(String s)
    {
        String str="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                str+=c;
            }
        }
        return str;
    }
    public static void main(String args[])
    {
        StringsPackage s=new StringsPackage();
        System.out.println(s.reverseString("Hello!"));
        System.out.println(s.isPalindrome("Madam"));
        System.out.println(s.vowelString("Hello!"));
    }
}
public class SumOfDigitsInAString {
    public static void main(String args[])
    {
        String s1="abc12de34$ABC56";
        int uc=0,lc=0,di=0,sy=0,sum=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isAlphabetic(s1.charAt(i)))
            {
                if(Character.isUpperCase(s1.charAt(i)))
                {
                    uc++;
                }
                else
                {
                    lc++;
                }
            }
            else if(Character.isDigit(s1.charAt(i)))
            {
                di++;
                sum+=Character.getNumericValue(s1.charAt(i));//sum+=s1.charAt(i)-'0';
            }
            else
            {
                sy++;
            }
        }
        System.out.println("Uppercase: "+uc);
        System.out.println("Lowercase: "+lc);
        System.out.println("Digits: "+di);
        System.out.println("Sum of digits: "+sum);
        System.out.println("Symbols: "+sy);
    }
}
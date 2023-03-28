public class StringPalindrome
{
    public static boolean isPalindrome(String s)
    {
        int i=0,n=s.length();
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
    public static void main(String args[])
    {
        String s="MALAYALAM";
        s=s.toLowerCase();
        if(isPalindrome(s))
        {
            System.out.println(s+" Palindrome");
        }
        else
        {
            System.out.println(s+" Not a palindrome");
        }
        String word="I cannot speak malayalam language";//checking if individual words of a sentence is a palinrome or not.
        word=word.toLowerCase();
        String words[]=word.split(" ");
        String maxx="";//to store longest word in the given sentence.
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
            {
                System.out.println(words[i]+" Palindrome");
            }
            else
            {
                System.out.println(words[i]+" Not a palindrome");
            }
            if(maxx.length()<words[i].length())
            {
                maxx=words[i];
            }
        }
        System.out.println(maxx+" is the longest word in the given sentence");
    }
}
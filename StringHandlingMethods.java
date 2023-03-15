import java.util.*;
public class StringHandlingMethods {
    /*
    Constructors of String class:
    1) String s1=new String();//creates a string object with empty string.
    2) String s2=new String("Name");
    3) char ch[]={'N','A','M','E'};
       String s3=new String(ch);//converts character array into a String.
    4) byte b[]={65,66,67};
       String s4=new String(b);//stores "ABC" in s4
    */
    /*
    1) length(string)--> returns the length of the string.
    2) charAt(index)-->  returns character at given index.
    3) string1.equals(string2)--> compares content of the two strings.
    4) s1.equalsIgnoreCase(s2)--> compares content of the two strings by comparing them in case-insensitive(all lower case) manner.
    5) s1.indexOf(String)--> returns the index of given string.
    6) s1.lastIndex(String)--> returns the index of string value from last to first comparision.
    7) s1.replace(oldchar,newchar)--> replacing old char with new char in a string.
    8) replaceFirst(s1,s2)--> first match only was replaced.
    9) replaceAll(s1,s2)--> entire string will be replaced.
    10) s1.toLowerCase()
    11) s1.toUpperCase()
    12) s1.trim()--> to remove the wide spaces before and after the string.
    13) s1.concat(s2)--> to concatenate one string with another string.
    14) s1.substring(startindex)--> returns substring from start index to last.
    15) s1.substring(startindex,endindex)--> from start to end-1.
    16) s1.split(delimiter)--> divides into string array based on delimiter.
    17) s1.isEmpty()--> returns if string is empty or not.
    18) s1.compare(s2)--> both are same or different based on character checking.
    19) toCharArray()--> converts given string into a character array.
    20) s1.contains(s2)--> returns true if s2 is a part of s1
    */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //String s1=sc.nextLine();//Aditya Engineering College
        String s1="Aditya Engineering College";
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(" (A)"));
        System.out.println(s1.indexOf('e'));//12
        System.out.println(s1.lastIndexOf('e'));//25
        System.out.println(s1.charAt(24));//g
        System.out.println(s1.equals("aditya engineering college"));//false
        System.out.println(s1.equalsIgnoreCase("aditya engineering college"));//true
        System.out.println(s1.substring(7));
        System.out.println(s1.substring(7,18));
        System.out.println(s1.contains("Aditya"));//true
        System.out.println(s1.contains("aditya"));//false as it is case-sensitive
        //find the no. of words in string s1
        char ch[]=s1.toCharArray();
        int count=1;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
                count++;
        }
        System.out.println(count);
        String words[]=s1.split(" ");//["Aditya","Engineering","College"]
        System.out.println(words.length);//this is another way of finding no. of words in given string s1
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]+" - "+words[i].length());//individual length of words in the splitted string array
            //reversing each word in the splitted string array
            String s2="";
            for(int j=0;j<words[i].length();j++)
            {
                s2=words[i].charAt(j)+s2;
            }
            //printing the reversed word in the splitted string array
            System.out.println(s2);
        }
        sc.close();
    }
}

public class CommandLineArguments {
    //these are passed through command prompt
    //java ProgramName word0 word1
    //these arguments are sent to main method
    //these arguments are stored in the "args" string array
    //and these arguments are stored in the form of strings like args[0]="word0", args[1]="word1", ....
    public static void main(String args[])
    {
        //the arguments which are passed through command prompt at the time of program execution are called command-line arguments
        //all the command line arguments are stored in the string array which are passed in main method
        /*Please execute this program through command prompt only*/
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
/*
E:\T-Hub\4th Semester\Java Programming\src>java CommandLineArguments 100 200
100
200

*/
/*
E:\T-Hub\4th Semester\Java Programming\src>java CommandLineArguments AEC CSE
AEC
CSE

*/
/*
E:\T-Hub\4th Semester\Java Programming\src>java CommandLineArguments AEC
AEC
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at CommandLineArguments.main(CommandLineArguments.java:13)

*/
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
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        for(int i=0;i<args.length;i++)//for unknown number of arguments
        {
            System.out.println("args["+i+"] = "+args[i]);
        }
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
/*
E:\T-Hub\4th Semester\Java Programming\src>java CommandLineArguments 10 20 30 40 50 60 70 80 90 100
args[0] = 10
args[1] = 20
args[2] = 30
args[3] = 40
args[4] = 50
args[5] = 60
args[6] = 70
args[7] = 80
args[8] = 90
args[9] = 100

*/
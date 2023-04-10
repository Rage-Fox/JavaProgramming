package aec.edu.in;
//to compile a package file in cmd--> javac -d <directory path from it's drive> filename.java
//E:\T-Hub\4th Semester\Java Programming\src\
//if it has to create in the same directory, then you have to give the directory location as "." to represent it as current location
//after compilation--> setting of class path--> where my class is available, that location I need to pass
//comand--> set classpath=;.;%classpath%location;
//set classpath=;.;%classpath;E:\T-Hub\4th Semester\Java Programming\src\;
//now run the package file--> java aec.edu.in.SamplePack
/*
javac -d . SamplePack.java
java aec.edu.in.SamplePack
*/
public class SamplePack {
    public static void main(String args[])
    {
        System.out.println("First Package Program");
    }
}
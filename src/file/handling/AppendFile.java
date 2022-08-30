package file.handling;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AppendFile {
    /*
    Write a program which will create a java file if not present, and then append the content to the file.
    Example  if a file already has some content in it, then the program should not override the content rather
    it should append the new text after the previous content.
     */
    public static void appendFile(String loc)
    {
        File fl=new File(loc);
        try {
            if(fl.exists())
            {
                FileWriter fw=new FileWriter(loc,true);
                PrintWriter pw=new PrintWriter(fw);
                pw.print("From existing file");
                pw.close();
                fw.close();
                System.out.println("successful");
            }
            else
            {
                FileWriter file1=new FileWriter(loc,true);
                file1.write("Welcome to new session. ");
                PrintWriter file2=new PrintWriter(file1);
                file2.print(" Let's learn about file handling.");
                file2.close();
                file1.close();
                System.out.println("Session completed.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        String location="//Users//apple//Documents//amit//filehandling//new2.txt";
        appendFile(location);
    }
}

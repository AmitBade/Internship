package file.handling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileLocationAcceptance {
    /*
   Write a program which will accept a file location from the user and read and display the content of the file.
   If the file is not present in the machine then Handle the exception and display the message -
   “File is not found at the given location {location). Please verify the file location.”
    */
    public static void readFile(String loc) {
        File fl=new File(loc);
        try {
            if(fl.exists()) {
                FileReader fr=new FileReader(loc);
                int i;
                while((i=fr.read())!=-1) {
                    System.out.print((char)i);
                }
            }
            else {
                String print=String.format("File is not found at the given location { %s }. Please verify the file location.",loc);
                throw new Exception(print);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the file location");
        String location=sc.nextLine();

        readFile(location);
    }
}


package file.handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    /*
     Write a program to create a text file and write the below text in the file.
     “This file is created using java program.”
*/
    public static void main(String[] args) {
        try{
            FileWriter text= new FileWriter("//Users//apple//Documents//amit//filehandling//New.txt");
            try{
                text.write("This file is created using java program");
            }
            finally {
                text.close();
            }
            System.out.println("Successfully file written.");
        }
        catch (IOException i){
            System.out.println(i);
        }
    }
}

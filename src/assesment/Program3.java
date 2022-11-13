package assesment;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Program3 {
    /*
    Write a Java Program
    a. Accept a Paragraph from the user. (2 marks)
    b. Create a file programmatically and store the content which the user has entered. (5
    Marks)
    c. Convert the paragraph to UpperCase. (1 marks)
    d. Print the total number of words are present in the Paragraph. (3 Marks)
    d. Remove the duplicate words from the paragraph (You can convert the array into any
     suitable Collection if needed.) (2 marks)
    e. Print each unique word of the paragraph in a new line in the console.(2 Marks)
    */
    /***
     * Get user input and convert it into collection
     */

  public static void inputFromUser() throws IOException {

      Scanner input= new Scanner(System.in);
      System.out.println("Please write paragraph");
      String s=input.nextLine();
      try{
      FileReader file=new FileReader(s);
          int i;
          char c;
          String str = "";
          while ((i = file.read()) != -1)
          {
              System.out.print((char)i);
              c = (char)i;
              str = str + String.valueOf(c);
          }
      }
      catch(IOException e){

      }
      System.out.println("-----Converting into uppercase-----");
      String str=s.toUpperCase(Locale.forLanguageTag(s));
      System.out.println(str);

      System.out.println("------Printing total no of words");
      int count=1;
      for(int i=0;i<str.length();i++) {
          if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
              count++;
          }
      }
      System.out.println("Total number of words:"+count);
      System.out.println("---to remove duplicate elements from paraghraph-----");
      List<String> list= Arrays.asList(str);
      TreeSet<String> removeDuplicate= new TreeSet<String>(list);
      for(String  var:removeDuplicate){
         System.out.println(var);
      }
     }
     public static void main(String[] args) throws IOException {
        inputFromUser();
    }
}

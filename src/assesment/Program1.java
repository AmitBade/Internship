package assesment;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program1 {



    public static void readFromFile ()throws IOException{
        int i;
        char c;
        String str = "";
        try{
            FileReader file=new FileReader( "/Users//apple//Desktop//sampleFile.txt");
            while ((i = file.read()) != -1)
            {
                System.out.print((char)i);
                c = (char)i;
                str = str + String.valueOf(c);
            }
        }
      catch(
        IOException e){

        }
        System.out.println(" ");
        System.out.println(" -----Converting into list----");
        List<String> list= Arrays.asList(str);
        for (String s:list) {
            System.out.println(s);

        }
        System.out.println("----to remove duplicate-----");

        Map <String,String>fromFile= new LinkedHashMap<>();
        for (Map.Entry <String,String>entry : fromFile.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }



    public static void main(String[] args) throws IOException {
        readFromFile();
    }
}

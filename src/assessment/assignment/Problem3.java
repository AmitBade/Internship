package assessment.assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Problem3 {
    /*
    Write a Java Program -
a. Accept a Paragraph from the user.
b. Create a file programmatically and store the content which the user has entered. (5 Marks)
c. Convert the paragraph to UpperCase. (1 marks)
d. Print the total number of words are present in the Paragraph. (3 Marks)
d. Remove the duplicate words from the paragraph (You can convert the array into any suitable Collection if needed.)
e. Print each unique word of the paragraph in a new line in the console.(2 Marks)
     */

    /***
     * Returns paragraph entered by a user.
     *
     */
    public static String inputFromUser(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please write paragraph::");
        String userInput = input.nextLine();
        input.close();
        return userInput;
    }

    /***
     *  creates file programmatically and add text content to it.
     *
     */
    public static void writeToAFile(String userInput){

        try {
            FileWriter fl=new FileWriter("//Users//apple//Documents//user-input-file(2).txt");
            fl.write(userInput);
            fl.close();
        }
        catch(IOException a){
            a.printStackTrace();
        }
        try{
            FileReader file=new FileReader("//Users//apple//Documents//user-input-file(2).txt");
            int i;
            char c;
            String str = "";
            while ((i = file.read())!= -1)
            {
                System.out.print((char)i);
                c = (char)i;
                str = str + c;
                file.close();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    /***
     *  Returns count of words in a paragraph.
     *
     */
    public static int countWordsInAParagraph(String paragraph){

        String words[] = paragraph.split("\\s|,|\\.");
        int count = words.length;
        return count;
    }
    /***
     *  Returns text in uppercase.
     *
     */
    public static String convertToUpperCase(String text) {
        String upperCaseText = text.toUpperCase();
        return upperCaseText;
    }
    /***
     *  Returns unique words in text.
     *
     */
    public  static LinkedHashSet<String> removeDuplicateWords(String upperCaseInput) {
        String words[] = upperCaseInput.split("\\s|,|\\.");
        LinkedHashSet<String> uniqueWords= new LinkedHashSet<>();
        for(String word : words){
            uniqueWords.add(word);
        }
        return uniqueWords;
    }
    /***
     *  Prints unique words in text.
     *
     */
    public static void printUniqueWords(LinkedHashSet<String> uniqueWords){
        for(String word : uniqueWords) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) throws IOException {
        String userInput = inputFromUser();
        System.out.println("User entered text :: "+ userInput);

        writeToAFile(userInput);

        String upperCaseInput = convertToUpperCase(userInput);
        System.out.println("User input in upper case : "+ upperCaseInput);

        int countOfWords = countWordsInAParagraph(userInput);
        System.out.println("No of words in paragraph are: "+ countOfWords);

        LinkedHashSet<String> uniqueWords = removeDuplicateWords(upperCaseInput);

        System.out.println("Printing unique words from paragraph :");
        printUniqueWords(uniqueWords);
    }
}


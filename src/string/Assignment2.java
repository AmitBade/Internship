package string;

public class Assignment2 {
    //Write a program to count the number of words in a paragraph.
    public static int countNumberOfWords(String str) {

        int count=1;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="I’m reading a book about anti-gravity. It’s impossible to put down" ;
        int count= countNumberOfWords(str);
        System.out.println("Number of words="+count);
    }

}
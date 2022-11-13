package string;

public class Assignment5 {
    //Write a program to verify if the given string is palindrome.
    public static void main(String[] args) {
        String original="Nitin";
        String reversed="";
        for(int i=original.length()-1;i>=0;i--){
            reversed=reversed+original.charAt(i);
        }
        if(original.equalsIgnoreCase(reversed)){
            System.out.println(original+" is palindrome string.");
        }
        else{
            System.out.println(original+" is not palindrome string.");
        }
    }
}





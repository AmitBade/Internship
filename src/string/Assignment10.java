package string;

import java.util.Arrays;

public class Assignment10 {
    //Write a program to check if the 2 Strings are anagram of each other.
    public void isAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){
            System.out.println("Both strings are not anagram");
        }
        else {
            char[]string1=str1.toCharArray();
            char[]string2=str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
    public static void main(String[] args) {
        String str1="Army";
        str1=str1.toLowerCase();
        String str2="mary";
        str2=str2.toLowerCase();
        Assignment10 obj=new Assignment10();
        obj.isAnagram(str1,str2);
    }
}
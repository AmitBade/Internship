package string;

public class Assignment7 {
    public  static void printSubstring(String str, int startIndex, int endIndex){
        System.out.print("Substring is: ");
        for(int i=startIndex;i<=endIndex;i++){
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="This is Java Program";
        printSubstring(str,5,11);
    }
}

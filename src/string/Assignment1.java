package string;

public class Assignment1 {
    public static void main(String[] args) {
        //Write a program to reverse the string without using in-built methods
        String forward = "Never trust atoms ,they make up everything.";
        String reversed = "";
        for(int i=forward.length()-1;i>=0;i--){
            reversed=reversed+forward.charAt(i);
        }
        System.out.println(String.format("original String:%s",forward));
        System.out.println(String.format("Reversed String:%s",reversed));
    }
}

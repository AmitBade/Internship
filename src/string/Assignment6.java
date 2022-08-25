package string;

public class Assignment6 {
    public static void stringToArray(char[]string,String str) {
        System.out.println("String to array");
        int n=string.length;
        for(int i=0;i<=n-1;i++) {
            string[i]=str.charAt(i);
            System.out.print(string[i]);
        }
    }
    public static void main(String[] args) {
        String str= "Technogise";
        char[]string=new char[str.length()];
        stringToArray(string, str);
    }
}

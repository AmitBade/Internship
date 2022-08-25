package string;

public class Assignment3 {
    public static void main(String[] args) {
        String company = "TECHNOGISE";
        for (int i = 1; i <= company.length() ;i=i+2) {
           int count=0;
            System.out.println(company.substring(count,i));
        }
    }
}

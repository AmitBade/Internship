package string;

public class Assignment3 {
    public static void main(String[] args) {
        String company = "TECHNOGISE";
        for (int i = 1; i <= company.length(); i = i + 2) {
            for (int j = i; j <= i; j++) {
                if(i==9){
                    System.out.println(company.substring(0,j+1));
                }
                else {
                    System.out.println(company.substring(0, j));
                }

            }
        }
    }
}


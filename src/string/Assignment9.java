package string;

public class Assignment9 {
    public static void removeDuplicateCharacter(String str) {
        for (int i=0;i<str.length();i++)
        {
            int count=0;
            for (int j=0;j<str.length();j++)
            {
                if (str.charAt(i)==str.charAt(j) && i!= j)
                {
                    count=1;
                }
            }
            if (count==0){
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String str = "SACHINTENDULKAR";
        removeDuplicateCharacter(str);
    }

}


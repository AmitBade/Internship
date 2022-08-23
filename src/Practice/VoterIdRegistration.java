package Practice;

public class VoterIdRegistration {
        public static void main(String[] args) {
            int age = Integer.parseInt(args[1]);

            if (age < 18) {
                System.out.println(args[0]+":"+"You are not eligible for voting. "+" -regards "+args[2]+" ward Office");
            }
            else {System.out.println(args[0]+":"+"Congratulations!!!You are  eligible for voting."+" -regards "+args[2]+" ward Office"
            );
            }
        }
    }


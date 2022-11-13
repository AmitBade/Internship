package string;

public class Assignment4 {
    public static void main(String[] args) {
        String str = "Just burned 2,000 calories, that’s the last time I leave brownies in the oven while I nap.";
        int count = 0;
        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 't') {
                count++;
            }
        }
        System.out.println("Frequency of t is: "+count);
    }
}

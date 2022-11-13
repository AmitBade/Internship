package collection;
import java.util.*;
public class Program5 {
    /*
     Write a Java Program which will contain Character as the Key and List of Product Names as values.
     Example :
     ‘A’ → Apple, Airpods, Antenna , Aeroplane
     ‘B’ → Bat, Banana, Bi-cycle, Boat, Bear, Beer.
     ‘C’ → Cycle, Car, Cat, Cake, Cap
     i. Take a Character  input from the user  and then print the List of values for the specified Character.
     ii. If the user has entered a character for which we do not have any entry,
     the display a message → “No Records Found.”
     */
    /***
     *Take a Character  input from the user  and then print the List of values for the specified Character.
     */
    public static TreeMap<Character, LinkedList<String>> getNamesOfProduct(){
        LinkedList<String> startsWithA = new LinkedList<>();
        startsWithA.add("Apple");
        startsWithA.add("Airpods");
        startsWithA.add("Antenna");
        startsWithA.add("Aeroplane");

        LinkedList<String> startsWithB = new LinkedList<>();
        startsWithB.add("Bat");
        startsWithB.add("Banana");
        startsWithB.add(" Bi-cycle");
        startsWithB.add("Boat");
        startsWithB.add("Bear");
        startsWithB.add("Beer");

        LinkedList<String> startsWithC = new LinkedList<>();
        startsWithC.add("Cycle");
        startsWithC.add("Car");
        startsWithC.add("Cat");
        startsWithC.add("Cake");
        startsWithC.add("Cap");

        TreeMap<Character, LinkedList<String>> finalList = new TreeMap<>();
        finalList.put('A', startsWithA);
        finalList.put('B', startsWithB);
        finalList.put('C', startsWithC);
        return finalList;

    }
    public static char input(){
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter Character to print list of associated products for it");
        char ch = inputFromUser.next().charAt(0);
        return ch;
    }

        public static void toPrintProductNames(TreeMap < Character, LinkedList < String >> finalList, char alphabet)
        {
            if (finalList.containsKey(alphabet)) {
                for (Map.Entry<Character, LinkedList<String>> entry : finalList.entrySet()) {
                    if (entry.getKey().equals(alphabet)) {
                        System.out.println(entry.getValue());
                    }
                }
            } else {
                System.out.println("No Records Found.");
            }
        }
        public static void main (String[]args){
        TreeMap<Character, LinkedList<String>> data= getNamesOfProduct();
        char ltr=input();
        toPrintProductNames(data,ltr);
        }
}

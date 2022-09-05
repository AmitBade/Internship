package collection;

import java.util.*;

public class Program6 {
    /*
    Write a Java Program which will store List of Lists.
    i. The First List will have names of Fruits. (Strings)
    ii. The Second List will have Phone Numbers. (Integers)
    iii. The Third List will store alphabets. (Char)
    Store all these list in a Single List and then Print the values of the Lists in below Manner -
    The List of Strings are - {values}
    The List of Integers are - {values}
    The List of Characters are - {values}
    */
    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Banana");

        ArrayList<Integer> phoneNumberList = new ArrayList<>();
        phoneNumberList.add(1435346789);
        phoneNumberList.add(1324134245);
        phoneNumberList.add(1243598398);

        ArrayList<Character> alphabetList = new ArrayList<>();
        alphabetList.add('A');
        alphabetList.add('C');
        alphabetList.add('D');

        ArrayList allList = new ArrayList<>();

        allList.addAll(fruitList);
        allList.addAll(phoneNumberList);
        allList.addAll(alphabetList);

        ArrayList stringList = new ArrayList();
        ArrayList integerList = new ArrayList();
        ArrayList charList = new ArrayList();

        Iterator it = allList.iterator();
        while  (it.hasNext()){

            Object value = it.next();
            if(value instanceof String) {
                stringList.add(value);
            }
            if(value instanceof Integer){
                integerList.add(value);
            }
            if (value instanceof Character){
                charList.add(value);
            }
        }
        System.out.println("The List of Strings are - " + stringList);
        System.out.println("The List of Integers are - " + integerList);
        System.out.println("The List of Characters are - " + charList);
    }
}







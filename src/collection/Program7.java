package collection;
import java.util.*;
public class Program7 {
    /*
    Write a Java Program, Which will take String Input from the user unless the User enters “Done”.
    After the user is done with entering the inputs.
    Create a Map from the Inputs.
    Map<Char,List<String>>
    Based on the inputs starting character the values will be stored in respective Key’s list.
    Example -
    Please Enter As many items you want by pressing Enter key and once completed Type Done.
    */

    public static ArrayList<String> getUserInput(){
        String value = "";
        ArrayList<String> tmpValue = new ArrayList<>();
        System.out.println("Please enter values---");
        do {
            Scanner inputFromConsole = new Scanner(System.in);
            value = inputFromConsole.nextLine();
            if(!value.equalsIgnoreCase("done"))
                tmpValue.add(value);
        }
        while(!value.equalsIgnoreCase("done"));
        return tmpValue;
    }
        public static void toMakeList(ArrayList<String> tmpValue) {
            HashMap<Character, List<String>> valuesToStore = new HashMap<>();
            int maxValue = 0;
            char maxChar = '0';
            boolean isFirst = true;
            for (String tmp : tmpValue) {
                if (!tmp.isEmpty()) {
                    Character keyValue = tmp.charAt(0);
                    if (isFirst) {
                        maxChar = keyValue;
                        isFirst = false;
                    }
                    if (valuesToStore.containsKey(keyValue)) {
                        ArrayList<String> values = (ArrayList<String>) valuesToStore.get(keyValue);
                        values.add(tmp);
                        valuesToStore.put(keyValue, values);

                        int listLength = values.size();
                        if (listLength > maxValue) {
                            maxValue = listLength;
                            maxChar = keyValue;
                        }
                    } else {
                        ArrayList<String> values = new ArrayList<>();
                        values.add(tmp);
                        valuesToStore.put(keyValue, values);

                        int listLength = values.size();
                        if (listLength > maxValue) {
                            maxValue = listLength;
                            maxChar = keyValue;
                        }
                    }
                }
            }
            System.out.println("---Map Value---");
            for (Map.Entry<Character, List<String>> list: valuesToStore.entrySet()) {
                System.out.println(list.getKey()+"--->"+list.getValue());
            }
            System.out.println("Print the character which has the most number of items--->"+maxChar);

        }
        public static void main(String[] args) {
        ArrayList<String> userInput=getUserInput();
        toMakeList(userInput);
    }
}






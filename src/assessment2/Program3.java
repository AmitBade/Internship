package assessment2;


import java.util.*;
class NoProductFound extends Exception{
    NoProductFound(String str){
        System.out.println(str);
    }
}

public class Program3 {
    public static ArrayList<String> userInput(){
        ArrayList<String> products=new ArrayList<>();
        String str="";
        do{
            Scanner productName=new Scanner(System.in);
            str=productName.nextLine().toUpperCase();
            if(!str.equalsIgnoreCase("done")){
                products.add(str);
            }
        }while (!str.equalsIgnoreCase("done"));
        return products;
    }
    public static void descendingOrder(ArrayList<String> productNames) {
        ArrayList<String> productName=new ArrayList<>();
        Collections.sort(productName,Collections.reverseOrder());
        for (String product:productName) {
            System.out.println(product);
        }
    }
    public static Map<Character,String> createMap(ArrayList<String> productNames){
        Map<Character,String> products=new TreeMap<>();
        char keyValue='0';
        for (String s:productNames) {
            if(!s.isEmpty()) {
                 keyValue = s.toUpperCase().charAt(0);
            }
            if(products.containsKey(keyValue)){
                ArrayList<String> values=new ArrayList<>();
                values.add(s);
                products.put(keyValue, String.valueOf(values));
            }
            else {
                ArrayList<String> values=new ArrayList<>();
                values.add(s);
                products.put(keyValue, String.valueOf(values));
            }
        }

        return products;
    }
    public static void getProductsBasedOnAlphabet(Map<Character,String> productList){
        Map<Character,String> basedOnAlphabet=new TreeMap<>();
        Scanner in=new Scanner(System.in);
        System.out.println(">> Please Enter an alphabet to see the product list.");
        char c=in.next().toUpperCase().charAt(0);

            if (basedOnAlphabet.containsKey(c)) {
                for (Map.Entry<Character, String> entry : basedOnAlphabet.entrySet()) {

                    System.out.println("product list for character: " + c + entry.getValue());
                }
            }
            try {
             if (!basedOnAlphabet.containsKey(c)) {
                 String print=String.format("There are no products starting with {%s}",c);
                 throw new NoProductFound(print);

                }
            } catch (NoProductFound e) {
                throw new RuntimeException(e);
            }
    }




    public static void main(String[] args) {
        ArrayList<String> productNames=  userInput();
        descendingOrder(productNames);
        Map<Character,String> productList=createMap(productNames);
        getProductsBasedOnAlphabet(productList);
    }


}

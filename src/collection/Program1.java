package collection;
import java.util.*;
public class Program1 {
    /*
    Write a Java Program to create a List which will store 4 wheeler manufacturing brand names.
    i. Print only the Brand Names Starting with “M”
    ii. Sort the List in Ascending Order.
    iii. Display the No. of times each Brand is present in the list.
     */
    /***
     * To get four-wheeler manufacturers list and sort out.
     * @return four-wheeler brands.
     */

       public static  ArrayList<String> getBrandNames() {
           ArrayList<String> fourWheelerBrands = new ArrayList<>();
           fourWheelerBrands.add("Maruti Suzuki");
           fourWheelerBrands.add("Hyundai");
           fourWheelerBrands.add("Mahindra");
           fourWheelerBrands.add("Audi");
           fourWheelerBrands.add("Audi");
           fourWheelerBrands.add("Mercedes");
           fourWheelerBrands.add("Kia");
           fourWheelerBrands.add("Jaguar");
           fourWheelerBrands.add("Volkswagen");
           fourWheelerBrands.add("Ford");
           fourWheelerBrands.add("Nissan");
           fourWheelerBrands.add("Renault");
           fourWheelerBrands.add("Honda");
           fourWheelerBrands.add("Tata");
           fourWheelerBrands.add("Toyota");
           return fourWheelerBrands;
       }
       public static void toPrint(ArrayList<String> fourWheelerBrands){
           System.out.println("---------Sorting the List in Ascending Order-----------");
           Collections.sort(fourWheelerBrands);
           for (String brandNames:fourWheelerBrands) {
               System.out.println(brandNames);
           }

           System.out.println("----------Print only the Brand Names Starting with “M”-----------");
           for (String brandNames:fourWheelerBrands) {
               if(brandNames.startsWith("M")) {
                   System.out.println(brandNames);
               }
           }

           System.out.println("----------Display the No. of times each Brand is present in the list----------");

           Map<String,Integer>valuesToStore=new TreeMap<>();
           for(String tmp : fourWheelerBrands)
           {
               if(valuesToStore.containsKey(tmp)) {
                   int counter =  valuesToStore.get(tmp);
                   counter = counter + 1;
                   valuesToStore.put(tmp,counter);
               }
               else {
                   valuesToStore.put(tmp,1);
               }
           }
           for (Map.Entry<String,Integer> entry: valuesToStore.entrySet()){
               System.out.println(entry.getKey()+" : "+entry.getValue());
           }

       }
       public static void main(String[] args) {
          ArrayList <String>carBrands= getBrandNames();
          toPrint(carBrands);
       }
}

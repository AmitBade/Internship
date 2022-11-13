package assessment2;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
class FoodMenu{
    int itemCode;
    String dishName;
    String menuType;
    int price;
    FoodMenu(String dishName,String menuType,int price){
        this.dishName=dishName;
        this.menuType=menuType;
        this.price=price;
    }
}

public class Food {
    public static Map<Integer,FoodMenu> userInput(){
        Map<Integer,FoodMenu> food=new TreeMap<>();
        Scanner inputFromConsole=new Scanner(System.in);
        System.out.println("Please enter hom many food items you want");
        int foodItems= inputFromConsole.nextInt();
        for(int itemCode=1;itemCode<=foodItems;itemCode++){
            System.out.println(">> item code "+ itemCode);
            System.out.println("Dish Name :");
            String dishName= inputFromConsole.next().toUpperCase();
            System.out.println("Menu type:");
            String menuType= inputFromConsole.next().toUpperCase();
            System.out.println("Price:");
            int price=inputFromConsole.nextInt();
            FoodMenu obj=new FoodMenu(dishName,menuType,price);
            food.put(itemCode,obj);
        }
        for (Map.Entry<Integer,FoodMenu> entry: food.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        return food;
    }
    public static void menuType(Map<Integer,FoodMenu>foodItems){
        Scanner sc=new Scanner(System.in);
        System.out.println("what kind of menu type you are looking for?");
        String menu=sc.next();
        System.out.println("Item code   "+"DishName   "+"MenuType   "+"price   ");
        System.out.println("----------------------------------------------------");
        for (FoodMenu fm: foodItems.values()) {
            if(fm.menuType.equalsIgnoreCase(menu)){
                System.out.println(fm.itemCode+"   "+fm.dishName+"    "+fm.menuType+"    "+ fm.price);
                }
            
        }

    }

    public static void main(String[] args) {
        Map<Integer,FoodMenu> foodItems=userInput();
        menuType(foodItems);
    }
}

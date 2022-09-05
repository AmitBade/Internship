package collection;
import java.util.Map;
import java.util.TreeMap;
public class Program4 {
    /*
    Write a Java Program to store values in Key Value Pair. The Collection should store Employee ID and Name.
    i. The Employee ID should be alphanumeric , eg - TECH001
    ii. No Null Key should be allowed.
    iii. The data should be stored in ascending order.
    iv. Print the Data in the Below format -
	Hello {Name} ({Emp_Id}),
	Welcome to Technogise.
	Regards,
	Team Technogise.
    For example , Name is Martin, Employee ID is TECH2011, Then the data should be printed in below format.
    Hello Martin (TECH2011),
	Welcome to Technogise.
	Regards,
	Team Technogise.
    */

    /***
     * To collect employee ID and Name.
     */
    public static TreeMap<String,String> getEmployeeIdAndNames(){
        TreeMap<String,String> employeeIdAndName= new TreeMap<>();
        employeeIdAndName.put("Amit","TECH001");
        employeeIdAndName.put("Nabeel","TECH002");
        employeeIdAndName.put("Ganesh","TECH003");
        employeeIdAndName.put("Suro","TECH004");
        employeeIdAndName.put("Sharayu","TECH005");
        employeeIdAndName.put("Karishma","TECH006");
        employeeIdAndName.put("Vivek","TECH007");
        return employeeIdAndName;
    }
     public static void toPrint(TreeMap<String,String> employeeIdAndName){
         for (Map.Entry <String,String>m:employeeIdAndName.entrySet()) {
             String key= m.getKey();
             String value=m.getValue();
             String print = String.format("Hello %s (%s),\nWelcome to Technogise.\nRegards,\nTeam Technogise.\n",key,value);
             System.out.println(print);
         }
     }
    public static void main(String[] args)  {
        TreeMap<String,String> employees=getEmployeeIdAndNames();
        toPrint(employees);
    }
}

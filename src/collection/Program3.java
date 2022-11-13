package collection;
import java.util.LinkedHashSet;
public class Program3 {
    /*
    Write a Java Program to store PanCard Numbers of Employees.
    i. Choose the right Collection to be used (ArrayList, LinkedList, Set)
    ii. Make sure the Data is stored in the order they are inserted.
    ii. Print the data.
    */
    /***
     * Java Program to store PanCard Numbers of Employees.
     * @return
     */
    public static LinkedHashSet<String> getPanCardNumbers() {
        LinkedHashSet<String> panCardNumberOfEmployees = new LinkedHashSet<>();
        panCardNumberOfEmployees.add("AVLPB7198J");
        panCardNumberOfEmployees.add("ABJKL8756K");
        panCardNumberOfEmployees.add("CAKTM3456M");
        panCardNumberOfEmployees.add("AVLPB4567J");
        panCardNumberOfEmployees.add("AVLPB3333L");
        panCardNumberOfEmployees.add("KMTSN1234M");
        panCardNumberOfEmployees.add("SDFCH8768M");
        panCardNumberOfEmployees.add("JHKLM3234L");
        return panCardNumberOfEmployees;
    }
    public static void toPrint(LinkedHashSet<String> getPanCardNumberOfEmployees) {
        for (String str : getPanCardNumberOfEmployees) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        LinkedHashSet<String> panCardNumbers=getPanCardNumbers();
        toPrint(panCardNumbers);
    }
}


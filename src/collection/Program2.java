package collection;
import java.util.Iterator;
import java.util.LinkedList;
public class Program2 {
    /*
    Write a Java Program to create a List, which will store Student names. Insert at least 10 names.
    i. Print the student name which is present at the 3rd index.
    ii. Insert a new student name at the 7th index.
    iii. Remove the student name at the 4th index.
    iv. Sort the List in Descending order and print the final list.
    */
    /***
     * Method for adding and printing student names in list.
     */
    public static LinkedList <String>getStudentNames(){
        LinkedList<String> studentNames = new LinkedList<>();
        studentNames.add("Amit");
        studentNames.add("Ganesh");
        studentNames.add("Nabeel");
        studentNames.add("Sanket");
        studentNames.add("Mayuri");
        studentNames.add("Anuja");
        studentNames.add("Krishna");
        studentNames.add("Viraj");
        studentNames.add("Mangesh");
        studentNames.add("Pramod");
        studentNames.add("Pankaj");
        studentNames.add("Vikas");
        return studentNames;
    }
    public static void toPrint(LinkedList<String> studentNames){

        System.out.println("original list : "+studentNames);

        System.out.println("----Print the student name which is present at the 3rd index.----");
        System.out.println(studentNames.get(3));

        System.out.println("----Insert a new student name at the 7th index.----");
        studentNames.add(7,"Nitin");
        System.out.println(studentNames);

        System.out.println("----Remove the student name at the 4th index.----");
        studentNames.remove(4);
        System.out.println(studentNames);

        System.out.println("----Sort the List in Descending order and print the final list----");
        Iterator<String> i=studentNames.descendingIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
    public static void main(String[] args){
        LinkedList<String> students = getStudentNames();

         toPrint(students);
    }
}

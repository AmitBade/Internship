package assessment.assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Problem4 {
    /*Write a Java Program - 15 Marks
     * a. To accept the array length from the user and then accept the integer array elements from the user. (2 marks)
     * b. Print the original array received from the user. (2 Mark)
     * c. Reverse the array without using any library methods. (3 Mark)
     * d. Print the Sum of all the elements in the array. (2 Mark)
     * e. Print the Max element from the array. (3 Marks)
     * f. Remove the duplicates from the array and Print the unique values.  (3 Marks)
     */

    /***
     *
     * Returns Array from user input.
     */
    public static int[] userInput(int length) {
        Scanner sc=new Scanner(System.in);
        int arrayFromUserInput[]=new int[length];
        for(int i=0;i<length;i++) {
            System.out.println("enter element "+i);
            int elementOfArray=sc.nextInt();
            arrayFromUserInput[i]=elementOfArray;
        }
        for(int j=0;j<length;j++) {
            System.out.print(arrayFromUserInput[j]+" ");
        }
        return(arrayFromUserInput);
    }
    /***
     *
     * To reverse array.
     */
    public static void toReverseArray(int ar[]) {
        int reverseOfArray[]=ar;
        int length=reverseOfArray.length;
        System.out.print("\nreverse=");
        for(int i=length-1;i>=0;i--) {
            System.out.print(reverseOfArray[i]+" ");
        }
    }
    /***
     *
     * To add elements of array.
     */
    public static void toAddElementsOfArray(int arr[]) {
        int sumOfArray[]=arr;
        int sum=0;
        int length=sumOfArray.length;
        for(int i=0;i<length;i++) {
            sum=sum+sumOfArray[i];
        }
        System.out.println("\nsum of array elements = "+sum);
    }
    /***
     *
     * To find max element of array.
     */
    public static void toFindMaxElementFromArray(int arrMax[]) {
        int max[]=arrMax;
        int length=max.length;
        Arrays.sort(max);
        System.out.println("The max element of given array = "+max[length-1]);
    }
    /***
     *
     * To remove duplicate elements from array by converting into collection.
     */
    public static void toRemoveDuplicateElement(int dupArray[]) {

        LinkedHashSet<Object> uniqueElements= new LinkedHashSet<Object>();
        for(Object i:dupArray) {
            uniqueElements.add(i);
        }
        System.out.println("Array without duplicate elements ="+uniqueElements);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements you want to enter in array");
        int lengthOfArray=sc.nextInt();
        int arrayFromUserInput[]=userInput(lengthOfArray);

        toReverseArray(arrayFromUserInput);

        toAddElementsOfArray(arrayFromUserInput);

        toFindMaxElementFromArray(arrayFromUserInput);

        toRemoveDuplicateElement(arrayFromUserInput);
    }
}

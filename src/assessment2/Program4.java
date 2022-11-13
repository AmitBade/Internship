package assessment2;

import java.util.Scanner;

public class Program4 {
    /*
    Write a Java Program -
a. Accept an array length and int array elements from the user and store it in an array.
 b. Give the count of the total number of PrimeNumbers in the array.
c. Write a method which will take the array as the input and
then replace the Armstrong Numbers in the array with 0. and return the array. Display the updated Array.
     */
public static int[]userInput(int length){
    Scanner sc=new Scanner(System.in);
    int arrayFromUserInput[]=new int[length];
    for(int i=0;i<length;i++) {
        System.out.println("enter element "+i);
        int elementOfArray=sc.nextInt();
        arrayFromUserInput[i]=elementOfArray;
    }
    System.out.println("Given array is");
    for(int j=0;j<length;j++) {
        System.out.print(arrayFromUserInput[j]+" ");
    }
    return(arrayFromUserInput);
}
public static int primeNumbers(int[]arr,int lengthOfArray){
    int counter=0;
    for(int i=0;i<lengthOfArray;i++){
        for(int j=i+1;j<lengthOfArray;j++){
        if(arr[i]%j==0 && arr[i]%1==0){
            counter++;
        }
        }
    }
    System.out.println("----------------------------------");
    System.out.println("No of Prime numbers: "+counter++);
    return counter;
}
public static int[] isArmstrongNumber(int[]arr){
    int[] arr1 = new int[0];


    return arr1;

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements you want to enter in array");
        int lengthOfArray=sc.nextInt();
        int arrayFromUserInput[]=userInput(lengthOfArray);

        int count=primeNumbers(arrayFromUserInput,lengthOfArray);


    }
}

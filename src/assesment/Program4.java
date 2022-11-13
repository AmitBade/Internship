package assesment;

import java.util.*;

public class Program4 {
    /*
    Write a Java Program - 15 Marks
    a. To accept the array length from the user and then accept the integer array elements
    from the user. (2 marks)
    b . Print the original array received from the user. (2 Mark)
    b. Reverse the array without using any library methods. (3 Mark)
    c. Print the Sum of all the elements in the array. (2 Mark)
    d. Print the Max element from the array. (3 Marks)
    e. Remove the duplicates from the array and Print the unique values. (You can convert

     */
    /***
     *  Accept information from user and print arrays according to requirement.
     */
      public static void userInput(){

           Scanner inputFromConsole= new Scanner(System.in) ;
          System.out.println("Please input ArrayLength");
          int length= inputFromConsole.nextInt();
          int[]arr=new int[length];
          System.out.println("Please input data in Array");
          for(int i=0; i<length;i++){
              for(int j=0;j<1;j++) {
                  int array = inputFromConsole.nextInt();
                  arr[i] = array;
              }
          }
          System.out.println("----Original Array-----");
          for(int i=0;i<length;i++){
              System.out.println(arr[i]);
          }
          System.out.println("----Reversed Array------");
          for(int i=(length-1);i>=0;i--){
              System.out.println(arr[i]);
          }
          System.out.println("----Addition of Array elements-----");
          int sum=0;
          for(int i=0;i<length;i++){
              sum=sum+arr[i];
          }
          System.out.println("Sum of Arrays:"+sum);
          System.out.println("------Finding max element----");
          Arrays.sort(arr);
          int max=arr[length-1];
          System.out.println("Max element:"+ max);
          System.out.println("----Converting Into collection to remove duplicate values");
          List<Integer> list=Arrays.asList(arr[length-1]);
          TreeSet <Integer> removeDuplicate= new TreeSet<Integer>(list);
          for(Integer var:removeDuplicate){
              System.out.println(var);
          }
      }
      public static void main(String[] args) {
        userInput();
    }
      }


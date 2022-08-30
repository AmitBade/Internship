package exception.handling;

import java.util.Scanner;

public class Program1 {
    /* Write a program which will catch an exception , print some message and then rethrow the exception.
Ex -
Your program is performing Division of a Number, Accept 2 numbers from the user.
if the second number is 0 then a Divide By Zero Exception occured,
then catch the exception , Print the message “ Please enter valid number to divide.” and then throw the exception.
    */
    public static void division(int a,int b)throws Exception{
        int div=a/b;
        System.out.println("Division is :"+div);
        try{
            div=a/b;
        } catch (Exception e) {
            throw new Exception("Please enter the valid number to divide");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber=scn.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber=scn.nextInt();
        division(firstNumber,secondNumber);
    }

}

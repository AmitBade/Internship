package exception.handling;

import java.util.Scanner;

public class Program2 {
    /*
Write a program which will print “Program initiated..”, then accept a PhoneNumber from the user.
If the Number entered is not equal to 10 digit,
then throw an Exception with a message “Number should be 10 digit”,
Catch the Exception and print the message in the exception, and then the program should print “Program terminated.”
If the Number is equal to 10 digit, then display the entered number and then print “Program Terminated.”
     */
    public static void phoneNumber(int length , String number) throws Exception
    {
        String str=number;
        if(length==10)
        {
            System.out.println("Mobile number entered is : "+str);
        }
        else if(length>10 || length<10)
        {
            throw new Exception("Number should be 10 digit");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Program initiated.");

        Scanner sc =new Scanner(System.in);
        System.out.println("enter phone number");
        long phoneNumber =sc.nextLong();
        String str=Long.toString(phoneNumber);
        int length=str.length();
        sc.close();
        try
        {
            phoneNumber(length,str);
        }
        catch(Exception e)
        {
            System.out.println(e); // printing the caught exception
        }
        finally
        {
            System.out.println("Program terminated");
        }
    }
}



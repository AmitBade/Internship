package file.handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneNumberRegistration {
    /*
Write a Java Program to take input from the user.
Take the below Inputs -
First Name, Last Name and PhoneNumber
Create a .txt file. the Name of the file should be {firstName}_{lastName)_{phoneNumber}.txt
The content in the file should be -
	Hello {firstName},
	Welcome to Java Programming.
	Your Number {PhoneNumber} has been registered for updates.
	Thanks,
	Team Java.
	 */

    public static void phoneNumber(String location , String toPrint)
    {
        try {
            String print=toPrint;
            FileWriter fw=new FileWriter(location);
           try {
               fw.write(print);
           }
           finally {
               fw.close();
           }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name");
        String firstName=sc.next();

        System.out.println("enter last name");
        String lastName=sc.next();

        System.out.println("enter phone number");
        long phoneNumber=sc.nextLong();

        String locationName=String.format("//Users//apple//Documents//amit//%s_%s_%d.txt",firstName,lastName,phoneNumber);
        System.out.println(locationName);

        String message=String.format("Hello %s,\nWelcome to Java Programming.\nYour Number %d has been registered for updates.\nThanks,\nTeam Java.",firstName,phoneNumber);
        System.out.println(message);
        phoneNumber(locationName,message);
    }
}

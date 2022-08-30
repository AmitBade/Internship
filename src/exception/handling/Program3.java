package exception.handling;

import java.util.Scanner;

public class Program3 {
    /*
Write a program to create a User Defined Exception named InvalidBrowserException.
Take a browser name as an input form the user and if the browser name is not in the
supported browser list then throw the InvalidBrowserException.
Example Supported Browsers = { Google Chrome, Firefox and Safari}
If the user input is “IE” then throw InvalidBrowserException.
If the user input is Firefox then display - “Awesome, We will launch the browser.
     */
    public static void browser(String browserName) throws InvalidBrowserException
    {
        if(browserName.equalsIgnoreCase("Google Chrome")
                ||browserName.equalsIgnoreCase("GoogleChrome")
                || browserName.equalsIgnoreCase("Firefox")
                || browserName.equalsIgnoreCase("Safari")) {
            System.out.println("Awesome, We will launch the browser.");
        }
        else {
            throw new InvalidBrowserException("This is InvalidBrowserException");
        }
    }

    public static void main(String[] args) throws InvalidBrowserException {

        Scanner scr=new Scanner(System.in);

        System.out.println("Enter the browser name : ");
        String input=scr.nextLine();
        try {
            browser(input);
        }
        catch (InvalidBrowserException e) {
            System.out.println(e);
        }
    }
}

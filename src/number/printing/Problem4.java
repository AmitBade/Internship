package number.printing;

public class Problem4 
{
	//Write a program to check if the given number is a Palindrome Number or not.
	 
	  public static boolean checkPalindrome(int n)
	  {
	    int reverse = 0;
	    int temp = n;
	    while (temp != 0) {
	      reverse = (reverse * 10) + (temp % 10);
	      temp = temp / 10;
	    }
	    return (reverse == n); // if it is true then it will return 1;
	    // else if false it will return 0;
	  }
	  public static void main(String args[])
	   {
	    int n = 121;
	    if (checkPalindrome(n) == true) {
	      System.out.println(n+" is a palindrome number");
	    }
	    else {
	      System.out.println(n+" is not a palindrome number");
	    }
	   }
	}



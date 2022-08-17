package number.printing;

public class Problem5 
{
	//Write a program to print the factorial of a given number. The method should return the value
	
	public static int factorialOfGivenNumber(int number)
	{
		int factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
	 public static void main(String[] args) 
	  { 
		  int number = 6;
		  int result= factorialOfGivenNumber(number);
		  System.out.println("Factorial of "+number+" is: "+result); 
	  }
}

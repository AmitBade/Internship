package number.printing;

public class Problem6 
{//Write a program to print the factorial of numbers in the range of  10-30 (both inclusive)
	public static void factorialOfNumbersRange(int startNumber, int endNumber)
	{  
		for (int number = startNumber; number <= endNumber; number++) {
			double factorial=1;
			for(int i=1;i<=number;i++)
			{
			factorial=factorial*i;
			}
			System.out.println("Factorial of "+number+" is: "+factorial);
		}
		
	}
	public static void main(String[] args)
	{
		factorialOfNumbersRange(10,30);
	}
	

}

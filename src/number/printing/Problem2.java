package number.printing;

public class Problem2 
{
	//Write a program to Print if the given Number is a Prime Number or Not.
	public static void main(String[] args)
	  {
		 givenNumberIsPrimeOrNot(7);
		 givenNumberIsPrimeOrNot(13);
		 givenNumberIsPrimeOrNot(9);
		 givenNumberIsPrimeOrNot(15);
		 givenNumberIsPrimeOrNot(21);
		 givenNumberIsPrimeOrNot(2);
		 givenNumberIsPrimeOrNot(0);
		 givenNumberIsPrimeOrNot(100);	
	  }
	public static void givenNumberIsPrimeOrNot(int number) {
		boolean isNumberPrime = isPrimeNumber(number);
		if(isNumberPrime) {
			System.out.println(number+" is a prime number");
		} else {
			System.out.println(number+" is not a prime number");
		}
	}
	
	public static boolean isPrimeNumber(int number)
	{
		if(number<=1)
		{
		 return false;
		}
		if(number==2)
		{
		 return true;
		}	
		for(int num1=2;num1<number;num1++)
		{
			if(number%num1==0)
			{
			 return false;
			}
		}
		return true;
		}
}

package number.printing;

public class Problem1 
{
	//Write a program to print  first 20 Fibonacci Series
	
	
	public static void printFibonacciSeries(int n)
	
	{ int firstTerm=0;int secondTerm=1;
	for (int i = 1; i <= n; ++i)
	  {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	  }

		
	}
	public static void main(String[] args)  
	  {
		printFibonacciSeries (20);
	  }
	


}

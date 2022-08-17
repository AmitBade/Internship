package number.printing;

public class Problem3 
{
	//Write a program to Print the Prime Numbers from 1-100.
	public static void primeNumber ()
	{
	 for(int i=2;i<=100;i++)
		{
		boolean check=true;
		for(int j=2;j<i;j++)
		   {
			if(i%j==0)
			  {
			   check=false;
			   break;
			  }
		   }
			if(check==true)
			  {
			  System.out.print(i+" ");
			  }
		}
			
	}
	
      public static void main(String[] args) 
      {
    	  primeNumber(); 
	  }
}

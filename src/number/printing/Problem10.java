package number.printing;

public class Problem10 
{//Write a program to Print all the Numbers between 1-10 which is Prime Number, Odd Number and also an Armstrong Number.
	public static boolean isPrime(int condition) 
	{
	 int count=0;	
	 for(int i=1;i<=condition;i++)
	    {
		 if(condition%i==0) 
		   {
			count++;
		   }
		}
		 return count==2;
	}
	
	static void isArmstrong(int start,int end) 
	{
			
	for(int i=start;i<=end;i++) 
	 {
		int number=i;
		int sum=0;
		int multiplication;
		while(number>0) 
	 {
			multiplication=number%10;
			sum=sum+(multiplication*multiplication*multiplication);
			number=number/10;	
     }
				
	if(sum==i)
	{
	System.out.println("armstrong number: "+sum);
	}
	  }
	}
	
	static void oddNumber(int start,int end) {
	for(int i=start;i<=end;i++) {
	if(i%2!=0) {
	System.out.println(" odd numbers:"+i);	
	}
		}	
	}
	public static void main(String[] args) {
	int a=1 ;int b=10;	
	
	System.out.print("Prime number 1 to 10:");
	for(int i=a;i<=b;i++) {
		
	if(isPrime(i)) 
    {
	System.out.print( i+" ");}
	}
	System.out.println(" ");
	isArmstrong(a,b);
		
	oddNumber(a,b);
		
	}

}


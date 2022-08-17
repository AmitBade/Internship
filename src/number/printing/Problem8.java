package number.printing;

public class Problem8 
{
 //Write a program to Print the Armstrong Numbers from 50-1000
	
  public static void armstrongnumberRange(int startCondition,int lastCondition) 
  {
   for(int j=startCondition;j<=lastCondition;j++)
	 {
	  int first=j;
	  int second=first;
	  int length=0;
	  while(second>0)
	      {
			length=length+1;
		    second=second/10;
		  }
		  int start=first;
		  int remainder=0;
		  int armstrong=0;
		  while(start>0)
		    {
			 int multiplication=1;
			 remainder=start%10;
			 for(int i=1;i<=length;i++)
				{
				 multiplication=multiplication*remainder;
				}
				  armstrong=armstrong+multiplication;
				  start=start/10;
				}
				 if(armstrong==first)
				   {
					System.out.println("armstrong numbers are:"+" "+armstrong);
				   }
		}
	}
	public static void main(String[] args)
	{
      armstrongnumberRange(50,1000);
	}

}

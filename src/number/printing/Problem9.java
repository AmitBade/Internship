package number.printing;



public class Problem9 
{
 public static int secondArmstrongnumber(int startCondition,int lastCondition) 
  {
	int count=0;
	int secondArmstrongNumber = 0;
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
			if(first%2==0) {
			   count++;
				if(count==2)
					{
					secondArmstrongNumber=first;
					}
				}
			}
		}
			return secondArmstrongNumber;	
	}
	
	public static void main(String[] args) 
	{
	System.out.println("second even armstrong number "+secondArmstrongnumber(10,10000));
	}
}
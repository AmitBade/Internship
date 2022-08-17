package number.printing;

public class Problem7 
{
	//Write a program to print if the given number is an Armstrong number or not.The method should return the value and print it in main()
   public static boolean toCheckArmstrongNumber(int number)
   {int remainder,result;
	result=number;
	int sum=0;
	
	while(number>0)
	{
	remainder=number%10;
	sum=(remainder*remainder*remainder)+sum;
	number=number/10;
		
	}
	return result==sum;
}

    public static void main(String[] args) 
    {
	int number=153;
	
	if(toCheckArmstrongNumber(number)) {
	System.out.println(number +" is Armstrong number");
	}
	else {
	System.out.println(number+"is not Armstrong number");
	}
	   
   }
}
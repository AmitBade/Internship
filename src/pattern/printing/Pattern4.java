package pattern.printing;

public class Pattern4 {
public static void main(String[] args)
{
	
	for(int i=1;i<=7;i=i+2)
{
	for(int j=i;j<=7;j=j+2)
	{
			System.out.print("   ");
	}
	for(int j=1;j<=i;j++)
	{
			System.out.print("*  ");
	}
	System.out.println("   ");
}
	for(int i=5;i>=1;i=i-2)
	{
		for(int j=i;j<=7;j=j+2)
		{
				System.out.print("   ");
		}
		for(int j=1;j<=i;j++)
		{
				System.out.print("*  ");
		}
		System.out.println("   ");
	}
	
}
}
	

  
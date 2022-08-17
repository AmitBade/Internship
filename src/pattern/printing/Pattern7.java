package pattern.printing;

public class Pattern7 
{/* 1
  	22
  	333
  	4444
  	55555
  	4444
  	333
  	22
  	1
*/
public static void main(String[] args) 
{
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print(row);
			
		}
	
		System.out.println();
		
	}
	for(int i=4;i>=1;i--) 
	{
		for(int j=1;j<=i;j++) 
		{
		System.out.print(i);
		}
		System.out.println();
		
	}
		
}
}

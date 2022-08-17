package pattern.printing;

public class Pattern3 
{
/*55555
  4444
  333
  22
  1
*/
	public static void main(String[] args)
	{

		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row);
				
			}
			System.out.println();
			
		}
		
	}
}

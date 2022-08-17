package pattern.printing;

public class Pattern1 
{
	/* 1
  	   23
  	   456
  	   78910
  	*/
	public static void main(String[] args)
	{ int i=1;
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=row; col++)
			{
				System.out.print(i);
				i++;
				
			}
			
			System.out.println();
			
		}
		
	}

}

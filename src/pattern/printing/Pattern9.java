package pattern.printing;

public class Pattern9 
{/* 1
 	222
	33333
	4444444
	555555555
	*/
	
	public static void main(String[] args) 
	{
for (int row = 1; row <= 5; row++) {
	int i=2*row-1;
			
			for (int column = 1; column <= i; column++) {
				System.out.print(row);
			}
			System.out.println(" ");
		}
		
		
	}



}

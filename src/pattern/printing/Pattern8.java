package pattern.printing;

public class Pattern8 
{/* *
    ***
    *****
   	*******
  	*********
 
*/ 
	public static void main(String[] args) 
	{
for (int row = 1; row <= 9; row=row+2) {
			
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}

}

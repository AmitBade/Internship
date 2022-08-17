package pattern.printing;

public class Pattern10 
{/*
	1
	212
	32123
	4321234
	543212345
*/
	public static void main(String[] args) 
	{
		int numberToBePrinted = 1;
		for (int row = 1; row <= 5; row++) {
			numberToBePrinted=row;
			for (int column2=row; column2>=1;column2--) {
				System.out.print(numberToBePrinted);
				numberToBePrinted--;
			}
			numberToBePrinted=2;
			for (int column = 1; column <row; column++) {
				System.out.print(numberToBePrinted);
				numberToBePrinted++;
			}
			
			
			System.out.println("");
		}
		
	}

}

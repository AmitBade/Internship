package pattern.printing;

public class Pattern5 {
    /*
  	*
  	##
  	***
  	####
  	*****
  	*/
    public static void main(String[] args) {
        for(int row=1;row<=5;row++)
        {
            for(int col=1;col<=row;col++)
            {if(row==1 || row%2==1) {
                System.out.print("*");
            }
            else{
                System.out.print("#");
            }
            }
            System.out.println();
        }
    }
}

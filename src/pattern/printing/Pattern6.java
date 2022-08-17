package pattern.printing;

public class Pattern6 {
	 
    /*	1
  	    **
   	    4*6
  	    *8910
  	*/
	public static void main(String[] args) {

		int i,j,k=1,count;
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				count=0;
				for(int q=1;q<=k;q++)
				{
					if(k%q==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print("* ");
					k++;
				}
				else
				{
					System.out.print(k+++" ");
				}
			}
			System.out.println();
		}
	
	
	
	
	
	}


	}


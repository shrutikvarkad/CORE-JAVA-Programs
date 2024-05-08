class InvertedPyramid
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++) 
		{
			//print spaces
			for (int j=1;j<=i ;j++) 
			{
				System.out.print(" ");		
			}

			//print asteric
			for (int j=i;j<=5 ;j++) 
			{
				System.out.print("* ");	
			}
			 System.out.println();	
		}
	}
}
class Pattern10
{
	public static void main(String[] args) 
	{
		//print spaces 
		for (int i=1;i<=5 ;i++) 
		{
			//print spaces
			for (int j=i;j<=5 ;j++ ) 
			{
				System.out.print(" ");	
			}
		}

		//print asteric
		for (int j=1;j<=i ;j++ ) 
		{
			System.out.print("* ");	
		}
		System.out.println();
	}
}
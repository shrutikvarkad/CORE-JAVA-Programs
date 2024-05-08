class AmstrWhile
{
	public static void main(String[] args) 
	{
		int num = 15;
		int  length = 0;
		int sum = 0;
		int dup1 = num;
		int dup2 = num;

		while (num>0)
		{
			length++;
			num/=10;
		}	

		while (dup1>0)
		{
			int rem = dup1%10;
			int power = 1;
		
			for (int i =1; i<=length ;i++ ) 
			{
				power = power*rem;
				
			}
			sum += power;
			dup1 /= 10;
		}
		if (dup2 == sum) 
		{
			System.out.println("*****Amnstrong No*****");	
		}
		else{
			System.out.println("******Not An Amnstrong No*******");
		}
	}
}
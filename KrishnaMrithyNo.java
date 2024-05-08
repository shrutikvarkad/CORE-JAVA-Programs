class KrishnaMrithyNo
{
	public static void main(String[] args) 
	{
		for (int j=1;j<=5000000 ;j++ ) 
		{
			int num =j;
			int sum = 0;
			int dup = num;

			while(dup !=0)
			{
				int rem = dup%10;
				int fact = 1;

				for (int i=1;i<=rem ;i++ ) 
				{
					fact = fact*i;	
				}
				sum = sum+fact;
				dup= dup/10;
			}
			if (sum==num)
			System.out.println(num);			
		}
	}
}
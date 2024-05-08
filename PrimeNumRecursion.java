class PrimeNumRecursion
{
	static int num = 2;
	static int i = 2;
	static boolean flag = true;

	public static void main(String[] args) 
	{
		primeNum();
		System.out.println(flag?"Prime":"Not Prime");
	}

	public static void primeNum()
	{
		if (i==num) 
			return;
		
			if (num%2==0) 
			{
				flag = false;
				return;
			}
			i++;
			
			
			primeNum();
	}
}
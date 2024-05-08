class SpyNo
{
	public static void main(String[] args) 
	{
		int num= 1125;
		int dup =num;
		int sum =0;
		int prod = 1;

		while(num!=0)
		{
			int rem= num%10;
			sum = sum + rem;
			prod = prod*rem;
			num/= 10;
		}
		System.out.println(prod==sum?"SPY num":"NO SPY num");
		
	}
}
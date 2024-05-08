class NeonNo
{
	public static void main(String[] args) 
	{
		int num = 22;
		int sqr= num*num;
		int sum=0;

		while(sqr>0)
		{
			int rem = sqr%10;
			sum += rem;
			sqr /=10;
		}
		System.out.println(sum==num?"Neon no":"not neon no");


		// if (sum == num) 
		// {
		// 	System.out.println(num + " is a Neon no");
		// }
		// else{
		// 	System.out.println("not an neon no");
		// }
	}
}
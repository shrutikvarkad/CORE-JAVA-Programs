class PerfectSqr
{
	public static void main(String[] args) 
	{
		int num = 8;
		int sqrrt = 0;
		boolean flag = false;

		for (int i=1;i<=num/2 ;i++ ) 
		{
			if (i*i==num) 
			{
				flag = true;
				sqrrt = i;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(sqrrt + " is a perfect sqr of "+ num);
		}
		else{
			System.out.println(num+" do not have a perfect sqrrt");
		}
	}
}
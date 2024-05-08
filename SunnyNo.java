class SunnyNo 
{
	public static void main(String[] args)
	{
		int num = 80;
		int nnum = num + 1;
		int sqrrt=0;
		boolean flag = false;

		for (int i=1;i<=num/2 ;i++ ) 
		{
			if(i*i==nnum)
			{
				flag = true;
				sqrrt= i;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(num + " is a Sunny no");
		}
		else{
			System.out.println(num + " not an Suuny No");
		}
	}
}
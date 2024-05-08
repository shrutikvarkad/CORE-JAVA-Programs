class Demo9
{
	public static void main(String[] args) 
	{
		System.out.println("main ()");
		Demo9 obj = new Demo9();
		obj.m1();
	}

	public void m1()
	{
		System.out.println("m1()");
		Demo10 obj = new Demo10();
		obj.m2();
	}
}

class Demo10
{
	public void m2()
	{
		System.out.println("m2()");
		m3();
	}

	public void m3()
	{
		System.out.println("m3()");
	}
}
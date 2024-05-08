class Demo7
{
	String str1=" String from demo7 class";

	public static void main(String[] args) 
	{
		System.out.println("heloo from main ()");
		Demo7 objt = new Demo7();
		Demo8 obj = new Demo8();
		System.out.println(objt.str1);
		obj.m1();
		obj.m2();
	}
}

class Demo8
{
	void m1()
	{
		System.out.println("heloo from m1()");
		Demo7 obj = new Demo7();
		System.out.println(obj.str1);
	}
	void m2()
	{
		System.out.println("heloo from m2()");
	}
}

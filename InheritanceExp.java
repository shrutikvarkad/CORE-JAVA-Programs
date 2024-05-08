class Parent
{
	String str = "* from Parent ";
	void m1()
	{
		System.out.println("1 hello m1() Parent");
	}
	static void m3()
	{
		System.out.println("2 bye from m3() Parent Static");
	}
}

class Child extends Parent
{
	String str = "# from Child ";
	void m2()
	{
		System.out.println("3 helloo from m2() Child");
		System.out.println(super.str);
	}
	static void m4()	
	{
		System.out.println("4 bye from m4() Child static ");
	}
}

class InheritanceExp
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		System.out.println(obj.str);
		obj.m1();
		obj.m3();
		System.out.println(obj.str);
		obj.m2();
		obj.m4();

	}
}
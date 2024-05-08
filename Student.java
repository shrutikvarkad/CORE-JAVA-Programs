class Student
{
	 String str = "global";
	public static void main(String[] args) 
	{
		System.out.println("main");
		Student obj =new Student();
		obj.m1();
		System.out.println(obj);
	}

	public  void m1()
	{
		String str = "local";
		System.out.println(str);
			System.out.println(this.str);
	}

}
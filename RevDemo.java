import java.util.Scanner;
class RevDemo
{
	static int op;
	
	static
	{
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		op = additon(num1,num2);
		System.out.println("Addition "+ op);
		System.exit(0);
	}

	public static int addition (int num1, int num2)
	{
		op=num1+num2;
		return op;
	}
	
}
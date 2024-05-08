import java.util.Scanner;
class PowerOfNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int num = sc.nextInt();
		int dup = num;
		int length = 0;
		int power = 1;

		while (num>0)
		{
			length++;
			num/=10;
		}
		System.out.println("length is "+length);
		for (int i =1 ;i<=length ;i++ ) 
		{
			power *= dup;	
		}System.out.println("Power is "+power);
	}
}
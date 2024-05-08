import java.util.Scanner;
class SmallestValue
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 :");
		int num1 = sc.nextInt();
		System.out.print("num2 :");
		int num2 = sc.nextInt();
		System.out.println((num1>num2)? "Smallest number is num2":"Smallest number is num1" );
		
	}
}
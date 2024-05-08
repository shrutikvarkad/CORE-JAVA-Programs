import java.util.Scanner;
class LargestValue
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 :");
		int num1 = sc.nextInt();
		System.out.print("num2 :");
		int num2 = sc.nextInt();
		System.out.println((num1>num2)? "Largest number is num1":"Largest number is num2" );
		
	}
}
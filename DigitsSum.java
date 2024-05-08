import java.util.Scanner;
class DigitsSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("3 Digits Number : ");
		int num = sc.nextInt();
		int num1 = num%10;
		int num2 = num/10;
		int num3 = num2%10;
		int num4 = num2/10;
		int sum = num1 + num3 + num4;

		System.out.println("Sum of Digits "+ sum);
	}
}
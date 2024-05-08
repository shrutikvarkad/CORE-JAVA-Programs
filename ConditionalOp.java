import java.util.Scanner;
class ConditionalOp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int num = sc.nextInt();
		System.out.println((num%2==0)?"even":"odd");
		
	}
}
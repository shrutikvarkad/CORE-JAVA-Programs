import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");

		int num = sc.nextInt();
		boolean flag = true;

		for ( int i = 2 ; i<num ; i++)
		{
			if(num%i == 0)
			{
				flag = false;
				// break;
			}
		}
		System.out.println(flag?"Prime":"Not Prime");
	}
}
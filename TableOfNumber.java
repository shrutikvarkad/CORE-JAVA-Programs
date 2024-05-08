import java.util.Scanner;
class TableOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int num = sc.nextInt();
		for(int i= 1; i<=10; i++)
		{
			int table = num*i ;
			System.out.println(table);
		}
	}
}
import java.util.Scanner;
class Palidrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int num =  sc.nextInt();
		int dup = num;
		int rev = 0;

		while(num>0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num = num /10;
		}
		System.out.println((dup==rev)?"Palidrome":"Not Palidrome");
	}
}
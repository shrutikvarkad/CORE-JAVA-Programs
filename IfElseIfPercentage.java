import java.util.Scanner;
class IfElseIfPercentage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Percentage : ");
		double percentage = sc.nextDouble();

		if (percentage >= 0 && percentage < 35)
			{
				System.out.println("Mand");
			}
		else if ( percentage >= 35 && percentage <= 60)
			{
				System.out.println("First Class");
			}
		else if ( percentage >= 60 && percentage <= 75)
			{
				System.out.println("Second Class");
			}
		else if ( percentage >= 75 && percentage <= 90)
			{
				System.out.println("A+ Distinction");
			}
		else if ( percentage >= 90 && percentage <= 100)
			{
				System.out.println("First Class with Distinction");
			}
		else
			{
				System.out.println("Nonsense enter a Number");
			}
		
	}
}
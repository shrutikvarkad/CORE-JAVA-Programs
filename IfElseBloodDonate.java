import java.util.Scanner;
class IfElseBloodDonate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();

		if (age >20 )
		{
			System.out.print("  Have you consume (Cigarette/Alcohol) in 24 hours (yes/no) : ");
		    String addicted = sc.next().toLowerCase();

		    if(addicted.equals("no"))
		    {
		    	System.out.print("   Enter your weight : ");
		    	int weight = sc.nextInt();

		    	if(weight>=50)
		    	{
		    		System.out.println("   Yes now you can Donate Blood");
		    	}
		    	else
		    	{
		    		System.out.println("   Put on some weight full..... ");
		    	}
		    }
		    else
		    {
		    	System.out.println("     Sorry You can't Donate blood");
		    }
		}
		else
		{
			System.out.println("  You are not elligale to donate blood");
		}
	}
}
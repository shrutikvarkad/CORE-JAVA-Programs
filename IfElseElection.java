import java.util.Scanner;
class IfElseElection
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.print("Do you have VoterId (yes/no) : ");
			String voterId = sc.next().toLowerCase();
			if (voterId.equals("yes"))
			{
				System.out.println("*****  WelCome  *****");
				System.out.println("  1. BJP ");
				System.out.println("  2. NCP ");
				System.out.println("  3. AAP ");
				System.out.println("  4. MNS ");
				System.out.println("  5. ShivSena ");
				System.out.println("  6. NOTA ");

				System.out.print("Enter the option to vote your fav party : ");
				String vote = sc.next().toUpperCase();

				if (vote.equals("BJP"))
				{
					System.out.println("  You have voted for BJP ");
				}
				else if(vote.equals("NPC"))
				{
					System.out.println("  You have voted for NPC ");
				}
				else if(vote.equals("AAP"))
				{
					System.out.println("  You have voted for AAP ");
				}
				else if(vote.equals("MNS"))
				{
					System.out.println("  You have voted for MNS ");
				}
				else if(vote.equals("ShivSena"))
				{
					System.out.println("  You have voted for ShivSena ");
				}
				else if(vote.equals("NOTA"))
				{
					System.out.println("  You have voted for NOTA ");
				}
				else
				{
					System.out.println("  Invaild Input");
				}
			}
			else
			{
				System.out.println("  hatt be ");
			}
		}
		else
		{
			System.out.println("You are not mature came after "+ (18-age) + " years");
		}
	}
}
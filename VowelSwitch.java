import java.util.Scanner;
class VowelSwitch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch = sc.next().toLowerCase().charAt(0);

		switch (ch)
		{
			case 'a' : 
			case 'e' :
			case 'i' : 
			case 'o' : 
			case 'u' :System.out.println("  Vowel  "); break;
			default : System.out.println("   consultants ");
		}
		
	}
}
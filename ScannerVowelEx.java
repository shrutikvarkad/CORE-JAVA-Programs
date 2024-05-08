import java.util.Scanner;
class ScannerVowelEx
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("hello "+ name + " first chatacter of your name is "+ ch);


		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Character "+ ch + "is a vowel");
		}
		else{
			System.out.println("Character "+ ch + "  is a consonent");
		}
	}
}
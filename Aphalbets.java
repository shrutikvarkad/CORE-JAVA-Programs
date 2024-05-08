// write a prg to find input is aphalbets or not
import java.util.Scanner;
class Aphalbets
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);    // char ch = 'A';
		System.out.print("  Enter Aphalbets :  ");
		char ch = sc.next().charAt(0);
		System.out.print(((ch >= 65 && ch <= 90) || (ch>='a' && ch<='z'))?  ((ch >= 65 && ch <= 90)?  " UpperCase Aphalbets" : " LowerCase Aphalbets") : "Not an Aphalbets");
		
	}
}
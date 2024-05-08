import java.util.Scanner;
class SwitchSeason
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month : ");
		String month = sc.next().toUpperCase();
		switch (month)
		{
			case "OCT" : 
			case "NOV" :
			case "DEC" : 
			case "JAN" : System.out.println(month + " it's thandii . ");break;

			case "FEB" : 
			case "MAR" : 
			case "APR" : 
			case "MAY" : System.out.println(month + " its summer . ");break;

			case "JUN" : 
			case "JUL" : 
			case "AUG" : 
			case "SEP" : System.out.println(month + " it's rainyy . ");break;
			default: System.out.println("  invalid input ");
		}
	}
}
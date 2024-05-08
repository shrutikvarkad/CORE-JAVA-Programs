// import java.util.Scanner;
class Largest3Values
{
	public static void main(String[] args) 
	{
		// Scanner sc = new Scanner(System.in);
		// System.out.print("num1 :");
		// int num1 = sc.nextInt();
		// System.out.print("num2 :");
		// int num2 = sc.nextInt();
		// System.out.print("num3 : ");
		// int num3 = sc.nextInt();
		int n1 = 4990;
		int n2 = 90;
		int n3 = 999999;
		System.out.println(  (n1<n2)?  ((n2<n3)? n3 : n2 )  :  (n1)   );
	}
}
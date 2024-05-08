import java.util.Scanner;
class FeetToMeter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Feets : ");
		double feet = sc.nextDouble();
		double meter = feet*0.305;
		System.out.println("The Conversion into meter is "+ meter);
	}
}
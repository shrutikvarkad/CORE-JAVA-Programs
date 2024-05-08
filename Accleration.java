import java.util.Scanner;
class Accleration
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Starting Velocity : ");
		double v0 = sc.nextDouble();

		System.out.print("Final Velocity : ");
		double v1 = sc.nextDouble();

		System.out.print("Time : ");
		double t = sc.nextDouble();

		double avgAcc = (v1 - v0)/t;

		System.out.println("Average Acceleration is " + avgAcc);
			
	}
	
}
import java.util.Scanner;
class CalculateTips
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your subtotal : ");

		double subTotal = sc.nextDouble();
		System.out.print("Enter your Gratuity rate : ");
		double gratuityRate = sc.nextDouble();
		

		double tip = (subTotal/100)*gratuityRate;
		double total = subTotal+ tip;
		System.out.println("Total : " + total);

	}
	
}
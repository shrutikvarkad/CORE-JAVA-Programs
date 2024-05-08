import java.util.Scanner;
class ElectionSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		
		//int reqAge = (age>=18)?0:1;
		// switch(reqAge){
		// case 0 : System.out.println("Eligible.");break;

		// case 1 : System.out.println("Not Eligible"); break;
		// }
		if (age>=18) 
		{
			System.out.println("ok");
		}
		else {
			System.out.println("not ok");
		}

	}
}	

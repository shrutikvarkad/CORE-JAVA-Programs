import java.util.Scanner;
class Sumof3Digits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your number please : ");
		int num = sc.nextInt();
		int dup = num;
		for (int ; ; ) 
		{
			
		}


		int ld = num%10;
		num = num /10;
		int sd = num%10;
		num = num/10;
		int fd = num %10;
		System.out.println(ld);
		System.out.println(sd);
		System.out.println(fd);
		int sum = fd + sd + ld;
		System.out.println("Your Number is "+ dup + " and its digits sum is " + sum);


		// int num = sc.nextInt();
		// int sum = 0;
		// sum = sum + num%10;
		// num = num/10;
		// sum = sum + num%10;
		// num = num/10;
		// sum = sum + num%10;
		// System.out.println("Your Number is "+ num + " and its digits sum is " + sum);
	}
} 
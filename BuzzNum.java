//num should be divisible by 7 or last digit should be 7 
class BuzzNum
{
	public static void main(String[] args) 
	{
		int num = 77;
		if((num%7==0) || (num%10==7))
		{
			System.out.println("you are a buzz num");
		}
		else{
			System.out.println("you are not a Buzz num");
		}
	}
}
// print even number from 1 to 100 using recursion 

// class EvenNumber
// {
// 	static int num = 1;
// 	public static void main(String[] args) 
// 	{
// 		evenNumbers();
// 	}

// 	public static void evenNumbers()
// 	{
// 		if (num%2==0)
// 		{
// 			System.out.print(num+" ");
// 		}

// 		num++;
// 		if(num>100)
// 			return;
// 		evenNumbers();
// 	}
// }

class EvenNumber
{
	 static int num = 1;
	public static void main(String[] args) 
	{
		 evenNumber();
	}

	public static void evenNumber()
	{
		if(num>100)
			return;
		if (num%2==0) 
			System.out.print(num+ " ");
		num++;

		evenNumber();
	}
}

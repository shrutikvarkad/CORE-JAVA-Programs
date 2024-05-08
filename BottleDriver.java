class Bottle 
{
	String material;
	double cap;
	double weight;

	{
		System.out.println("non static block");
	}

	void displayBottle()
	{
		System.out.println(material + " " + cap + " " + weight);
	}
}

class BottleDriver
{
	public static void main(String[] args) 
	{
		Bottle obj1 = new Bottle();
		obj1.displayBottle(); 
	}
}
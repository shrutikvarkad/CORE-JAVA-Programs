// class Laptop
// {
// 	String company;
// 	int ram;
// 	int rom;
// 	String modelNum;
// 	String processor;

// 	public void displayLaptop()
// 	{
// 		System.out.println("**** LAPTOP DETAILS ****");
// 		System.out.println("Company : "+ company);
// 		System.out.println("RAM : "+ram);
// 		System.out.println("ROM : "+rom);
// 		System.out.println("Model Number : "+ modelNum);
// 		System.out.println("Processor : "+processor);
// 	}
// }

// class LaptopDriver
// {
// 	public static void main(String[] args) 
// 	{
// 		Laptop obj = new Laptop();
// 		obj.company= "HP";
// 		obj.ram= 50000;
// 		obj.rom= 8;
// 		obj.ram= 512;
// 		obj.modelNum="HP123";
// 		obj.processor= "i7";
// 		obj.displayLaptop();

// 	}
// }

class LaptopDriver
{
	String company;
	int ram;
	int rom;
	String modelNum;
	String processor;

	public void displayLaptop()
	{
		System.out.println("**** LAPTOP DETAILS ****");
		System.out.println("Company : "+ company);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Model Number : "+ modelNum);
		System.out.println("Processor : "+processor);
	}

	public static void main(String[] args) 
	{
		LaptopDriver obj = new LaptopDriver();
		obj.company= "HP";
		obj.ram= 50000;
		obj.rom= 8;
		obj.ram= 512;
		obj.modelNum="HP123";
		obj.processor= "i7";
		obj.displayLaptop();
		System.out.println();

		LaptopDriver obj2 = new LaptopDriver();
		obj.company= "DELL";
		obj.ram= 50000;
		obj.rom= 8;
		obj.ram= 512;
		obj.modelNum="DELL123";
		obj.processor= "i7";
		obj.displayLaptop();
	}


}

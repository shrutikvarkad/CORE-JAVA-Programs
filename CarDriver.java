class car
{
	String brand;
	String model;
	String engine;
	String type;
	double milage;
	byte seatingCapacity;

	public void displayCar()
	{
		System.out.println(" *** Cars Details ***");
		System.out.println();
		System.out.println(" Brand : "+ brand);
		System.out.println(" model : "+ model);
		System.out.println(" Engine : "+ engine);
		System.out.println(" Type : "+ type);
		System.out.println(" Milage : "+ milage);
		System.out.println(" Seating Capacity : "+ seatingCapacity);
	}
}

class CarDriver
{
	public static void main(String[] args)
	{
		car objt= new car();
		objt.brand= "Audi";
		objt.model= "A56";
		objt.engine= "Automated";
		objt.type= "SUV";
		objt.milage= 16;
		objt.seatingCapacity= 2 ;
		objt.displayCar();
	}
}
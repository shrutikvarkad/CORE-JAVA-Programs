class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatingCap;
	Engine engine = new engine(120,1.2,"petrol",14,4);

	Car(String brand,String model,String type,double price,int seatingCap)
	{
		this.brand = brand;
		this.model= model;
		this.type=type;
		this.price=price;
		this.seatingCap=seatingCap;
	} 

	public void displayCar()
	{
		System.out.println("****** CAR DETAILS*******");
		System.out.println(" Brand : "+ brand);
		System.out.println(" Model : "+ model);
		System.out.println(" Type : "+ type);
		System.out.println(" Price : "+ price);
		System.out.println(" Seating Capacity : "+ seatingCap);
	} 
}

class Engine
{
	double horsepower;
	double capacity;
	String engineType;
	double milage;
	int noOfPiston;

	Engine(double horsepower,double capacity,String engineType,double milage,int noOfPosition)
	{
		this.horsepower=horsepower;
		this.capacity= capacity;
		this.engineType= engineType;
		this.milage= milage;
		this.noOfPiston=noOfPiston;
	}

	public void displayEngine()
	{
		System.out.println("****** ENGINE DETAILS ******");
		System.out.println(" Engine Horse Power : " + this.horsepower);
		System.out.println(" Engine Capacity : "+ this.capacity);
		System.out.println(" Engine Type : "+ this.engineType);
		System.out.println(" Engine milage : " + this.milage);
		System.out.println(" NO of Piston : "+ this.noOfPiston);
	}
}


// Driver Class
class CarDriverRelation
{
	public static void main(String[] args) 
	{
		Car obj = new Car("TATA","NEXON","petrol",900000,5);
		obj.displayCar();
		System.out.println();
		Engine obj2 = new Engine(120,1.2,"petrol",14,4);
		obj2.displayEngine();
	}
}
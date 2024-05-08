class Computer
{
	String brand;
	String color;
	String model;
	int warenty;
    String storage;

    Cpu cpu = new Cpu(16,"I7",8,"UHD Graphics");

    Computer(String brand,String color,String model,int warenty,String storage)
    {
    	this.brand = brand;
    	this.color = color;
    	this.model = model;
    	this.warenty = warenty;
    	this.storage = storage;
    }
    public void displayComputer()
    {
    	System.out.println("* Display Computer *");
    	System.out.println("Brand :"+brand);
    	System.out.println("Color :"+color);
    	System.out.println("Model :"+model);
    	System.out.println("Warrenty :"+warenty);
    	System.out.println("Storage :"+storage);
    }
}

// public void createInstanceOfCpu(int ram,String processor,int rom,String gCard)
// {
// 	cpu = new Cpu(ram,processor,rom,gCard);
// }

class Cpu
{
  int ram;
  String processor;
  int rom;
  String gCard;
  
  Monitor monitor ;

  Cpu(int ram,String processor,int rom,String gCard)
  {
  	this.ram = ram;
  	this.processor = processor;
  	this.rom = rom;
  	this.gCard = gCard;
  }
  public void displayCpu()
  {
  	System.out.println("* Display CPU *");
  	System.out.println("RAM :"+ram);
  	System.out.println("Processor :"+processor);
  	System.out.println("ROM :"+rom);
  	System.out.println("Gcard :"+gCard);
  }

  public void createInstanceMonitor(String displayType,int size,String resolution,double thiskness,double price)
  {
  	monitor = new Monitor(displayType,size,resolution,thiskness,price);
  }
}

class Monitor
{
	String displayType;
	int size;
	String resolution;
	double thiskness;
	double price;
    
    KeyBoard keyboard;

	Monitor(String displayType,int size,String resolution,double thiskness,double price)
	{
		this.displayType = displayType;
		this.size = size;
		this.resolution = resolution;
		this.thiskness = thiskness;
		this.price = price;
	}
	public void displayMonitor()
	{
		System.out.println();
		System.out.println("* Display Monitor *");
		System.out.println("Display Type :"+displayType);
		System.out.println("Size :"+size);
		System.out.println("Resolution :"+resolution);
		System.out.println("Thikness :"+thiskness);
		System.out.println("Price :"+price);
	}

	public void createInstanceKeyBoard(String brand,String type,double size,int noOfKeys,boolean backLight)
	{
		keyboard = new KeyBoard(brand,type,size,noOfKeys,backLight);

	}
}

class KeyBoard
{
	String brand;
	String type;
	double size;
	int noOfKeys;
	boolean backLight;

	Mouse mouse;
	KeyBoard(String brand,String type,double size,int noOfKeys,boolean backLight)
	{
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.noOfKeys = noOfKeys;
		this.backLight = backLight;
	}
	public void displayKeyBoard()
	{
		System.out.println();
		System.out.println("* Display KeyBoard *");
		System.out.println("Brand :"+brand);
		System.out.println("Type :"+type);
		System.out.println("Size :"+size);
		System.out.println("No Of Keys :"+noOfKeys);
		System.out.println("Back Light :"+backLight);
	}

	public void createInstanceMouse(int noOfBottons,String brand,boolean wireless,boolean scroll)
	{
		mouse = new Mouse(noOfBottons,brand,wireless,scroll);
	}
}

class Mouse
{
	int noOfBottons;
	String brand;
	boolean wireless;
	boolean scroll;

	Printer printer;

	Mouse(int noOfBottons,String brand,boolean wireless,boolean scroll)
	{
		this.noOfBottons = noOfBottons;
		this.brand = brand;
		this.wireless = wireless;
		this.scroll = scroll;
	}
	public void displayMouse()
	{
		System.out.println();
		System.out.println("* Display Mouse *");
		System.out.println("No Of Bottons :"+noOfBottons);
		System.out.println("Brand :"+brand);
		System.out.println("Wireless :"+wireless);
		System.out.println("Scroll :"+scroll);
	}

	public void createInstancePrinter(String type,String printingSpeed,double printerCap,double warenty)
	{
		printer = new Printer(type,printingSpeed,printerCap,warenty);
	}
}

class Printer 
{
	String type;
	String printingSpeed;
	double printerCap;
	double warenty;
    
    Speaker speaker;

	Printer(String type,String printingSpeed,double printerCap,double warenty)
	{
		this.type = type;
		this.printingSpeed = printingSpeed;
		this.printerCap = printerCap;
		this.warenty = warenty;
	}

	public void displayPrinter()
	{
		System.out.println();
		System.out.println("** Display Printer *");
		System.out.println("Type :"+type);
		System.out.println("Printing Speed :"+printingSpeed);
		System.out.println("Printing Capacity :"+printerCap);
		System.out.println("Warenty :"+warenty);
	}

	public void ctreateInstanceSpeaker(String type, int noOf, double warranty, boolean wireLess)
	{
		speaker = new Speaker(type,noOf,warranty,wireLess);
	}
}

class Speaker
{
	String brand;
	String type;
	int noOf;
	double warranty;
	boolean wireLess;
    
    Camera camera;

	Speaker( String type, int noOf, double warranty, boolean wireLess)
	{
		this.type = type;
	 	this.noOf = noOf;
	 	this.warranty = warranty;
	 	this.wireLess=wireLess;
	}

    public void displaySpeaker()
	 {
	 	System.out.println();
	 	System.out.println("* Display Speaker **");
		System.out.println("type : " + this.type);
		System.out.println("noOf : " + this.noOf);
		System.out.println("warranty : " + this.warranty);
		System.out.println("wireLess : " + this.wireLess);
	}

	public void createInstanceCamera(String type, int noOfCamera, String quality, String resolution)
	{
		camera = new Camera(type,noOfCamera,quality,resolution);

	}
}


class Camera
{
	
	String type;
	int noOfCamera;
	String quality;
	String resolution;

	Camera(String type, int noOfCamera, String quality, String resolution)
{
	 	
	 	this.type = type;
	 	this.noOfCamera = noOfCamera;
	 	this.quality = quality;
	 	this.resolution=resolution;
	
}
public void displayCamera()
	 {
	 	System.out.println();
	 	System.out.println("* Display Camera **");
		System.out.println("type : " + this.type);
		System.out.println("noOfCamera : " + this.noOfCamera);
		System.out.println("quality : " + this.quality);
		System.out.println("resolution : " + this.resolution);
	}	
}



class ComputerDriver
{
	public static void main(String[] args) 
	{
	 	Computer obj = new Computer("VivoBook_DELL","Black","Computer",2,"5TB");
	 	obj.displayComputer();
	 	System.out.println();
	 	obj.cpu.displayCpu();

	 	obj.cpu.createInstanceMonitor("HD",30,"25px",2,456378);
	 	obj.cpu.monitor.displayMonitor();

	 	obj.cpu.monitor.createInstanceKeyBoard("XUV","Small",21.6,32,true);
	 	obj.cpu.monitor.keyboard.displayKeyBoard();

	 	obj.cpu.monitor.keyboard.createInstanceMouse(3,"UTY",false,true);
	 	obj.cpu.monitor.keyboard.mouse.displayMouse();

	 	obj.cpu.monitor.keyboard.mouse.createInstancePrinter("KGF","Fast",2.1,3.5);
	 	obj.cpu.monitor.keyboard.mouse.printer.displayPrinter();

	 	obj.cpu.monitor.keyboard.mouse.printer.ctreateInstanceSpeaker("TUY",56,3.5,true);
	 	obj.cpu.monitor.keyboard.mouse.printer.speaker.displaySpeaker();

	 	obj.cpu.monitor.keyboard.mouse.printer.speaker.createInstanceCamera("PGM",3,"HD","High");
	 	obj.cpu.monitor.keyboard.mouse.printer.speaker.camera.displayCamera();	

	 	


	 	
	}
}
import java.util.Arrays;
class ProgrammingLanguage
{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extension;

	ProgrammingLanguage(String type,String level,int inventedYear,String founderName,double latestVersion,String extension)
	{
		this.type =type;
		this.level=level;
		this.inventedYear=inventedYear;
		this.founderName=founderName;
		this.latestVersion=latestVersion;
		this.extension=extension;
	}

	public void displayProgrammingLanguage()
	{
		System.out.println("*** Programming Languages ***");
		System.out.println(" Type : "+type);
		System.out.println(" Level : "+level);
		System.out.println(" Invented Year : "+ inventedYear);
		System.out.println(" Founder Name : "+ founderName);
		System.out.println(" Latest Version : "+ latestVersion);
		System.out.println(" Extension : "+ extension);
	}
}

class Java extends ProgrammingLanguage
{
	String [] features;
	boolean platformIndependent;

	Java(String [] features,boolean platformIndependent,String type,String level,int inventedYear,String founderName,double latestVersion,String extension)
	{
		super(type,level,inventedYear,founderName,latestVersion,extension);
		this.features=features;
		this.platformIndependent=platformIndependent;
	}

	public void displayJava()
	{
		System.out.println(" **** JAVA ****");
		System.out.println(" Is it Platform Independent : "+platformIndependent);
		System.out.println(" Features in JAVA : "+ Arrays.toString(features));
	}
}

class SingleLevelInheritance
{
	public static void main(String[] args) 
	{
		String [] features = {" 1. MultiThreded"," 2. Secure and Robust ", " 3. Portable"};
		Java obj= new Java(features,true,"Object Oriented"," High Level ",1991," Jeames Gosling ",22,".java");
		obj.displayProgrammingLanguage();
		obj.displayJava();
	}
}
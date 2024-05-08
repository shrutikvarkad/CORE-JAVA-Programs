class Human{
	String name,gender;

	void eat(){
		System.out.println("  Human can eat");
	}
	void walk(){
		System.out.println("  Human can walk");
	}
	void think(){
		System.out.println("  Human can think");
	}
	void speak(){
		System.out.println("  Human can speak");
	}
	Human(String name,String gender){
		//super();
		this.name=name;
		this.gender=gender;
	}

	public void displayHuman(){
		System.out.println(" *** Human Details **");
		System.out.println(" Human name=  "+name);
		System.out.println(" Human gender= "+this.gender);
	}
}

class Graduation extends Human
{
	String course;
	int duration;
	String branch,university;
	int yop;

	Graduation(String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(name,gender);
		this.course = course;
		this.duration=duration;
		this.branch=branch;
		this.university=university;
		this.yop=yop;
	}

	public void displayGraduation()
	{
		System.out.println();
		System.out.println("**** Graduation Details ****");
		System.out.println(" Course : "+ course);
		System.out.println(" Duration : "+duration);
		System.out.println(" Branch : "+ branch);
		System.out.println(" University : "+university);
		System.out.println(" YOP : "+yop);
	}
}

class PostGraduation extends Graduation
{
	String specializationpg,universitypg;
	int durationpg,yoppg;

	PostGraduation(String specializationpg,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(course,duration,branch,university,yop,name,gender);
		this.specializationpg=specializationpg;
		this.durationpg=durationpg;
		this.yoppg=yoppg;
		this.universitypg=universitypg;
	}

	public void displayPostGraduation()
	{
		System.out.println();
		System.out.println(" *** PostGraduation Details ***");
		System.out.println(" Specialization : "+ specializationpg);
		System.out.println(" Duration : "+ durationpg);
		System.out.println(" YOP : " + yoppg);
		System.out.println(" University Type : "+ universitypg);
	}
}

class Job extends PostGraduation
{
	String company;
	double salary;
	String designation;
	String location;

	Job(String company, double salary, String designation, String location,String specializationpg,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(specializationpg,durationpg,yoppg,universitypg,course,duration,branch,university,yop,name,gender);
		this.company = company;
		this.salary = salary;
		this.designation= designation;
		this.location= location;
	}

	public void displayJob()
	{
		System.out.println( );
		System.out.println("* JOB DETAILS *");
		System.out.println(" Company Name : "+this.company);
		System.out.println(" Salary : "+this.salary + " lakhs");
		System.out.println(" Desigation : "+this.designation);
		System.out.println(" Location : "+this.location);
	}
}
class HumanDriver
{
	public static void main(String[] args) 
	{
		Job obj = new Job(" TCS",7.2," ASS. S/W Developer","Pune","MCA",2,2025,"SPPU","Bachleor in Computer",2,"BCA","SPPU",2022,"VACKYY","Male");
		obj.displayHuman();
		obj.eat();
		obj.walk();
		obj.think();
		obj.speak();
		obj.displayGraduation();
		obj.displayPostGraduation();
		obj.displayJob();
	}
}
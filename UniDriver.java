// UNIVERSITY
class University
{
	String name;
	String uniCode;
	int noOfClg;
	String type;
	int establishedYear;
	int course;
	clg clg1;

	University(String name, String uniCode, int noOfClg, String type,int establishedYear, int course)
	{
		System.out.println();
		this.name = name ;
		this.uniCode = uniCode;
		this.noOfClg = noOfClg;
		this.type = type;
		this.establishedYear = establishedYear;
		this.course = course;
	}

	public void displayUniversity()
	{
		System.out.println(" ***** University Details *****");
		System.out.println(" Name : "+ this.name);
		System.out.println(" University Code : "+ this.uniCode);
		System.out.println(" NO of Clg : "+ this.noOfClg);
		System.out.println(" Type : "+ this.type);
		System.out.println(" Established Year : "+ this.establishedYear);
		System.out.println(" Courses : "+ this.course);
	}

	public void createIntanceOfClg(String name, String clgCode, String address, int noOfDept, char grade, int staffCount)
	{
		 clg1 = new clg(name,clgCode,address,noOfDept,grade,staffCount);
	}
}


//COLLEGE
class clg
{
	String name;
	String clgCode;
	String address;
	int noOfDept;
	char grade;
	int staffCount;
	Dept dept1;

	clg(String name, String clgCode, String address, int noOfDept, char grade, int staffCount)
	{
		System.out.println();
		this.name = name ;
		this.clgCode= clgCode;
		this.address= address;
		this.noOfDept= noOfDept;
		this.grade= grade;
		this.staffCount= staffCount;
	}

	public void displayClg()
	{
		System.out.println(" ***** College Details *****");
		System.out.println(" Name : "+ this.name);
		System.out.println(" College Code : "+ this.clgCode);
		System.out.println(" Address : "+ this.address );
		System.out.println(" NO of Dept : "+ this.noOfDept);
		System.out.println(" Grade : "+ this.grade);
		System.out.println(" Staff Count : "+ this.staffCount);
	}
	public void createIntanceOfDept(String name,String hod,int classRoom,int staff,int subject)
	{
		 dept1 = new Dept(name,hod,classRoom,staff,subject);
	}
}


//DEPT
class Dept
{
	String name;
	String hod;
	int classRoom;
	int staff;
	int subject;
	Trainer trainer1; 
	

	Dept(String name,String hod,int classRoom,int staff,int subject)
	{
		this.name = name ;
		this.hod= hod;
		this.classRoom= classRoom;
		this.staff= staff;
		this.subject=subject;
	}

	public void displayDept()
	{
		System.out.println();
		System.out.println(" ***** Department Details *****");
		System.out.println(" Name : "+ this.name);
		System.out.println("  HOD : "+ this.hod);
		System.out.println(" NO of Class Rooms : "+ this.classRoom);
		System.out.println(" Staff  : "+ this.staff);
		System.out.println(" Subjects : "+ this.subject);
	}

	public void createIntanceOfTrainer(String name,String subject,int phoneNum,String qualification,int experience)
	{
		trainer1 = new Trainer(name,subject,phoneNum,qualification,experience);
	}
}


//TRAINER
class Trainer
{
	String name;
	String subject;
	int phoneNum;
	String qualification;
	int experience;
	

	Trainer(String name,String subject,int phoneNum,String qualification,int experience)
	{
		this.name = name ;
		this.subject= subject;
		this.phoneNum= phoneNum;
		this.qualification= qualification;
		this.experience=experience;
	}

	public void displayTrainer()
	{
		System.out.println();
		System.out.println(" ***** Trainer Details *****");
		System.out.println(" Name : "+ this.name);
		System.out.println("  Subject : "+ this.subject);
		System.out.println(" Phone Number : "+ this.phoneNum);
		System.out.println(" Qualification  : "+ this.qualification);
		System.out.println(" Experience : "+ this.experience);
	}
}


//MAIN
class UniDriver
{
	public static void main(String[] args) 
	{
		University ob1= new University("Sppu","w122",12,"A",1915,53);
		ob1.displayUniversity();

		ob1.createIntanceOfClg("BMCC","BM12","FC Road, Pune .",12,'A',45);
		ob1.clg1.displayClg();

		ob1.clg1.createIntanceOfDept("IDSS","Dr. Avi",15,28,19);
		ob1.clg1.dept1.displayDept();

		ob1.clg1.dept1.createIntanceOfTrainer("Rohit","Chem",987456310,"MSc Chem",5);
		ob1.clg1.dept1.trainer1.displayTrainer();
	}
}
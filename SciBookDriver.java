class SciBook
{
	int pages;
	int chapters;
	double price;

	SciBook(int pages,int chapters,double price)
	{
		this.pages = pages;
		this.chapters = chapters;
		this.price = price;
	}

	void displaySciBook()
	{
		System.out.println(" *** SciBook Details *** ");
		System.out.println(" Pages : "+ pages);
		System.out.println(" Chapters " + chapters);
		System.out.println(" Price : " + price);

	}
}

class SciBookDriver
{
	public static void main(String[] args) 
	{
		SciBook obj1 = new SciBook(152,14,120);
		obj1.displaySciBook();
	}
}
//write a java program to find the area of the circle whose radius is 2.5 cm.

class AreaCircle
{
	public static void main(String [] args)
	{
		double radius = 2.5 ;
		final double pi = 3.14 ;
		double area = pi * (radius*radius) ;
		System.out.println("Area of Circle is " + area + "cm^2");
	}
}